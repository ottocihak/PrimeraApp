package com.example.cihaksapp.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.cihaksapp.MainActivity;
import com.example.cihaksapp.MainActivity2;
import com.example.cihaksapp.R;

import java.util.concurrent.atomic.AtomicInteger;

public class MainFragment2 extends Fragment {


    private MainViewModel2 mViewModel;

    public static MainFragment2 newInstance() {
        return new MainFragment2();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment2, container, false);

        Button btncb = view.findViewById(R.id.button_cb);

        btncb.setOnClickListener(view1 -> {
            Intent i = new Intent(getContext(), MainActivity.class);
            startActivity(i);
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel2.class);
        // TODO: Use the ViewModel
    }

}