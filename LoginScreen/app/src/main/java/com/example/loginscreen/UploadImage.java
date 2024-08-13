package com.example.loginscreen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UploadImage extends AppCompatActivity {

    ImageView image;
    Button imgBtn;

    private final int GALLERY_REQ_CODE = 1000;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploadimage);

        image = findViewById(R.id.imgGallary);
        imgBtn = findViewById(R.id.btnGallary);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imgGallery = new Intent(Intent.ACTION_PICK);
                imgGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(imgGallery,GALLERY_REQ_CODE);

            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

         if (resultCode ==RESULT_OK){
             if ( requestCode == GALLERY_REQ_CODE){
                 image.setImageURI(data.getData());
             }
         }
    }
}
