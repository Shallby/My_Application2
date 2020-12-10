package com.example.my_application2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/*
利用无限多的细线，将界面分割成行列单元，然后指定控件显示的区域以及控件显示的内容和方式
    layout_columnSpan这个属性是将多列的空格合并为一个空格
    layout_rowSpan这个属性是将多行的空格合并为一个空格
如何将一个控件指定的放到一个位置呢?
    使用这个布局下面的一个column属性 在任一的一个控件下面键入这个属性 并填入对应的值就可以
    将这个控件指定到网格的位置中
 */
public class GridLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
    }
}