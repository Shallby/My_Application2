package com.example.my_application2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
/*
FrameLayout可以实现多个窗口的叠加 这样子就能实现图片的加载 多个东西完全叠在一起
就好像没有一样
上来就添加 不管有没有东西 加上去再说
 */
public class FrameLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
    }
    public void ToClose(View view){
        this.finish();
    }

}