package br.com.fcunha.componentesbasicos;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SeekBarActivity extends AppCompatActivity {
    private SeekBar barra;
    private TextView valor;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        valor = findViewById(R.id.tvValor);
        texto = findViewById(R.id.tvTexto);
        barra = findViewById(R.id.sbVolume);


        barra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                valor.setText(Integer.toString(barra.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                texto.setText("Começou...");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                texto.setText("Parou.");
            }
        });

    }
}
