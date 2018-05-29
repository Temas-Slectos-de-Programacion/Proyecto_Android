package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static mx.unam.sergioguerrero.proyecto_aplicacion.R.drawable.boton_ver_personajes;
import static mx.unam.sergioguerrero.proyecto_aplicacion.R.drawable.goku;
import static mx.unam.sergioguerrero.proyecto_aplicacion.R.drawable.spiderman1;
import static mx.unam.sergioguerrero.proyecto_aplicacion.R.drawable.tache;

public class Tablero extends AppCompatActivity {
    ImageButton spider,superman,deadpool,venom,capame,ironman,goku,wol;
    ImageView personaje;
    TextView txtusuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);


        Bundle datorecibido=getIntent().getExtras();

            String usuario = datorecibido.getString("usuario");
        txtusuario = (TextView) findViewById(R.id.textUsuario);
        txtusuario.setText(usuario);
        String seleccionpersonaje = datorecibido.getString("personaje");

        spider=(ImageButton)findViewById(R.id.imgspider);
        superman=(ImageButton)findViewById(R.id.imgsuperman);
        deadpool=(ImageButton)findViewById(R.id.imgdeadpool);
        venom=(ImageButton)findViewById(R.id.imgvenom);
        capame=(ImageButton)findViewById(R.id.imgcapitan);
        ironman=(ImageButton)findViewById(R.id.imgironman);
        personaje=(ImageView)findViewById(R.id.imagenPersonaje);
        wol=(ImageButton)findViewById(R.id.imgwol);
        goku=(ImageButton)findViewById(R.id.imggoku);

        switch (seleccionpersonaje) {
            case "Spiderman" :
            {
                personaje.setImageResource(R.drawable.spiderman1);
            break;
            }
            case "Superman":
            {
                personaje.setImageResource(R.drawable.superman1);
            break;
            }
            case "Ironman":
            {
                personaje.setImageResource(R.drawable.ironman);
                break;
            }
            case "Captain America":
            {
                personaje.setImageResource(R.drawable.capitanamerica1);
                break;
            }
            case "Deadpool":
            {
                personaje.setImageResource(R.drawable.deadpool1);
                break;
            }
            case "Venom":
            {
                personaje.setImageResource(R.drawable.venom1);
                break;
            }

           case "Goku":
           {
               personaje.setImageResource(R.drawable.goku);
               break;
           }
           case "Wol":
           {
               personaje.setImageResource(R.drawable.wolverine);
               break;
           }


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
        goku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goku.setImageResource(R.drawable.tache);


            }
        });
        wol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wol.setImageResource(R.drawable.tache);


            }
        });


    }

}
