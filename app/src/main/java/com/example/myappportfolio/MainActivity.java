package com.example.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v){
        switch(v.getId()){
            case R.id.movie_bt:
                showToast(getString(R.string.start_app) + getString(R.string.hot_movie));
                break;
            case R.id.stock_bt:
                showToast(getString(R.string.start_app) + getString(R.string.stock_app));
                break;
            case R.id.reader_bt:
                showToast(getString(R.string.start_app) + getString(R.string.xyz_reader));
                break;
            case R.id.news_bt:
                showToast(getString(R.string.start_app) + getString(R.string.news_app));
                break;
            case R.id.project_bt:
                showToast(getString(R.string.start_app) + getString(R.string.graduation_project));
        }

    }

    private void showToast(String message){
        if(mToast==null){
            mToast=Toast.makeText(this,message,Toast.LENGTH_SHORT);
        }else{
            mToast.setText(message);
        }
        mToast.show();
    }
}
