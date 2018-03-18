package com.example.moniqueyj.sampleapp;


import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextPaint;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText t = findViewById(R.id.editText);
        final Button b = findViewById(R.id.button1);
        b.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_DONE) {
                    b.getText().toString();
                }
                return false;
            }
        });


//final CharSequence[] items = {"choice 1", "choice 2", "choice3"};
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Choose one")
//                .setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(getApplicationContext(), items[i], Toast.LENGTH_SHORT).show();
//                    }
//                });


//                .setMessage("do you want to finish?")
//                .setCancelable(false)
//                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int whichButton) {
//                        finish();
//                    }
//                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int i) {
//             dialog.cancel();
//            }
//        });
//
//        AlertDialog dialog = builder.create();
//        dialog.show();
    }

// 절대 레이아웃
//    @SuppressLint("ResourceType")
//    protected  void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();
//
//        Display display = getWindowManager().getDefaultDisplay();
//        Point size = new Point();
//        display.getSize(size);
//        int width = size.x;
//        int height = size.y - getStatusBarHeight();
//
//        RelativeLayout lay = new RelativeLayout(this);
//        RelativeLayout.LayoutParams p = new RelativeLayout.LayoutParams(400, 600);
//        lay.setLayoutParams(p);
//        lay.setBackgroundColor(0xFF008800);
//        lay.setPivotX(0);
//        lay.setPivotY(0);
//        lay.setScaleX((float)(width/(double)400));
//        lay.setScaleY((float)(height/(double)600));
//
//        Button b = new Button(this);
//        RelativeLayout.LayoutParams p2 = new RelativeLayout.LayoutParams(200,100);
//        p2.leftMargin = 100;
//        p2.topMargin = 200;
//        b.setLayoutParams(p2);
//        lay.addView(b,p2);
//
//        setContentView(lay);
//    }
//    public int getStatusBarHeight() {
//        int result = 0;
//        int resourceId = getResources().getIdentifier("status_bar_height", "dimen","android");
//        if(resourceId > 0) {
//            result = getResources().getDimensionPixelSize(resourceId);
//        }
//        return result;
//    }
}
