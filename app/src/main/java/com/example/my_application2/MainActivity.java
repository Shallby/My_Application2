package com.example.my_application2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/*
一个布局里面可以镶嵌多个布局 相当于一个大盒子里面有小箱子和物品，小箱子里面还可以另外的物品
线性布局的默认方向是水平方向
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ToImagine(View view){//这里的这个  view是必须的 否则不行
        Intent intent=new Intent(this,FrameLayoutActivity.class);
        this.startActivity(intent);
    }

    public void ToImagine1(View view) {
        Intent inte=new Intent();
        inte.setClass(this,RelativeActivity.class);
        this.startActivity(inte);
    }
}