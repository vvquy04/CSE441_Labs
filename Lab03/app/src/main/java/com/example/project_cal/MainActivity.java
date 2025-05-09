package com.example.project_cal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB, edtResult;
    Button btnSum, btnDifference, btnProduct, btnQuotient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtResult = findViewById(R.id.edtResult);
        btnSum = findViewById(R.id.btnSum);
        btnDifference = findViewById(R.id.btnDifference);
        btnProduct = findViewById(R.id.btnProduct);
        btnQuotient = findViewById(R.id.btnQuotient);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int A = Integer.parseInt("0"+edtA.getText());
                int B = Integer.parseInt("0"+edtB.getText());
                edtResult.setText("a + b = "+ (A+B));
            }
        });
        btnDifference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int A = Integer.parseInt("0"+edtA.getText());
                int B = Integer.parseInt("0"+edtB.getText());
                edtResult.setText("a - b = "+ (A-B));
            }
        });
        btnProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int A = Integer.parseInt("0"+edtA.getText());
                int B = Integer.parseInt("0"+edtB.getText());
                edtResult.setText("a * b = "+ (A*B));
            }
        });
        btnQuotient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int A = Integer.parseInt("0"+edtA.getText());
                int B = Integer.parseInt("0"+edtB.getText());
                if(B==0){
                    edtResult.setText("B phải khác 0");
                }
                else {
                    edtResult.setText("a / b = " + (A/B));
                }
            }
        });
    }
}