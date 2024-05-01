package com.example.myapplication_pr8.UI.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication_pr8.DATA.Model.FragmentDataTransaction;

public class FragmentTransactViewModel extends ViewModel {
    private MutableLiveData<FragmentDataTransaction> transactData = new MutableLiveData<>();
    public FragmentTransactViewModel() {
        transactData.setValue(new FragmentDataTransaction());
    }
    public MutableLiveData<FragmentDataTransaction> getTransactData() {
        return transactData;
    }
}