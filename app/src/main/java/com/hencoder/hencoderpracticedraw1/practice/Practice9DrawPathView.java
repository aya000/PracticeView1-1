package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        Path path = new Path();
//        path.addArc(200, 200, 400, 400, -225, 225);
//        path.arcTo(400, 200, 600, 400, -180, 225, false);
//        path.lineTo(400, 542);
//        canvas.drawPath(path, paint);


        /**
         * addArc() 只是一个直接使用了 forceMoveTo = true 的简化版 arcTo()
         * 抬画笔
         * */
        path.addArc(200, 200, 300, 300, -180, 180);
        path.arcTo(300, 200, 400, 300, -180, 180, false);
        path.arcTo(200, 100, 400, 400, 0, 180, false);
        canvas.drawPath(path, paint);


    }
}
