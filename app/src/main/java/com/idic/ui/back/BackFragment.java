package com.idic.ui.back;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.idic.R;

public class BackFragment extends Fragment {

    /*private BackViewModel backViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        backViewModel =
                ViewModelProviders.of(this).get(BackViewModel.class);
        View root = inflater.inflate(R.layout.fragment_back, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        backViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }*/
}