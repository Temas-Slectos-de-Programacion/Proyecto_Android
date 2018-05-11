package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Jugador extends AppCompatActivity {
Button Iniciar;
EditText edtUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugador);


        Iniciar=(Button)findViewById(R.id.btniniciar);
        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intentIniciarSesion = new Intent(getApplicationContext(), Seleccionar_personajes.class);
                startActivity(intentIniciarSesion);


                String Usuario=edtUsuario.getText().toString();

                Usuario.compareTo(getResources().getString(R.string.var_usuario_extra));
                intentIniciarSesion.putExtra(getResources().getString(R.string.var_usuario_extra),edtUsuario.getText().toString());



            }
        });



    }
}
