package com.yushan.module_club;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.yushan.lib_base.base.BaseFragment;

/**
 * Created by beiyong on 2017-12-11.
 */

public class ClubFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_club_fragment, container, false);
    }
}
