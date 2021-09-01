package com.example.hellosample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick=findViewById(R.id.btClick);
        HelloListener listener=new HelloListener();
        btClick.setOnClickListener(listener);

        Button bt_clear=findViewById(R.id.btClick);

    }

    private class HelloListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            EditText input= findViewById(R.id.etName);
            TextView output=findViewById(R.id.tvOutput);
            int id=view.getId();
            String inputStr=input.getText().toString();
            output.setText(inputStr+"さん、こんにちは！");
        }
    }
}

