package com.example.mediumbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

// used a abhinav sir's library
import com.tyagiabhinav.dialogflowchatlibrary.Chatbot;
import com.tyagiabhinav.dialogflowchatlibrary.ChatbotActivity;
import com.tyagiabhinav.dialogflowchatlibrary.ChatbotSettings;
import com.tyagiabhinav.dialogflowchatlibrary.DialogflowCredentials;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        DialogflowCredentials.getInstance().setInputStream(getResources().openRawResource(R.raw.gcp));

            ChatbotSettings.getInstance().setChatbot( new Chatbot.ChatbotBuilder().build());
            Intent intent = new Intent(getApplicationContext(),ChatbotActivity.class);
            Bundle bundle = new Bundle();


            bundle.putString(ChatbotActivity.SESSION_ID, "ac39879fcd6de8533eef50e311afa462c0e41bea");
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_NO_HISTORY);
            intent.putExtras(bundle);
            startActivity(intent);
        }



}