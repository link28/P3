package edu.tecii.andrioid.p3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Num_Decimal;
    private TextView hora,minuto,desimas,segundo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num_Decimal=(EditText)findViewById(R.id.NumDec);
        hora=(TextView)findViewById(R.id.Hora);
        minuto=(TextView)findViewById(R.id.Minuto);
        segundo=(TextView)findViewById(R.id.Segundo);
        desimas=(TextView)findViewById(R.id.Desimas);

    }

    public void convertir (View view){

        String numreal=Num_Decimal.getText().toString();
        int Hora, Minuto, Segundo, Desimas;
        double a=Double.parseDouble(numreal);


        Hora=(int)(a);
        a=(a-Hora)*60;
        Minuto=(int)(a);
        a=(a-Minuto)*60;
        Segundo=(int)(a);
        a=(a-Segundo)*60;
        Desimas=(int)(a);

        String r="";
        String r1="";
        String r2="";
        String r3="";

        r="Total de Horas:"+Hora+ "\n";
        r1="Total de Minutos:"+Minuto+ "\n";
        r2="Total de Segundos:"+Segundo+ "\n";
        r3="Total de Desimas:"+Desimas+ "\n";


        hora.setText(r);
        minuto.setText(r1);
        segundo.setText(r2);
        desimas.setText(r3);


    }
}
