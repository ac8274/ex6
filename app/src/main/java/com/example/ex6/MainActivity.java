package com.example.ex6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Random ran = new Random();
    private int i=0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button reseter;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private TextView text1;
    private TextView text2;
    private EditText text3;
    private TextView text4;
    private TextView text5;
    private EditText text6;
    private TextView text7;
    private TextView text8;
    private EditText text9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        reseter = findViewById(R.id.reseter);
        img1 = findViewById(R.id.image1);
        img2 = findViewById(R.id.image2);
        img3 = findViewById(R.id.image3);
        text1 = findViewById(R.id.num1);
        text2 = findViewById(R.id.num2);
        text3 = findViewById(R.id.num3);
        text4 = findViewById(R.id.num4);
        text5 = findViewById(R.id.num5);
        text6 = findViewById(R.id.num6);
        text7 = findViewById(R.id.num7);
        text8 = findViewById(R.id.num8);
        text9 = findViewById(R.id.num9);

        int rando1 = ran.nextInt(89) + 10;
        String str = ""+rando1;
        text1.setText(str);
        rando1 = ran.nextInt(89) + 10;
        str = ""+rando1;
        text2.setText(str);
    }

    public void firstCheck(View view) {
        if(i==0)
        {
            i+=1;
            int nume1 = Integer.parseInt((text1.getText()).toString());
            int nume2 = Integer.parseInt((text2.getText()).toString());
            int nume3 = Integer.parseInt((text3.getText()).toString());
            String str = ""+nume3;
            text4.setText(str);
            int rando = ran.nextInt(90)+10;
            str = ""+rando;
            text5.setText(str);
            if(nume1+nume2==nume3)
            {
                img1.setImageResource(R.drawable.yes);
            }
            else
            {
                img1.setImageResource(R.drawable.no);
            }
        }
    }

    public void secondCheck(View view) {
        if(i==1)
        {
            i+=1;
            int nume1 = Integer.parseInt((text4.getText()).toString());
            int nume2 = Integer.parseInt((text5.getText()).toString());
            int nume3 = Integer.parseInt((text6.getText()).toString());
            String str = ""+nume3;
            text7.setText(str);
            int rando = ran.nextInt(90)+10;
            str = ""+rando;
            text8.setText(str);
            if(nume1+nume2==nume3)
            {
                img2.setImageResource(R.drawable.yes);
            }
            else
            {
                img2.setImageResource(R.drawable.no);
            }
        }
    }

    public void thirdCheck(View view) {
        if(i==2) {
            i+=1;
            int nume1 = Integer.parseInt((text7.getText()).toString());
            int nume2 = Integer.parseInt((text8.getText()).toString());
            int nume3 = Integer.parseInt((text9.getText()).toString());
            if (nume1 + nume2 == nume3) {
                img3.setImageResource(R.drawable.yes);
            }
            else
            {
                img3.setImageResource(R.drawable.no);
            }
        }
    }

    public void reseted(View view) {
        int rando1 = ran.nextInt(89) + 10;
        String str = ""+rando1;
        text1.setText(str);
        rando1 = ran.nextInt(89) + 10;
        str = ""+rando1;
        text2.setText(str);
        text3.setText("0");
        text4.setText("0");
        text5.setText("0");
        text6.setText("0");
        text7.setText("0");
        text8.setText("0");
        text9.setText("0");
        img1.setImageResource(R.drawable.white);
        img2.setImageResource(R.drawable.white);
        img3.setImageResource(R.drawable.white);
        i=0;
    }
}