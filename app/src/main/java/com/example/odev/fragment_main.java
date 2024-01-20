package com.example.odev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev.databinding.FragmentMainBinding;

public class fragment_main extends Fragment {
    private FragmentMainBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater,container,false);
        binding.buttona.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.goafrommain);
        });
        binding.buttonx.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.goxfrommain);
        });




        return binding.getRoot();
    }
}