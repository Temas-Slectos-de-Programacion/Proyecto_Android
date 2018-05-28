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
    TextView txtQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador);

        //barrbusq = (Toolbar) findViewById(R.id.barra_buscador);
        //sensorBT = (Switch) findViewById(R.id.swtSensor);
        btnUp = (Button) findViewById(R.id.btnUp);
        btnDown = (Button) findViewById(R.id.btnDown);
        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnRight = (Button) findViewById(R.id.btnRight);

        btnUp.setOnClickListener(OnClickSubir);
        btnDown.setOnClickListener(OnClickBajar);
        btnLeft.setOnClickListener(OnClickIzquierda);
        btnRight.setOnClickListener(OnClickDerecha);

        //sensorBT.setOnLongClickListener(OnLongClickSwitch);

        º

        //setSupportActionBar(barrbusq);
    }




    public View.OnClickListener OnClickSubir = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        }
    };

    public View.OnClickListener OnClickBajar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        }
    };

    public View.OnClickListener OnClickIzquierda = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        }
    };

    public View.OnClickListener OnClickDerecha = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        }
    };







}
