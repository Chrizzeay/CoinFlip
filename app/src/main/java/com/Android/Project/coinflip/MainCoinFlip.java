package com.Android.Project.coinflip;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.media.MediaPlayer;



public class MainCoinFlip extends ActionBarActivity
{

LinearLayout myLO;
final RandomNumberGenerator number = new RandomNumberGenerator();
int Ran_Number = number.randInt(); //random coin chance
int played;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_coin_flip);
        myLO = (LinearLayout) findViewById(R.id.MainCoinLayout);
        final ImageButton Coin = (ImageButton) findViewById(R.id.Coin);
        Coin.setBackgroundResource(R.drawable.gold_coin);
        played = 0;



    }
    public void buttonOnClick(View Coin)
    {
        //ImageView img_animation = (ImageView)findViewById(R.id.animation);
        //img_animation.setBackgroundResource(R.drawable.animation);
        //AnimationDrawable frameAnimation = (AnimationDrawable) img_animation.getBackground();
        //frameAnimation.start();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.coin_drop_sound);
        mediaPlayer.start();
        if (played ==0)
        {

            if (Ran_Number == 1)
            {
                Coin.setBackgroundResource(R.drawable.plain_gold_coin);
                played = 1;

            }
            if (Ran_Number == 2)
            {
                Coin.setBackgroundResource(R.drawable.gold_coin);
                played = 1;
            }
        }
        if (played == 1)
        {
            if (Ran_Number == 1)
            {
                Coin.setBackgroundResource(R.drawable.plain_gold_coin);
                played = 0;

            }
            if (Ran_Number == 2)
            {
                Coin.setBackgroundResource(R.drawable.gold_coin);
                played = 0;
            }

        }


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_coin_flip, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
