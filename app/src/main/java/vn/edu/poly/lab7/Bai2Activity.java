package vn.edu.poly.lab7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Bai2Activity extends AppCompatActivity {
    private EditText edtName, edtEmail, edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPass = findViewById(R.id.edtPass);
    }

    public void Login(View view) {
        String mail = "[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
        if (edtName.getText().toString().isEmpty()) {
            Toast.makeText(Bai2Activity.this, "Mời bạn nhập name", Toast.LENGTH_SHORT).show();
            edtName.requestFocus();
            return;

        } else if (edtEmail.getText().toString().isEmpty()){
                Toast.makeText(Bai2Activity.this, "Mời bạn nhập email", Toast.LENGTH_SHORT).show();
            edtEmail.requestFocus();
                return;

        } else if (!edtEmail.getText().toString().matches(mail)) {
            Toast.makeText(Bai2Activity.this, "Nhập emai chưa đúng định dạng", Toast.LENGTH_SHORT).show();
            edtEmail.requestFocus();
            return;

        } else if (edtPass.getText().toString().length() < 6) {
            Toast.makeText(Bai2Activity.this, "Mời bạn nhập pass ít nhất 6 ký tự", Toast.LENGTH_SHORT).show();
            edtPass.requestFocus();
            return;

        } else {
            Toast.makeText(Bai2Activity.this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
            edtPass.setText("");
            edtName.setText("");
            edtEmail.setText("");
        }

    }
}
