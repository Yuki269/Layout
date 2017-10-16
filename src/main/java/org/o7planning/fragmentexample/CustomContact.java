package org.o7planning.fragmentexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nguyenhuutuyen on 10/10/2017.
 */

class CustomAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Contact> listContact;

    public CustomAdapter(Context context, int layout,  List<Contact> listContact) {
        this.context = context;
        this.layout = layout;
        this.listContact = listContact;
    }

    @Override
    public int getCount() {
        return listContact.size();
    }
    @Override
    public Object getItem(int position) {

        return listContact.get(position);
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        TextView txtName;
        ImageView imageUser;
        ImageView imageBackgroud;
        TextView txtPhone;
        TextView txtEmail;
    }
    // Hàm hiển thị giao diện của listview
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        // Khởi tạo view.
        if (view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txtName = (TextView) view.findViewById(R.id.txtName);
            holder.imageUser = (ImageView) view.findViewById(R.id.imgUser);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        Contact contact = listContact.get(position);
        // Set dữ liệu vào item của list view
        holder.txtName.setText(contact.getName());
        holder.imageUser.setImageResource(contact.getImageId());
        return view;
    }
}
