package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static mx.unam.sergioguerrero.proyecto_aplicacion.R.drawable.spiderman1;
import static mx.unam.sergioguerrero.proyecto_aplicacion.R.drawable.tache;

public class Tablero extends AppCompatActivity {
    ImageButton spider,superman,deadpool,venom,capame,ironman,hola;
    TextView txtusuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);

        Bundle parametros = this.getIntent().getExtras();
        String usuario = parametros.getString(getResources().getString(R.string.var_usuario_extra));
        txtusuario.setText(txtusuario.getText().toString()+""+usuario);
        txtusuario = (TextView) findViewById(R.id.textUsuario);


        spider=(ImageButton)findViewById(R.id.imgspider);
        superman=(ImageButton)findViewById(R.id.imgsuperman);
        deadpool=(ImageButton)findViewById(R.id.imgdeadpool);
        venom=(ImageButton)findViewById(R.id.imgvenom);
        capame=(ImageButton)findViewById(R.id.imgcapitan);
        ironman=(ImageButton)findViewById(R.id.imgironman);


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

    }

}
