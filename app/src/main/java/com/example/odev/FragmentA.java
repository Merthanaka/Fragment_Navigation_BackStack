package com.example.odev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev.databinding.FragmentABinding;

public class FragmentA extends Fragment {
    private FragmentABinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentABinding.inflate(inflater,container,false);
        binding.buttonb.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.gobfroma);
        });
        return binding.getRoot();
    }
}