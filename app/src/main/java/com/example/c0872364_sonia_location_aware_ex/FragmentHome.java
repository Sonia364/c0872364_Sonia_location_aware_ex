package com.example.c0872364_sonia_location_aware_ex;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.c0872364_sonia_location_aware_ex.databinding.FragmentHomeBinding;

public class FragmentHome extends Fragment {

    FragmentHomeBinding binding = null;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(binding == null){
            binding = FragmentHomeBinding.inflate(inflater, container, false);
        }
        return binding.getRoot();
    }
}
