package com.planarform.daniel.owstats;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

public class MessengerActivity extends AppCompatActivity {

    FloatingActionButton sendButton;
    EditText message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sendButton = (FloatingActionButton)findViewById(R.id.send_button);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenger);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message = (EditText)findViewById(R.id.message);
                FirebaseDatabase.getInstance()
                        .getReference()
                        .push()
                        .setValue(new chatMessage(
                                message.getText().toString(),"user"
                        ));

                message.setText("");

            }
        });
    }
}
