package br.com.fcunha.componentesbasicos;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextView tvSaida;
    private TextInputEditText etNomeProduto;
    private CheckBox cbVermelho;
    private CheckBox cbVerde;
    private CheckBox cbAzul;
    private RadioButton rbSim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSaida = findViewById(R.id.tv_saida);
        etNomeProduto = findViewById(R.id.et_nome_produto);
        cbVermelho = findViewById(R.id.cb_vermelho);
        cbVerde = findViewById(R.id.cb_verde);
        cbAzul = findViewById(R.id.cb_azul);
        rbSim = findViewById(R.id.rb_sim);

    }

    public void salvar(View view) {
        String saida;
        saida = "Produto: " + etNomeProduto.getText().toString();


        if (cbVermelho.isChecked()){
            saida = saida + "\nCor: Vermelho";
        }
        if (cbVerde.isChecked()){
            saida = saida + "\nCor: Verde";
        }
        if (cbAzul.isChecked()){
            saida = saida + "\nCor: Azul";
        }

        if (rbSim.isChecked()){
            saida = saida + "\nDISPONÍVEL EM ESTOQUE";
        }else{
            saida = saida + "\nNÃO DISPONÍVEL EM ESTOQUE";
        }

        tvSaida.setText(saida);
    }
}
