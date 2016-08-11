package a1.canvas.com.canvas1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jbt on 11/08/2016.
 */
public class MyNameView extends View {

    String currentName;


    public MyNameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        currentName="Enter your name";
    }


    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint= new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextSize(100);
        canvas.drawText(currentName, 100, 100, paint);

    }




    public void changeName(String name)
    {
        currentName=name;
        invalidate();
    }

}
