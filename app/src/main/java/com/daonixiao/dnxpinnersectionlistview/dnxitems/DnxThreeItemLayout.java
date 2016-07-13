package com.daonixiao.dnxpinnersectionlistview.dnxitems;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.daonixiao.dnxpinnersectionlistview.R;
import com.daonixiao.dnxpinnersectionlistview.dnxadapter.DnxListViewItem;
import com.daonixiao.dnxpinnersectionlistview.dnxadapter.DnxListViewItemRelativeLayout;

/**
 * Created by liu on 2015/4/3.
 */
public class DnxThreeItemLayout extends DnxListViewItemRelativeLayout {


    public DnxThreeItemLayout(Context context) {
        super(context);
    }

    public DnxThreeItemLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DnxThreeItemLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void init() {
        super.init();
        LayoutInflater.from(mContext).inflate(R.layout.dnx_three_item_layout, DnxThreeItemLayout.this, true);
    }


    @Override
    public boolean shouldUpdateViewWithItem(DnxListViewItem item) {
        return super.shouldUpdateViewWithItem(item);
    }
}
