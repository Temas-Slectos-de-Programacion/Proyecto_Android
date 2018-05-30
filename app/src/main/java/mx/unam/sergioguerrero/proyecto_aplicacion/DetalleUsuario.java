package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import mx.unam.sergioguerrero.proyecto_aplicacion.BaseDeDatos.Usuario;

/**
 * Created by sergioguerrero on 29/05/18.
 */

public class DetalleUsuario extends AppCompatActivity {

    TextView campoId, campoNombre, campoPregunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_usuario);

        campoId = (TextView) findViewById(R.id.campoId);
        campoNombre = (TextView) findViewById(R.id.campoNombre);
        campoPregunta = (TextView) findViewById(R.id.campoPregunta);

        Bundle objetoEnviado=getIntent().getExtras();
        Usuario user=null;

        if(objetoEnviado!=null){
            user= (Usuario) objetoEnviado.getSerializable("usuario");
            campoId.setText(user.getId().toString());
            campoNombre.setText(user.getNombre().toString());
            campoPregunta.setText(user.getPregunta().toString());

        }

    }
}
