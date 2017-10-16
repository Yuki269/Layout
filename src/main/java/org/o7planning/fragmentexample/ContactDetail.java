package org.o7planning.fragmentexample;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by nguyenhuutuyen on 10/16/2017.
 */

public class ContactDetail extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_information);
        Intent intent = getIntent();
        Contact contact = (Contact) intent.getSerializableExtra("information");
        FragmentContactDetail contactDetail = (FragmentContactDetail)
                getFragmentManager().findFragmentById(R.id.fragmentInformation);
        contactDetail.setDetail(contact);
    }
}
