package com.daonixiao.dnxpinnersectionlistview.dnxadapter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by liu on 15/3/21.
 */
public class DnxListViewItemRelativeLayout extends RelativeLayout implements DnxListViewInterfaceLayout {
    protected Context mContext;
    protected DnxListViewItem item;
    public DnxListViewItemRelativeLayout(Context context) {
        this(context,null);
    }

    public DnxListViewItemRelativeLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public DnxListViewItemRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        init();
    }

    public void init(){

    }
    public boolean shouldUpdateViewWithItem(DnxListViewItem item){
        this.item = item;
        return true;
    }
}
