package com.example.student.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb_luu;
    EditText ed_TK,ed_MK;
    Button btn_đn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb_luu=findViewById(R.id.checkBox_Luu);
        ed_TK=findViewById(R.id.editText_TK);
        ed_MK=findViewById(R.id.editText_MK);
        btn_đn=findViewById(R.id.button_DN);
        btn_đn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Tk = ed_TK.getText().toString();
                String Pass = ed_MK.getText().toString();
                if (!Tk.isEmpty() && !Pass.isEmpty()) {
                    if (cb_luu.isChecked()) {
                        Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu", Toast.LENGTH_LONG).show();
                    }
                
            }

            }
        });
    }
}
