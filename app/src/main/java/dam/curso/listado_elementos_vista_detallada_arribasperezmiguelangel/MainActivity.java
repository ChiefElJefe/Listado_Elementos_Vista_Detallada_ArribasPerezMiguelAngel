package dam.curso.listado_elementos_vista_detallada_arribasperezmiguelangel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView vistaRejilla;
    ArrayList<CourseModel> listaTarjetas;
    CourseGVAdapter adaptador;
    Intent pasoPagina;
    Pagina pag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pasoPagina = new Intent(getApplicationContext(), MainActivity2.class);

        vistaRejilla = findViewById(R.id.idgvCSM);
        listaTarjetas = new ArrayList<CourseModel>();

        listaTarjetas.add(new CourseModel("Perro y Motosierra", R.drawable.csm1re));
        listaTarjetas.add(new CourseModel("Motosierra vs. Murciélago", R.drawable.csm2re));
        listaTarjetas.add(new CourseModel("M**** a Denji", R.drawable.csm3re));
        listaTarjetas.add(new CourseModel("La pistola es más Poderosa", R.drawable.csm4re));
        listaTarjetas.add(new CourseModel("Menor", R.drawable.csm5re));
        listaTarjetas.add(new CourseModel("Boom Boom Boom", R.drawable.csm6re));
        listaTarjetas.add(new CourseModel("En un Sueño", R.drawable.csm7re));
        listaTarjetas.add(new CourseModel("Super Lío", R.drawable.csm8re));
        listaTarjetas.add(new CourseModel("Baño", R.drawable.csm9re));
        listaTarjetas.add(new CourseModel("Sentimientos de un P****", R.drawable.csm10re));

        adaptador = new CourseGVAdapter(getApplicationContext(), listaTarjetas);
        vistaRejilla.setAdapter(adaptador);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        vistaRejilla.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                pag = new Pagina(position);
                pasoPagina.putExtra("pag", pag);
                startActivity(pasoPagina);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}