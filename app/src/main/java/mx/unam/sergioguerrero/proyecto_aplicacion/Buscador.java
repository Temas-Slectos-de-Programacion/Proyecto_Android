package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class Buscador extends AppCompatActivity {

    Toolbar barrbusq;
    Switch sensorBT;
    Button btnUp;
    Button btnDown;
    Button btnLeft;
    Button btnRight;
    TextView txtQS;
    TextView txtQR;
    int intentosRealizados = 0;
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final int CODIGO_SOLICITUD_HABILITAR_BLUETOOTH = 0;
    private static final int CODIGO_SOLICITUD_PERMISO = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador);

        barrbusq = (Toolbar) findViewById(R.id.barra_buscador);
        sensorBT = (Switch) findViewById(R.id.swtSensor);
        btnUp = (Button) findViewById(R.id.btnUp);
        btnDown = (Button) findViewById(R.id.btnDown);
        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnRight = (Button) findViewById(R.id.btnRight);

        btnUp.setOnClickListener(OnClickSubir);
        btnDown.setOnClickListener(OnClickBajar);
        btnLeft.setOnClickListener(OnClickIzquierda);
        btnRight.setOnClickListener(OnClickDerecha);

        //Desactivar primero el botón antes de tres intentos

        if(intentosRealizados > 3){
            btnDown.isEnabled();
        }

        sensorBT.setOnLongClickListener(OnLongClickSwitch);

        Bundle parametrosS = this.getIntent().getExtras();//getResources Extraer la cadena del nombre de la variable
        String preguntaS = parametrosS.getString(getResources().getString(R.string.var_pregunta_t1));
        txtQS.setText(txtQS.getText().toString() + " " + preguntaS);

        Bundle parametrosR = this.getIntent().getExtras();//getResources Extraer la cadena del nombre de la variable
        String preguntaR = parametrosR.getString(getResources().getString(R.string.var_pregunta_t2));
        txtQR.setText(txtQR.getText().toString() + " " + preguntaR);

        //setSupportActionBar(barrbusq);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.mAcercaDe:
                Intent intentacercadatos = new Intent(getApplicationContext(),AcercaDeDialogo.class);
                startActivity(intentacercadatos);

                //Toast.makeText(getApplicationContext(),"Acerca de",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mDispositivos:
                Toast.makeText(getApplicationContext(),"Dispositivos Disponibles",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBuscar:
                Toast.makeText(getApplicationContext(),"Buscar",Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public View.OnClickListener OnClickSubir = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentdatos = new Intent(getApplicationContext(),EnviarPregunta.class);
            startActivity(intentdatos);
            intentosRealizados = intentosRealizados + 1;
        }
    };

    public View.OnClickListener OnClickBajar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentdatos = new Intent(getApplicationContext(),Adivina.class);
            startActivity(intentdatos);
        }
    };

    public View.OnClickListener OnClickIzquierda = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentdatos = new Intent(getApplicationContext(),EnviarPregunta.class);
            startActivity(intentdatos);
            intentosRealizados = intentosRealizados + 1;
        }
    };

    public View.OnClickListener OnClickDerecha = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentdatos = new Intent(getApplicationContext(),EnviarPregunta.class);
            startActivity(intentdatos);
            intentosRealizados = intentosRealizados + 1;
        }
    };

    private View.OnLongClickListener OnLongClickSwitch = new View.OnLongClickListener(){
        @Override
        public boolean onLongClick(View view) {
            Log.v(TAG,"onLongClick");
            sensorBT.setChecked(!sensorBT.isChecked());
            switchB();
            return true;
        }
    };

    private void switchB() {
        solicitarPermiso();

        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if(bluetoothAdapter == null){
            Toast.makeText(getApplicationContext(), "Tu dispositivo no tiene Bluetooth", Toast.LENGTH_LONG).show();
        }
        if (!sensorBT.isChecked()) {
            //Toast.makeText(getApplicationContext(), "Desactivado", Toast.LENGTH_SHORT).show();
            if(bluetoothAdapter.isEnabled()){
                bluetoothAdapter.disable();
            }
        } else {
            //Toast.makeText(getApplicationContext(), "Activado", Toast.LENGTH_SHORT).show();
            if(!bluetoothAdapter.isEnabled()) {
                Intent intentHabilitarBlue = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(intentHabilitarBlue, CODIGO_SOLICITUD_HABILITAR_BLUETOOTH);
            }
        }
    }

    public void onHabilitarBluetooth(View v)
    {
        solicitarPermiso();

        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if(bluetoothAdapter == null){
            Toast.makeText(getApplicationContext(), "Tu dispositivo no tiene Bluetooth", Toast.LENGTH_LONG).show();
        }
        if(!bluetoothAdapter.isEnabled()){
            Intent intentHabilitarBlue = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(intentHabilitarBlue,CODIGO_SOLICITUD_HABILITAR_BLUETOOTH);
        }

        if(bluetoothAdapter.isEnabled()){
            bluetoothAdapter.disable();
        }

    }

    public boolean VerificarEstadoPermiso(){
        int resultado = ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.BLUETOOTH);
        //siempre que se requiera permiso de hardware se usa esta ruta
        if (resultado == PackageManager.PERMISSION_GRANTED){
            return true;
        }
        else{
            return false;
        }
    }

    public void solicitarPermiso(){
        if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.BLUETOOTH))
        {
            Toast.makeText(getApplicationContext(),"Se le otrogó a la aplicación permiso para usar Bluetooth",Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.BLUETOOTH},CODIGO_SOLICITUD_PERMISO);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        //super.onRequestPermissionsResult(requestCode, permissions, grantResults); //no lo utilizaremos
        switch (requestCode){
            case CODIGO_SOLICITUD_PERMISO:
                if(VerificarEstadoPermiso()){
                    //Toast.makeText(getApplicationContext(), "Ya esta activo el permiso", Toast.LENGTH_SHORT).show();
                } else {
                    //Toast.makeText(getApplicationContext(), "El permiso no esta activo", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

}
