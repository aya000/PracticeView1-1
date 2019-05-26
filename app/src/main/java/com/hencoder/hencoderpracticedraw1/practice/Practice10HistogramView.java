package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图


        //先画坐标系
        Path path = new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        //移动画笔初始点
        path.moveTo(100, 100);
        path.lineTo(100, 550);
        path.lineTo(1100, 550);
        canvas.drawPath(path, paint);

        //画文字
        paint.setTextSize(30);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("Froyo",125, 580, paint);
        canvas.drawText("GB", 245, 580, paint);
        canvas.drawText("ICS", 365, 580, paint);
        canvas.drawText("JB", 485, 580, paint);
        canvas.drawText("KitKat", 605, 580, paint);
        canvas.drawText("L", 725, 580, paint);
        canvas.drawText("M", 845, 580, paint);

        //画直方图
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#559955"));
        canvas.drawRect(120, 540, 220, 550, paint);
        canvas.drawRect(240, 510, 340, 550, paint);
        canvas.drawRect(360, 510, 460, 550, paint);
        canvas.drawRect(480, 350, 580, 550, paint);
        canvas.drawRect(600, 200, 700, 550, paint);
        canvas.drawRect(720, 150, 820, 550, paint);
        canvas.drawRect(840, 370, 940, 550, paint);


    }
}
