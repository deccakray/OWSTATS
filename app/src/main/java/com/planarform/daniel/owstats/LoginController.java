package com.planarform.daniel.owstats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * This class will be used to verify battleTags and input them into the database.
 * This verification will allow users to chat with each other.
 */
public class LoginController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }
}
