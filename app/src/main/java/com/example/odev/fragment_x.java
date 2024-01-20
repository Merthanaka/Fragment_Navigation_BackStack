package com.example.odev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev.databinding.FragmentXBinding;

public class fragment_x extends Fragment {
    private FragmentXBinding binding;
   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentXBinding.inflate(inflater,container,false);
        binding.buttony.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.goyfromx);
        });
        return binding.getRoot();
    }
}