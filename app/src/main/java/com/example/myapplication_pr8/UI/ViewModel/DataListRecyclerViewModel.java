package com.example.myapplication_pr8.UI.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication_pr8.DATA.DataSources.Repository;
import com.example.myapplication_pr8.DATA.Model.DataListRecycler;

public class DataListRecyclerViewModel extends ViewModel {
    private Repository repository = new Repository();
    public LiveData<DataListRecycler> getItem(int itemId) {
        return repository.getItem(itemId);
    }
}