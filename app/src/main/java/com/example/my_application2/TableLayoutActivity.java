package com.example.my_application2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/*
  细节之处：一个控件的属性是怎么弄得呢？控件的属性是直接写在里面 例如<Button 巴拉巴拉等等属性/>
           或者></Button>
           但是对于布局  布局的一些属性也是这样子写在里面的 但是对于
            在布局里面的控件  就是直接的写在<....>
                    中间
                <...>
        TableLayout中的属性有shrinkColumns这是代表将按钮进行压缩
        stretchColumns将按钮拉升
        collapseColumns将按钮隐藏
   作用：利用TableLayout可以实现对控件的占位 有利于优化界面结构
 */

public class TableLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
    }
}