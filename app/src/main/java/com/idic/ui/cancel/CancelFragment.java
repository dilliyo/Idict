package com.idic.ui.cancel;

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

public class CancelFragment extends Fragment {

/*    private CancelViewModel cancelViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cancelViewModel =
                ViewModelProviders.of(this).get(CancelViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cancel, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        cancelViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }*/
}