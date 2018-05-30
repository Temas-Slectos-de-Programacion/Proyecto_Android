package mx.unam.sergioguerrero.proyecto_aplicacion;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import mx.unam.sergioguerrero.proyecto_aplicacion.Utilidades.Utilidades;

/**
 * Created by sergioguerrero on 29/05/18.
 */

public class RegistroUsuarios extends AppCompatActivity {

    EditText campoId,campoNombre,campoPregunta;
    Button btnConsulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuarios);

        campoId= (EditText) findViewById(R.id.campoId);
        campoNombre= (EditText) findViewById(R.id.campoNombre);
        campoPregunta= (EditText) findViewById(R.id.campoPregunta);

        btnConsulta = (Button)findViewById(R.id.btnConsultar);
        btnConsulta.setOnClickListener(onClickConsulta);

    }

    public View.OnClickListener onClickConsulta = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentConsulta = new Intent(getApplicationContext(),ConsultarUsuarios.class);
            startActivity(intentConsulta);
        }
    };


    public void onClick(View view) {
        registrarUsuarios();
        //registrarUsuariosSql();
    }




    private void registrarUsuarios() {
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd_usuarios",null,1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Utilidades.CAMPO_ID,campoId.getText().toString());
        values.put(Utilidades.CAMPO_NOMBRE,campoNombre.getText().toString());
        values.put(Utilidades.CAMPO_PREGUNTA,campoPregunta.getText().toString());

        Long idResultante=db.insert(Utilidades.TABLA_USUARIO,Utilidades.CAMPO_ID,values);

        Toast.makeText(getApplicationContext(),"Id Registro: "+idResultante,Toast.LENGTH_SHORT).show();
        db.close();
    }

}
