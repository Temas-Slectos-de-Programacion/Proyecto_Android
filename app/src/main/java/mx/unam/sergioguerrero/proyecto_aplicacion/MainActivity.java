package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    Button btnIniciaJuego;
    Button btnVerPersonajes;
    ImageView imgagen_v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciaJuego = (Button)findViewById(R.id.btnIniciaJuego);
        btnIniciaJuego.setOnClickListener(onClickBuscador);

        btnVerPersonajes = (Button)findViewById(R.id.btnVerPersonajes);
        btnVerPersonajes.setOnClickListener(onClickAcercaDD);
    }

    public View.OnClickListener onClickBuscador = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentInijuego = new Intent(getApplicationContext(),Buscador.class);
            startActivity(intentInijuego);
        }
    };

    public View.OnClickListener onClickAcercaDD = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentAcercaDD = new Intent(getApplicationContext(), AcercaDeDialogo.class);
            startActivity(intentAcercaDD);
        }
    };

}
