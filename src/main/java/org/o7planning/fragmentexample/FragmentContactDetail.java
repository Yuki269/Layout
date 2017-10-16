package org.o7planning.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by nguyenhuutuyen on 10/16/2017.
 */

public class FragmentContactDetail extends Fragment {

    TextView txtName, txtPhone, txtEmail, txtNameUser;
    ImageView imageUser;
    View view;
    LinearLayout linearLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_detail_user, container, false);
        mappedProperties();
        return view;
    }

    public void setDetail(Contact contact) {
        txtName.setText(contact.getName());
        imageUser.setImageResource(contact.getImageId());
        txtNameUser.setText(contact.getName());
        linearLayout.setBackgroundResource(contact.getCoverImageId());
        txtPhone.setText(contact.getPhone());
        txtEmail.setText(contact.getEmail());
    }

    private void mappedProperties() {
        txtName = view.findViewById(R.id.textName);
        imageUser = view.findViewById(R.id.avarta);
        txtNameUser = view.findViewById(R.id.txtNameUser);
        linearLayout = view.findViewById(R.id.backgroudImage);
        txtPhone = view.findViewById(R.id.txtPhone);
        txtEmail = view.findViewById(R.id.txtEmail);
    }
}
