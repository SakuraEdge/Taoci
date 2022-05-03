package com.example.letao.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.letao.R;
import com.example.letao.databinding.FragmentLookBinding;

public class LookFragment extends Fragment {

    private FragmentLookBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LookViewModel homeViewModel = new ViewModelProvider(this).get(LookViewModel.class);

        TextView title = (TextView) getActivity().findViewById(R.id.text_title);
        title.setText("看展品");
        binding = FragmentLookBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), s -> textView.setText(s));
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}