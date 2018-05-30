package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Selec_personajes extends AppCompatActivity {

    Button Iniciar;
    EditText edtUsuario;
    TextView select;
    ImageButton spider,superman,deadpool,venom,capame,ironman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selec_personajes);


        select=(TextView)findViewById(R.id.txtseleccion);
        Iniciar=(Button)findViewById(R.id.btniniciar);
        edtUsuario=(EditText)findViewById(R.id.Nombre_jugador);

        deadpool=(ImageButton)findViewById(R.id.imgdeadpool);
        spider=(ImageButton)findViewById(R.id.imgspider);
        superman=(ImageButton)findViewById(R.id.imgsuperman);
        venom=(ImageButton)findViewById(R.id.imgvenom);
        capame=(ImageButton)findViewById(R.id.imgcapitan);
        ironman=(ImageButton)findViewById(R.id.imgironman);

        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentIniciarSesion = new Intent(getApplicationContext(), Tablero.class);
                intentIniciarSesion.putExtra("usuario",edtUsuario.getText().toString());

                intentIniciarSesion.putExtra("personaje",select.getText().toString());
                startActivity(intentIniciarSesion);
            }
        });


        spider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select.setText(R.string.spider);


            }
        });

        superman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select.setText(R.string.superman);


            }
        });

        venom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select.setText(R.string.venom);


            }
        });
        deadpool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select.setText(R.string.deadpool);


            }
        });
        capame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select.setText(R.string.capame);


            }
        });
        ironman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select.setText(R.string.ironman);

            }
        });
    }



}
