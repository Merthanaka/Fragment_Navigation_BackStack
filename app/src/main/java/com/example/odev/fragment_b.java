package com.example.odev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev.databinding.FragmentBBinding;

public class fragment_b extends Fragment {
    private FragmentBBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBBinding.inflate(inflater,container,false);
        binding.buttony2.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.goyfromb);
        });
        return binding.getRoot();
    }
}