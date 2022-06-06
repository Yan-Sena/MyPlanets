package br.com.etecia.myplanets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declarar a lista.
    ListView listaPlanetas;
    //C
    String nomePlanetas[] = {"Jupiter", "Lua", "Marte", "Mercurio",
            "Neturno", "Plutão", "Saturno", "Sol", "Terra", "Urano", "Venus"};



    int imagensPlanetas[] = {R.drawable.jupiter, R.drawable.lua, R.drawable.marte, R.drawable.mercurio, R.drawable.netuno,
            R.drawable.plutao, R.drawable.saturno, R.drawable.sol, R.drawable.terra, R.drawable.urano, R.drawable.venus};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaPlanetas = findViewById(R.id.idlistaPlanetas);

        MyAdapter adapter = new MyAdapter();

        listaPlanetas.setAdapter(adapter);


    }//OnCreate

    //Criando uma classe interna - inner class
    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imagensPlanetas.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //Declarara componentes do componentesa que serão utilizados na lista
            ImageView imgPlanetas;
            TextView txtPlanetas;
            CardView cardPlanetas;

            View view1 = getLayoutInflater().inflate(R.layout.modelo_planetas,null);

            txtPlanetas = view1.findViewById(R.id.txtModeloPlaneta);
            imgPlanetas = view1.findViewById(R.id.imgModeloPlaneta);

            //Implementar m´wtodos nos componentes

            txtPlanetas.setText(nomePlanetas[i]);
            imgPlanetas.setImageResource(imagensPlanetas[i]);
            imgPlanetas.setImageResource(imagensPlanetas[i]);


            return null;
        }
    } //Adapter


}