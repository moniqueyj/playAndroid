package com.example.moniqueyj.sampleapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;

/**
 * Created by moniqueyj on 3/15/18.
 */

public class MyView extends TextureView {
    public MyView(Context context) {
        super(context);
        MyThread t = new MyThread();
        t.v = this;
        t.start();
    }

//    @Override
//    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i1) {
//        Paint p = new Paint();
//        p.setStyle(Paint.Style.FILL);
//        p.setColor(Color.BLUE);
//
//        Canvas c = lockCanvas();
//        c.drawCircle(200,200,100, p );
//        unlockCanvasAndPost(c);
//    }
//
//    @Override
//    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i1) {
//
//    }
//
//    @Override
//    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
//        return false;
//    }
//
//    @Override
//    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
//
//    }

//    @Override
//    public boolean onTouch(View v, MotionEvent e) {
//
//        Canvas c = lockCanvas();
//        c.drawColor(Color.WHITE);
//        Paint p = new Paint();
//        p.setStyle(Paint.Style.FILL);
//        p.setColor(Color.BLUE);
//        c.drawCircle(e.getX(), e.getY(), 100, p);
//        unlockCanvasAndPost(c);
//        return false;
//    }
}

class MyThread extends Thread {

    int i = 0;
    TextureView v;

    public void run() {
        while (true) {

            Canvas c = v.lockCanvas();
            if (c == null) continue;

            c.drawColor(Color.WHITE);
            Paint p = new Paint();
            p.setStyle(Paint.Style.FILL);
            p.setColor(Color.BLUE);
            c.drawCircle(200, i, 100, p);
            i += 5;
            if (i > 200) i = 0;
            v.unlockCanvasAndPost(c);

        }
    }
}