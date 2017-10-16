package org.o7planning.fragmentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContactDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);

        Intent intent = getIntent();
        Contact contact = (Contact) intent.getSerializableExtra("information");
        FragmentContactDetail contactDetail = (FragmentContactDetail)
                getFragmentManager().findFragmentById(R.id.fragmentInformation);
        contactDetail.setDetail(contact);
    }
}
