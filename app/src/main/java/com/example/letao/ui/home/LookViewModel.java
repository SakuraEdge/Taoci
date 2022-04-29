package com.example.letao.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LookViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LookViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("主页\n施工中");
    }

    public LiveData<String> getText() {
        return mText;
    }
}