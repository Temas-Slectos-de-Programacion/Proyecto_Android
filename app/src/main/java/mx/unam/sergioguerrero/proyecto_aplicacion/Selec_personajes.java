package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Selec_personajes extends AppCompatActivity {

    Button Iniciar;
    EditText edtUsuario;
    ImageButton spider,superman,deadpool,venom,capame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selec_personajes);



        Iniciar=(Button)findViewById(R.id.btniniciar);
        edtUsuario=(EditText)findViewById(R.id.Nombre_jugador);
        spider=(ImageButton)findViewById(R.id.imgspider);
        superman=(ImageButton)findViewById(R.id.imgsuperman);
        venom=(ImageButton)findViewById(R.id.imgvenom);

        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentIniciarSesion = new Intent(getApplicationContext(), Tablero.class);
                startActivity(intentIniciarSesion);


                String Usuario=edtUsuario.getText().toString();



               Usuario.compareTo("usuario");
               intentIniciarSesion.putExtra("usuario",edtUsuario.getText().toString());


            }
        });

        spider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String personaje="spider";


            }
        });

        superman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String personaje="spider";


            }
        });

        venom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String personaje="spider";


            }
        });


    }


}
