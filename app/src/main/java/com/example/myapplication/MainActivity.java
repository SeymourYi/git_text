package com.example.myapplication;

import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 

        Toast.makeText(getApplicationContext(),"这是测试案例",Toast.LENGTH_LONG).show();

        Log.d("MainActivity", "onCreate: 这是测试文件");
        //测试文件
        Log.d("MainActivity", "onCreate: hello git_text4");
    }
}