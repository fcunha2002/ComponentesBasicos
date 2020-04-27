package br.com.fcunha.componentesbasicos;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class Component2Activity extends AppCompatActivity {
    private Switch voltaSexta;
    private ToggleButton gostouAula;
    private TextView textoVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component2);

        voltaSexta = findViewById(R.id.swVoltaSexta);
        gostouAula = findViewById(R.id.tbGostouAula);
        textoVerificar = findViewById(R.id.tvVerificar);
    }

    public void verificar(View view) {
        String msg="";

        if(voltaSexta.isChecked()){
           msg = "Vai voltar na sexta.";
        } else {
            msg = "Não vai voltar na sexta.";
        }

        if(gostouAula.isChecked()){
            msg = msg + "\nGostou da aula.";
        } else {
            msg = msg + "\nNão gostou da aula.";
        }

        textoVerificar.setText(msg);

//        Toast.makeText(this, "Obrigado!", Toast.LENGTH_SHORT).show();

//        Toast t = Toast.makeText(this, "Obrigado!", Toast.LENGTH_LONG);
//        t.setGravity(Gravity.TOP, -200, 50);
//        t.show();


//        ImageView image = new ImageView(this);
//        image.setImageResource(R.drawable.app_lagosta_edit);
//
//        Toast t = new Toast(this);
//        t.setDuration(Toast.LENGTH_LONG);
//        t.setView(image);
//        t.setGravity(Gravity.CENTER_HORIZONTAL,0, 0);
//        t.show();


    }
}


/*
Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();

        ImageView image = new ImageView(getApplicationContext());
        image.setImageResource(android.R.drawable.star_big_on);

        Toast t = new Toast(getApplicationContext());
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(image);
        t.setGravity(Gravity.CENTER_HORIZONTAL,0, 0);
        t.show();
 */
