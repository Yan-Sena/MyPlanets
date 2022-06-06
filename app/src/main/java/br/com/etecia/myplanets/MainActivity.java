package br.com.etecia.myplanets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Declarar a lista.
    ListView listaPlanetas;
    //C
    String nomePlanetas[] = {"Jupiter","Lua","Marte","Mercurio",
                "Neturno","Plutão","Saturo","Sol","Terra","Urano","Venus"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaPlanetas = findViewById(R.id.idlistaPlanetas);

        MyAdapter adapter = new MyAdapter();

        listaPlanetas.setAdapter();


    }//OnCreate
    //Criando uma classe interna - inner class
    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
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
            return null;
        }
    }


}