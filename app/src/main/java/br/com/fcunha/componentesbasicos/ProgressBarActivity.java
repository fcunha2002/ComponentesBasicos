package br.com.fcunha.componentesbasicos;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class ProgressBarActivity extends AppCompatActivity {
    private ProgressBar barraLinha;
    private ProgressBar barraCurva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        barraLinha = findViewById(R.id.pbLinha);
        barraCurva = findViewById(R.id.pbCurva);

        barraCurva.setVisibility(View.GONE);
    }


    public void acao(View view) {
        barraCurva.setVisibility(View.VISIBLE);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<=barraLinha.getMax(); i++) {
                    final int progresso = i;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            barraLinha.setProgress(progresso);
                            //Teste para saber se chegou no final
                            if(barraLinha.getProgress()==barraLinha.getMax()){
                                barraCurva.setVisibility(View.GONE);
                            }
                        }
                    });

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();








    }
}
/*
                    final int progresso = i;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            barraLinha.setProgress(progresso);
                            if(barraLinha.getProgress()==barraLinha.getMax()){
                                barraCurva.setVisibility(View.GONE);
                            }
                        }
                    });


 */