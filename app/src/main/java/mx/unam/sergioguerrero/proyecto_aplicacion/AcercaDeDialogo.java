package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class AcercaDeDialogo extends AppCompatActivity {

    ImageButton wol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de_dialogo);

        wol = (ImageButton) findViewById(R.id.ibtnwol);


    }



}
