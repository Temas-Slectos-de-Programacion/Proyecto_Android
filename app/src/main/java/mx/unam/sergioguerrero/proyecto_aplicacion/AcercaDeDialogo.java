package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AcercaDeDialogo extends AppCompatActivity {

    TextView select2;
    ImageButton wol, deadpool, goku, hamilton, ronaldo, messi, mia, brady, venom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de_dialogo);

        select2 =(TextView)findViewById(R.id.txtdescripcion);

        wol = (ImageButton) findViewById(R.id.ibtnwol);
        deadpool = (ImageButton) findViewById(R.id.ibtndp);
        goku = (ImageButton) findViewById(R.id.ibtngoku);
        hamilton = (ImageButton) findViewById(R.id.ibtnham);
        ronaldo = ( ImageButton) findViewById(R.id.ibtnron);
        messi = (ImageButton) findViewById(R.id.ibtnmessi);
        mia = (ImageButton) findViewById(R.id.ibtnmia);
        brady = (ImageButton) findViewById(R.id.ibtnbrady);
        venom = (ImageButton) findViewById(R.id.ibtnvenom);

        wol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select2.setText(R.string.woldes);


            }
        });

        deadpool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select2.setText(R.string.deadpoodes);


            }
        });

        goku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select2.setText(R.string.gokudes);


            }
        });
        hamilton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select2.setText(R.string.hamiltondes);


            }
        });
        ronaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select2.setText(R.string.ronaldodes);


            }
        });
        messi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select2.setText(R.string.messides);

            }
        });

        mia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select2.setText(R.string.miades);

            }
        });

        brady.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select2.setText(R.string.bradydes);

            }
        });

        venom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select2.setText(R.string.venomdes);

            }
        });


    }



}
