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
    Button btnModoExtremo;
    ImageView imgagen_v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd_usuarios",null, 1);

        btnIniciaJuego = (Button)findViewById(R.id.btnIniciaJuego);
        btnIniciaJuego.setOnClickListener(onClickBuscador);

        btnVerPersonajes = (Button)findViewById(R.id.btnVerPersonajes);
        btnVerPersonajes.setOnClickListener(onClickAcercaDD);

        btnModoExtremo = (Button) findViewById(R.id.btnModoExtremo);
        btnModoExtremo.setOnClickListener(onClickModoExtremo);


    }

    public View.OnClickListener onClickBuscador = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentInijuego = new Intent(getApplicationContext(),Selec_personajes.class);
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

    public View.OnClickListener onClickModoExtremo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentModoExtremo = new Intent(getApplicationContext(), RegistroUsuarios.class);
            startActivity(intentModoExtremo);
        }
    };

}
