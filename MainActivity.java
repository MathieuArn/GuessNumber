package com.example.mathi.guest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    TextView res;
    TextView Statut;

    int numberguess = (int) (100 * Math.random());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        res = (TextView) findViewById(R.id.textViewRes);
        Statut = (TextView) findViewById(R.id.textViewStatut);

        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addChiffre("0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addChiffre("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addChiffre("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addChiffre("3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addChiffre("4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addChiffre("5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addChiffre("6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addChiffre("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addChiffre("8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addChiffre("9");
            }
        });
    }

    public void addChiffre(String str) {
            if(!res.getText().equals("0")){
                str = res.getText() + str;
            }
            if (Integer.parseInt(str) > 100) {
                res.setText("");
            } else {
                res.setText(str);
                GuessNumer(Integer.parseInt(str));
            }
    }

    private void GuessNumer(int nombre){
        if(nombre == numberguess){
            Statut.setTextColor(Color.parseColor("#66CDAA"));
            Statut.setText("BRAVO");

        }
        if(nombre < numberguess){
            Statut.setTextColor(Color.parseColor("#1A4876"));
            Statut.setText("C'est plus " + nombre);
        }
        if(nombre > numberguess){
            Statut.setTextColor(Color.parseColor("#1A4876"));
            Statut.setText("C'est moins " + nombre);
        }
    }
}