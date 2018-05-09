package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnviarPregunta extends AppCompatActivity {

    Button btnEnviar;
    EditText edtQ; //Editar pregunta

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_pregunta);

        btnEnviar = (Button) findViewById(R.id.btnSQ);
        edtQ = (EditText) findViewById(R.id.edtQ);

        btnEnviar.setOnClickListener(OnClickAcepted);
    }

    public View.OnClickListener OnClickAcepted= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentdatos = new Intent(getApplicationContext(),Buscador.class);
            //putextra(Nombre variable, Valor) Envía valores entre Actividades
            intentdatos.putExtra(getResources().getString(R.string.var_pregunta_t1),edtQ.getText().toString());
            startActivity(intentdatos);
        }
    };
}
