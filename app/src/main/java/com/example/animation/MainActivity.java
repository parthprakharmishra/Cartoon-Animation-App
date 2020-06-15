package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean show=true;
public void Animate(View v)
    {
        ImageView iv1 = (ImageView) findViewById(R.id.mickeyMouse);
        ImageView iv2 = (ImageView) findViewById(R.id.Tom);
        iv1.animate().rotation(1800).alpha(0).setDuration(2000);
        iv2.animate().rotation(1800).alpha(1).setDuration(3000);

       /* if(show)
        {
            show=false;
            iv1.animate().alpha(0).setDuration(2000);
            iv2.animate().alpha(1).setDuration(3000);
        }
        else
        {
            show=true;
            iv1.animate().alpha(1).setDuration(2000);
            iv2.animate().alpha(0).setDuration(3000);
        }*/

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
