package com.rahmatullahrizki.tugas_sensor_2022_akb_if7_10119283;
//         NIM: 10119183
//         Nama: Rahmatullah Rizki
//         Kelas: IF-7
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Model {
    String title, description, date;
    int image;

    public Model(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }


    public int getImage() {

        return image;
    }

    public void setImage(int image) {

        this.image = image;
    }
}
