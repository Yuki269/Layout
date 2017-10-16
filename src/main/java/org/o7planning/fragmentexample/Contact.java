package org.o7planning.fragmentexample;

import android.media.Image;
import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by nguyenhuutuyen on 10/10/2017.
 */

public class Contact implements Serializable {
    private int id;
    private String name;
    private int imageId;
    private int coverImageId;
    private String phone;
    private String email;

    public Contact(int id, String name, int imageId, int coverImageId, String phone, String email) {
        this.id = id;
        this.name = name;
        this.imageId = imageId;
        this.coverImageId = coverImageId;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getCoverImageId() {
        return coverImageId;
    }

    public void setCoverImageId(int coverImageId) {
        this.coverImageId = coverImageId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

