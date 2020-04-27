package br.com.fcunha.componentesbasicos;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
    }

    public void salvar(View view) {

        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        dialogo.setTitle("CONFIRMAÇÃO DE EXCLUSÃO");
        dialogo.setMessage("Confirma exclusão do cadastro?");
        dialogo.setIcon(android.R.drawable.ic_delete);
        dialogo.setCancelable(true);

        dialogo.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext()
                        , "Opção SIM foi selecionada."
                        , Toast.LENGTH_SHORT).show();
            }
        });

        dialogo.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext()
                        , "Opção NÃO foi selecionada."
                        , Toast.LENGTH_SHORT).show();
            }
        });

        dialogo.setNeutralButton("TALVEZ", null);

        dialogo.create();
        dialogo.show();


    }
}

//        dialogo.setNeutralButton("TALVEZ", null);