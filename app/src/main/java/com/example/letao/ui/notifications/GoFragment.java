package com.example.letao.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.letao.R;
import com.example.letao.databinding.FragmentGoBinding;

public class GoFragment extends Fragment {

    private FragmentGoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GoViewModel notificationsViewModel = new ViewModelProvider(this).get(GoViewModel.class);
        TextView title = (TextView) getActivity().findViewById(R.id.text_title);
        title.setText("逛展厅");
        binding = FragmentGoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}