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

import com.example.cihaksapp.MainActivity2;
import com.example.cihaksapp.R;

import java.util.concurrent.atomic.AtomicInteger;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);

        Button btnna = view.findViewById(R.id.btnna);

        TextView message = view.findViewById(R.id.message);

        AtomicInteger times = new AtomicInteger();

        btnna.setOnClickListener(view1 -> {
            times.getAndIncrement();
            message.setText("adios mundo " + times + " veces!");
            if (times.get()>5) {
                Intent i = new Intent(getContext(), MainActivity2.class);
                startActivity(i);
            }

        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

}