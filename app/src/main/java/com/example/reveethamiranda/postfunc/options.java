package com.example.reveethamiranda.postfunc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Reveetha Miranda on 29-03-2018.
 */

public class options extends Activity {
    Button txt,img;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_activity);
        img = (Button) findViewById(R.id.btnCamera);
        txt = (Button) findViewById(R.id.btnText);

    }
    public void onClick(View v)
        {
            switch (v.getId()){
                case R.id.btnText:
                {
                    Intent intent = new Intent(options.this, textUpdate.class);
                    startActivity(intent);}
                break;

                case R.id.btnCamera:
                {
                    Intent intent = new Intent(options.this, Main2Activity.class);
                    startActivity(intent);}
                    break;

            }
            }
        }
