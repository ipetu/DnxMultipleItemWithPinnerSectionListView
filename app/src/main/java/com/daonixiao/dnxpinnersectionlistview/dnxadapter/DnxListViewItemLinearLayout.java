package com.daonixiao.dnxpinnersectionlistview.dnxadapter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by liu on 3/18/15.
 */
public class DnxListViewItemLinearLayout extends LinearLayout implements DnxListViewInterfaceLayout {
    protected Context mContext;
    protected DnxListViewItem item;

    public DnxListViewItemLinearLayout(Context context, Context mContext) {
        super(context);
        this.mContext = mContext;
        init();
    }

    public DnxListViewItemLinearLayout(Context context, AttributeSet attrs, Context mContext) {
        super(context, attrs);
        this.mContext = mContext;
        init();
    }

    public DnxListViewItemLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, Context mContext) {
        super(context, attrs, defStyleAttr);
        this.mContext = mContext;
        init();
    }

    public void init() {
    }

    public boolean shouldUpdateViewWithItem(DnxListViewItem item) {
        this.item = item;
        return true;
    }
}
