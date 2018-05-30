package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static mx.unam.sergioguerrero.proyecto_aplicacion.R.drawable.boton_ver_personajes;
import static mx.unam.sergioguerrero.proyecto_aplicacion.R.drawable.spiderman1;
import static mx.unam.sergioguerrero.proyecto_aplicacion.R.drawable.tache;

public class Tablero extends AppCompatActivity {
    ImageButton spider,superman,deadpool,venom,capame,ironman;
    ImageView personaje;

    TextView txtusuario,mostpregunta;

    Button btnpregunta,Usuario;

    Random r=new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);

        Bundle datorecibido=getIntent().getExtras();

        String usuario = datorecibido.getString("usuario");
        txtusuario = (TextView) findViewById(R.id.textUsuario);
        txtusuario.setText(usuario);
        String seleccionpersonaje = datorecibido.getString("personaje");


        mostpregunta=(TextView)findViewById(R.id.textMostrarpregunta);

        btnpregunta=(Button)findViewById(R.id.btnpregunta);
        Usuario=(Button)findViewById(R.id.btnUsuario);


        spider=(ImageButton)findViewById(R.id.imgspider);
        superman=(ImageButton)findViewById(R.id.imgsuperman);
        deadpool=(ImageButton)findViewById(R.id.imgdeadpool);
        venom=(ImageButton)findViewById(R.id.imgvenom);
        capame=(ImageButton)findViewById(R.id.imgcapitan);
        ironman=(ImageButton)findViewById(R.id.imgironman);
        personaje=(ImageView)findViewById(R.id.imagenPersonaje);

        switch (seleccionpersonaje) {
            case "Spiderman" :
            {
                personaje.setImageResource(R.drawable.spiderman1);
            }break;
            case "Superman":
            {
                personaje.setImageResource(R.drawable.superman1);
            }break;
            case "Ironman":
            {
                personaje.setImageResource(R.drawable.ironman);
            }break;
            case "Captain America":
            {

            }break;
            case "Deadpool":
            {
                personaje.setImageResource(R.drawable.deadpool1);
            }break;
            case "Venom":
            {
                personaje.setImageResource(R.drawable.venom);
            }break;


        }

        spider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                spider.setImageResource(R.drawable.tache);


            }
        });

        superman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              superman.setImageResource(R.drawable.tache);


            }
        });

        venom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                venom.setImageResource(R.drawable.tache);


            }
        });

        capame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                capame.setImageResource(R.drawable.tache);


            }
        });

        ironman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ironman.setImageResource(R.drawable.tache);


            }
        });
        deadpool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                deadpool.setImageResource(R.drawable.tache);


            }
        });

        btnpregunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numero=r.nextInt(10)+1;

                switch (numero)
                {
                    case 1:
                    {
                        mostpregunta.setText(R.string.p1);
                        break;
                    }
                    case 2:
                    {
                        mostpregunta.setText(R.string.p2);
                        break;
                    }
                    case 3:
                    {
                        mostpregunta.setText(R.string.p3);
                        break;
                    }
                    case 4:
                    {
                        mostpregunta.setText(R.string.p4);
                        break;
                    }
                    case 5:
                    {
                        mostpregunta.setText(R.string.p5);
                        break;
                    }
                    case 6:
                    {
                        mostpregunta.setText(R.string.p6);
                        break;
                    }
                    case 7:
                    {
                        mostpregunta.setText(R.string.p7);
                        break;
                    }
                    case 8:
                    {
                        mostpregunta.setText(R.string.p8);
                        break;
                    }
                    case 9:
                    {
                        mostpregunta.setText(R.string.p9);
                        break;
                    }
                    case 10:

                    {

                        mostpregunta.setText(R.string.p2);
                        break;
                    }
                }


            }
        });

        Usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent consulusuario=new Intent(getApplicationContext(),ConsultarUsuarios.class);
                startActivity(consulusuario);
            }
        });
    }

}
