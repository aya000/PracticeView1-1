package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图


        paint.setStyle(Paint.Style.FILL);
//        canvas.drawArc(200, 200, 600, 600, -45, 225, true, paint);
        //(400, 400)
        //黄色
        paint.setColor(Color.parseColor("#888822"));
        canvas.drawArc(200, 200, 600, 600, -55, 50, true, paint);
        //第一块红色
        paint.setColor(Color.parseColor("#883333"));
        canvas.drawArc(200, 200, 600, 600, -3, 10, true, paint);
        //灰色
        paint.setColor(Color.parseColor("#55000000"));
        canvas.drawArc(200, 200, 600, 600, 9, 8, true, paint);
        //绿色
        paint.setColor(Color.parseColor("#338833"));
        canvas.drawArc(200, 200, 600, 600, 19, 55, true, paint);
        //蓝色
        paint.setColor(Color.parseColor("#333388"));
        canvas.drawArc(200, 200, 600, 600, 76, 104, true, paint);


        //红色
        //相对上面的那个圆 圆心向左上方平移了10像素 (390, 390)
        paint.setColor(Color.parseColor("#772222"));
        canvas.drawArc(190, 190, 590, 590, -180, 123, true, paint);


        //画线
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);

        //画第一条线 线的起点在弧线的中点 计算出来画线
        Path path = new Path();
        path.moveTo(573, 300);
        path.lineTo(583,270);
        path.lineTo(670, 270);
        canvas.drawPath(path, paint);

        //画第一个文字
        paint.setTextSize(30);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("Marshmallow", 680, 270, paint);


























    }
}
