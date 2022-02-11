package edu.up.secasurface;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

import com.example.yahtzeegui.R;


public class DrawDice extends SurfaceView {


    private Paint magentaPaint = new Paint();


    public DrawDice(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaints();
        setWillNotDraw(false);
    }


    public DrawDice(Context context) {
        super(context);
    }

    private void initPaints() {
        this.magentaPaint.setColor(0xFF7D0552);
        this.magentaPaint.setStyle(Paint.Style.FILL);
    }


    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawOval(100.0f, 100.0f, 250.0f, 150.0f, magentaPaint);

        Bitmap dice1 = BitmapFactory.decodeResource(getResources(), R.drawable.dice1);
        Bitmap dice3 = BitmapFactory.decodeResource(getResources(), R.drawable.dice3);
        canvas.drawBitmap(dice1, 100.0f, 100.0f, new Paint());
    }
}
