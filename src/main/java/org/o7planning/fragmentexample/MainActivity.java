package org.o7planning.fragmentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements ContactInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void DataContact(Contact contact) {
        FragmentContactDetail fragmentContactDetail = (FragmentContactDetail)
                getFragmentManager().findFragmentById(R.id.fragmentDetail);

        if(fragmentContactDetail != null) {
            fragmentContactDetail.setDetail(contact);
        }else {
            Intent intent = new Intent(MainActivity.this , ContactDetail.class);
            intent.putExtra("information" , contact);
            startActivity(intent);
        }
    }
}
