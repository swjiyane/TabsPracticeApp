package com.example.codetribe.tabspracticeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by CodeTribe on 8/17/2017.
 */

public class Tab2Chats extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2chat, container, false);
        return rootView;
        }

    }