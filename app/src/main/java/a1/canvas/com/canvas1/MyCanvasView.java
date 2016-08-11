package a1.canvas.com.canvas1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jbt on 11/08/2016.
 */
public class MyCanvasView extends View {

    Path p;
    Paint paint;

    public MyCanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
         p = new Path();
         paint= new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        p.moveTo(20,20);
        p.lineTo(100, 100);
        p.lineTo(200,0);
        p.lineTo(45, 45);
        canvas.drawPath(p, paint);

    }


}
