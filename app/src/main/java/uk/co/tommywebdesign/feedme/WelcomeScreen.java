package uk.co.tommywebdesign.feedme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen_activity);

        Thread timer =new Thread(){

            public void run(){

                try{
                    sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent beginApplication = new Intent("uk.co.tommy.MAINACTIVITY");
                    startActivity(beginApplication);

                }



            }
        };
            timer.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
