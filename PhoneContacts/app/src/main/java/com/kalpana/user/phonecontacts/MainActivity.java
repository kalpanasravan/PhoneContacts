package com.kalpana.user.phonecontacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.View;



public class MainActivity extends AppCompatActivity {
    private static final int PICK_CONTACT = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /*code for displaying the contacts using intent action ACTION_PICK
    public void showContactList ( View view ) {
        Intent intent = new Intent ( Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI );
        startActivityForResult ( intent, PICK_CONTACT );
    }

}



