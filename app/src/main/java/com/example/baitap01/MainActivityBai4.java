package com.example.baitap01;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivityBai4 extends AppCompatActivity {

    private static final String TAG = "MainActivityBai4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_bai4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                List<Integer> listInteger = new ArrayList<>();
                List<Integer> chan = new ArrayList<>();
                List<Integer> le = new ArrayList<>();
                for (int i=0; i<10; i++){
                    Integer tmp = random.nextInt(101);
                    listInteger.add(tmp);
                    if (tmp % 2 == 0){
                        chan.add(tmp);
                    }
                    else{
                        le.add(tmp);
                    }
                }



                Log.d(TAG, "Array content: " + listInteger.toString());
                Log.d(TAG, "Chan: " + chan.toString());
                Log.d(TAG, "Le : " + le.toString());
            }
        });
    }
}