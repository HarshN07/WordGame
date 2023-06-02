package com.example.wordgame_1;

import androidx.appcompat.app.AppCompatActivity;

import androidx.core.content.res.ResourcesCompat;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;

import android.os.Bundle;

import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity2 extends AppCompatActivity {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,p_again;
    private String word,clue;
    private String temp1="",temp2="";
    private TextView gb;
    private final ArrayList<Character> elements=new ArrayList<>();
    private int index,lives=3;
    private Button reset,check;
    private ImageView info,heart1,heart2,heart3;
    int score=0;
    Animation scaleDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i=getIntent();
        word=i.getStringExtra("str1");
        clue=i.getStringExtra("str2");
        scaleDown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scaledown);

        int i1=0;
        while(i1<word.length()){
            elements.add(word.toLowerCase().charAt(i1));
            i1++;
        }
        while (i1<16){
            Random rand=new Random();
            char al=(char) (rand.nextInt(26)+'a');
            elements.add(al);
            i1++;
        }
        Collections.shuffle(elements);
        Assign();
        gb.setText(temp1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b1);
                b1.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b1.setClickable(false);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b2);
                b2.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b2.setClickable(false);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b2);
                b2.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b2.setClickable(false);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b3);
                b3.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b3.setClickable(false);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b4);
                b4.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b4.setClickable(false);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b5);
                b5.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b5.setClickable(false);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b6);
                b6.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b6.setClickable(false);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b7);
                b7.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b7.setClickable(false);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b8);
                b8.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b8.setClickable(false);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b9);
                b9.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));;
                b9.setClickable(false);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b10);
                b10.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b10.setClickable(false);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b11);
                b11.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b11.setClickable(false);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b12);
                b12.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b12.setClickable(false);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b13);
                b13.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b13.setClickable(false);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b14);
                b14.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b14.setClickable(false);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b15);
                b15.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b15.setClickable(false);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLetter(b16);
                b16.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.purple,null)));
                b16.setClickable(false);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,"Grid Reset", Toast.LENGTH_SHORT).show();
                temp1="";
                for (int a=0;a<word.length();a++){
                    temp1=temp1 + "_ ";
                }
                gb.setText(temp1);
                selectUnselect();
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showCustomDialog();
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scoreCount();
            }
        });
    }
    private void inputLetter(Button txt){
        if(temp1.contains("_ ")){
            index = temp1.indexOf('_');
            temp1 = temp1.substring(0,index) + txt.getText().toString() + temp1.substring(index+1,temp1.length());

            gb.setText(temp1);
        }
        else{
            Toast.makeText(this, "MAX LENGTH", Toast.LENGTH_SHORT).show();
        }
    }
    private void scoreCount() {

        temp2=temp1;
        while(temp2.contains(" ")){
            temp2=temp2.replace(" ","");
        }
        if(!(temp1.contains("_"))){
            if(temp2.equals(word.toLowerCase())){
                Toast.makeText(this, "Your Guess is correct", Toast.LENGTH_SHORT).show();
                if(lives==3){
                    score=score+500;
                }
                else if(lives==2){
                    score+=300;
                }
                else{
                    score+=200;
                }
                showDialog1(score);
            }
            else if(lives==3){
                Collections.shuffle(elements);
                change();
                heart1.setImageResource(R.drawable.greyhrt);
                Toast.makeText(this, "Your guess is wrong", Toast.LENGTH_SHORT).show();
                lives-=1;
            }
            else if(lives==2){
                Collections.shuffle(elements);
                change();
                Toast.makeText(this, "Your guess is wrong", Toast.LENGTH_SHORT).show();
                heart2.setImageResource(R.drawable.greyhrt);
                lives-=1;
            }
            else if(lives==1) {
                Collections.shuffle(elements);
                change();
                Toast.makeText(this, "Your guess is wrong", Toast.LENGTH_SHORT).show();
                heart3.setImageResource(R.drawable.greyhrt);
                lives -= 1;
                showDialog1(score);
            }
        }else{
            Toast.makeText(this, "Enter the right number of characters", Toast.LENGTH_SHORT).show();
        }
    }

    private void Assign(){
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        b10=(Button) findViewById(R.id.button10);
        b11=(Button) findViewById(R.id.button11);
        b12=(Button) findViewById(R.id.button12);
        b13=(Button) findViewById(R.id.button13);
        b14=(Button) findViewById(R.id.button14);
        b15=(Button) findViewById(R.id.button15);
        b16=(Button) findViewById(R.id.button16);
        check=(Button) findViewById(R.id.check);
        reset=(Button) findViewById(R.id.reset);
        p_again=(Button)findViewById(R.id.playagain);
        info=findViewById(R.id.information);
        heart1=findViewById(R.id.hrt1);
        heart2=findViewById(R.id.hrt2);
        heart3=findViewById(R.id.hrt3);
        gb=findViewById(R.id.guessbox);
        change();
    }
    private void change(){
        b1.setText(elements.get(0).toString());
        b2.setText(elements.get(1).toString());
        b3.setText(elements.get(2).toString());
        b4.setText(elements.get(3).toString());
        b5.setText(elements.get(4).toString());
        b6.setText(elements.get(5).toString());
        b7.setText(elements.get(6).toString());
        b8.setText(elements.get(7).toString());
        b9.setText(elements.get(8).toString());
        b10.setText(elements.get(9).toString());
        b11.setText(elements.get(10).toString());
        b12.setText(elements.get(11).toString());
        b13.setText(elements.get(12).toString());
        b14.setText(elements.get(13).toString());
        b15.setText(elements.get(14).toString());
        b16.setText(elements.get(15).toString());

        selectUnselect();

        temp1="";
        for(int k=0;k<word.length();k++){
            temp1=temp1+"_ ";
            gb.setText(temp1);
        }
        score=0;
    }
    private void showDialog1(int score){
        final Dialog dialog=new Dialog(MainActivity2.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.popup1);
        TextView txt=dialog.findViewById(R.id.popup1);
        txt.setText("Your score:"+Integer.toString(score));
        Button btn1=dialog.findViewById(R.id.home);
        Button btn2=dialog.findViewById(R.id.playagain);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                Bundle b=ActivityOptions.makeSceneTransitionAnimation(MainActivity2.this).toBundle();
                intent.putExtra("BestScore",score);
                startActivity(intent,b);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.shuffle(elements);
                change();
                dialog.dismiss();
                playAgain();
            }
        });
        dialog.show();
    }
    private void showCustomDialog(){
        final Dialog dialog=new Dialog(MainActivity2.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.popup);
        TextView txt=dialog.findViewById(R.id.popup);
        Button btn=dialog.findViewById(R.id.okay);
        txt.setText(clue);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    dialog.dismiss();
                }
            });
            dialog.show();
        }
    private void selectUnselect(){
        b1.setClickable(true);
        b1.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b1.startAnimation(scaleDown);

        b2.setClickable(true);
        b2.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b2.startAnimation(scaleDown);

        b3.setClickable(true);
        b3.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b3.startAnimation(scaleDown);

        b4.setClickable(true);
        b4.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b4.startAnimation(scaleDown);

        b5.setClickable(true);
        b5.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b5.startAnimation(scaleDown);

        b6.setClickable(true);
        b6.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b6.startAnimation(scaleDown);

        b7.setClickable(true);
        b7.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b7.startAnimation(scaleDown);

        b8.setClickable(true);
        b8.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b8.startAnimation(scaleDown);

        b9.setClickable(true);
        b9.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b9.startAnimation(scaleDown);

        b10.setClickable(true);
        b10.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b10.startAnimation(scaleDown);

        b11.setClickable(true);
        b11.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b11.startAnimation(scaleDown);

        b12.setClickable(true);
        b12.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b12.startAnimation(scaleDown);

        b13.setClickable(true);
        b13.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b13.startAnimation(scaleDown);

        b14.setClickable(true);
        b14.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b14.startAnimation(scaleDown);

        b15.setClickable(true);
        b15.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b15.startAnimation(scaleDown);

        b16.setClickable(true);
        b16.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),R.color.gmag,null)));
        b16.startAnimation(scaleDown);
    }
    private void playAgain(){
        lives = 3;
        heart3.setImageResource(R.drawable.yellowhrt);
        heart2.setImageResource(R.drawable.yellowhrt);
        heart1.setImageResource(R.drawable.yellowhrt);
        change();
    }

}