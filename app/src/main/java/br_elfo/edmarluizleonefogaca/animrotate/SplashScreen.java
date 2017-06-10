package br_elfo.edmarluizleonefogaca.animrotate;

/**
 * Created by EdmarLuiz on 03/06/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
    // Timer da splash screen
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            /*
             * Exibindo splash com um timer.
             */
            @Override
            public void run() {
                // Esse método será executado sempre que o timer acabar
                // E inicia a activity principal
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

                //overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

                // Fecha esta activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}