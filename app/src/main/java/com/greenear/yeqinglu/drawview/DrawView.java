package com.greenear.yeqinglu.drawview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by yeqing.lu on 2016/10/18.
 */

public class DrawView extends View {

    public float currentX = 40;
    public float currentY = 50;
    //define draw pen
    Paint p = new Paint();

    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context, AttributeSet set){
        super(context,set);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //set pen color
        p.setColor(Color.RED);
        //draw a  ball
        canvas.drawCircle(currentX,currentY,15,p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //design currentX, Y
        currentX = event.getX();
        currentY = event.getY();
        //notify current view to draw itself
        invalidate();
        return true;

    }
}
