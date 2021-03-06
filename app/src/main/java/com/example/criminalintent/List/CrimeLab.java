package com.example.criminalintent.List;

import android.content.Context;

import androidx.fragment.app.FragmentActivity;

import com.example.criminalintent.Detail.Crime;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> crimeList;

    public static CrimeLab get(Context context) {
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
    private CrimeLab(Context context) {
        crimeList = new ArrayList<>();
        for(int i = 0; i<100; i++){
            Crime crime = new Crime();
            crime.setmTitle("Crime #" + i);
            crime.setmSolved(i%2 == 0);
            crimeList.add(crime);
        }
    }
    public List<Crime> getCrimeList() {
        return crimeList;
    }

    public Crime getCrime(UUID id){
        for(Crime crime: crimeList){
            if(crime.getmId().equals(id)){
                return crime;
            }
        }
        return null;
    }
}
