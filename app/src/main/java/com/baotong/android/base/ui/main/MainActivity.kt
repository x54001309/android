package com.baotong.android.base.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.baotong.android.base.R
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}