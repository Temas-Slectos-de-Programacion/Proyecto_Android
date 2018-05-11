package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tablero extends AppCompatActivity {
    TextView txtusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);


        Bundle parametros = this.getIntent().getExtras();
        String usuario = parametros.getString(getResources().getString(R.string.var_usuario_extra));
        txtusuario.setText(txtusuario.getText().toString()+""+usuario);


        txtusuario = (TextView) findViewById(R.id.textUsuario);
    }
}
