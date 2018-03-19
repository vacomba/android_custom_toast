package com.vacomba.toast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView uploadView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadView = findViewById(R.id.upload);
        uploadView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createToast();
            }
        });
    }

    private void createToast() {
        Context context = getApplicationContext();

        Toast toast = new Toast(context);
        LayoutInflater inflater = LayoutInflater.from(context);

        View toastView = inflater.inflate(R.layout.toast_custom, null);
        TextView textView = toastView.findViewById(R.id.text);
        textView.setText("Hello Toast");

        toast.setView(toastView);
        toast.show();
    }
}
