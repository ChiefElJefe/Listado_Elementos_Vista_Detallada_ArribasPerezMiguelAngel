package dam.curso.listado_elementos_vista_detallada_arribasperezmiguelangel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CourseGVAdapter extends ArrayAdapter<CourseModel> {

    public CourseGVAdapter(@NonNull Context context, ArrayList<CourseModel> courseModelArrayList) {
        super(context, 0, courseModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listitemView = convertView;
        if (listitemView == null) {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.tarjetas_objeto, parent, false);
        }
        CourseModel courseModel = getItem(position);
        TextView nombre_CSM = listitemView.findViewById(R.id.idtxtNombre);
        ImageView imagen_CSM = listitemView.findViewById(R.id.idivcsm);

        nombre_CSM.setText(courseModel.getCourse_name());
        imagen_CSM.setImageResource(courseModel.getImgid());
        return listitemView;
    }
}
