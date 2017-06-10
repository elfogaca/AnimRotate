package br_elfo.edmarluizleonefogaca.animrotate;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity implements Animation.AnimationListener {
    ImageView logo;
    Button rotatebtn;
    Animation animation;

   // private static int WELCOME_TIMEOUT = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        logo = (ImageView) findViewById(R.id.imageView);
        rotatebtn= (Button) findViewById(R.id.button);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);
        // set animation listener
        animation.setAnimationListener(MainActivity.this);
        rotatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logo.setVisibility(View.VISIBLE);
                logo.startAnimation(animation);
            }
        });

      /*  new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent welcome = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(welcome);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                finish();
            }
        }, WELCOME_TIMEOUT);*/

    }

    @Override
    public void onAnimationStart(Animation animation) {
    }
    @Override
    public void onAnimationEnd(Animation animation) {
    }
    @Override
    public void onAnimationRepeat(Animation animation) {
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}