package vn.edu.poly.lab7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void bai1(View view) {
        startActivity(new Intent(this,Bai1Activity.class));
    }

    public void bai2(View view) {
        startActivity(new Intent(this,Bai2Activity.class));
    }

    public void bai3(View view) {
        startActivity(new Intent(this,Bai3Activity.class));
    }

    public void bai4(View view) {
       startActivity(new Intent(this,Bai4Activity.class));
    }

    public void bai5(View view) {
        startActivity(new Intent(this,Bai5Activity.class));
    }
}
