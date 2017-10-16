package org.o7planning.fragmentexample;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by nguyenhuutuyen on 10/16/2017.
 */

public class FragmentContactList extends ListFragment {

    CustomAdapter adapter;
    ArrayList<Contact> arrContact;
    ContactInterface contactInterface;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contactInterface = (ContactInterface) getActivity();
        arrContact = new ArrayList<>();
        creatDataContact();
        // khởi tạo adapter
        adapter = new CustomAdapter(getActivity(), R.layout.fragment_contact, arrContact);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.fragment_list_contact, container , false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        contactInterface.DataContact(arrContact.get(position));
    }

    // add danh sách hiển thị
    private void creatDataContact() {
        arrContact.add(new Contact(0,"Selena Gomez", R.drawable.selenagomez, R.drawable.selenagomezbackgroud, "123-444-5555", "SelenaGomez@fuck.com"));
        arrContact.add(new Contact(1,"Allen Walker", R.drawable.allenwalker, R.drawable.allenwalkerbackgroud, "456-777-8888", "AllenWalker@fuck.com"));
        arrContact.add(new Contact(2,"George Clooney", R.drawable.georgeclooney, R.drawable.georgeclooneybackgroud, "222-333-1111", "GeorgeClooney@fuck.com"));
        arrContact.add(new Contact(3,"Obama", R.drawable.obama, R.drawable.obama, "111-777-9999", "Obama@fuck.com"));
        arrContact.add(new Contact(4,"Scarlett Johansson", R.drawable.scarlettjohansson, R.drawable.selenagomezbackgroud, "789-000-1234", "Scarlett Johansson@fuck.com"));
        arrContact.add(new Contact(5,"Yuki", R.drawable.yuki, R.drawable.yukibackgroud, "678-686-6996", "Yuki@fuck.com"));
    }
}
