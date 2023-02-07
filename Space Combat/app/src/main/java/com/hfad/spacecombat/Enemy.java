package com.hfad.spacecombat;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import static com.hfad.spacecombat.GameView.screenRatioX;
import static com.hfad.spacecombat.GameView.screenRatioY;  
public class Enemy {

    public int speed = 10;
    public boolean wasShot = true;
    int x = 0, y, width, height, enemyCounter = 1;
    Bitmap enemy1, enemy3;

    Enemy (Resources res) {

        enemy1 = BitmapFactory.decodeResource(res, R.drawable.enemy1);
        enemy2 = BitmapFactory.decodeResource(res, R.drawable.enemy1);
       

        width = enemy1.getWidth();
        height = enemy1.getHeight();

        width /= 6;
        height /= 6;

        width = (int) (width * screenRatioX);
        height = (int) (height * screenRatioY);

        enemy1 = Bitmap.createScaledBitmap(enemy1, width, height, false);   
        enemy3 = Bitmap.createScaledBitmap(enemy3, width, height, false);


        y = -height;
    }

    Bitmap getEnemy () {

        if (enemyCounter== 1) {
            enemyCounter++;
            return enemy1;
        }

        if (enemyCounter == 2) {
            enemyCounter++;
            return enemy2;
        }


    Rect getCollisionShape () {
        return new Rect(x, y, x + width, y + height);
    }

}

