package com.camila.ortiz.ortiz_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.camila.ortiz.ortiz_final.examenfinal.favoritosActivity;
import com.camila.ortiz.ortiz_final.examenfinal.todosActivity;

public class principalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        findViewById(R.id.button).setOnClickListener(v -> startActivity(new Intent(principalActivity.this, todosActivity.class)));
        findViewById(R.id.button2).setOnClickListener(v -> startActivity(new Intent(principalActivity.this, favoritosActivity.class)));
    }
}