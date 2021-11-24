package ru.myitschool.lesson20211123;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class TwoActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnclick;
    EditText editText;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        btnclick = findViewById(R.id.btnclick);
        editText = findViewById(R.id.edittext);
        tv = findViewById(R.id.tv);
        btnclick.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnclick: {
                String name = editText.getText().toString();
                tv.setText("Hello, " + name);
                editText.setText("");
            }

        }
    }
}
