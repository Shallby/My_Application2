package com.example.my_application2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/*
相对布局有一些相对的属性 它可以在已知的控件基础之上 去添加位置选线
比如说
    现在要在Text控件的下方 又相对于Button1右边添加一个新的Button 就可以使用相对布局
 */
public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
    }

    //哪怕是FrameLayout布局中有一个ToClose方法 但是也需要在自己的一个RealativeActivity中要有
    public void ToClose(View view) {
        this.finish();
    }

    public void Cancle(View view) {
        this.startActivity(new Intent(this,MainActivity.class));
    }
}