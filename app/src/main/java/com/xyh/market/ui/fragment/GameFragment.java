package com.xyh.market.ui.fragment;

import android.view.View;

import com.xyh.market.ui.view.LoadingPage;

/**
 * Created by xyh on 2017/3/19.
 */
public class GameFragment extends BaseFragment {
    @Override
    public View onCreateSuccessView() {
        return null;
    }

    @Override
    public LoadingPage.ResultState onLoad() {
        return LoadingPage.ResultState.STATE_EMPTY;
    }

}
