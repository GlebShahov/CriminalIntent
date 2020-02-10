package com.example.criminalintent.Detail;

import androidx.fragment.app.Fragment;

import com.example.criminalintent.SingleFragmentActivity;

public class CrimeActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
       return new CrimeFragment();
    }
}
