package com.rahmatullahrizki.tugas_sensor_2022_akb_if7_10119283;

//         NIM: 10119183
//         Nama: Rahmatullah Rizki
//         Kelas: IF-7
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentAppInfo extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_fragment_app_info, container, false);
    }
}