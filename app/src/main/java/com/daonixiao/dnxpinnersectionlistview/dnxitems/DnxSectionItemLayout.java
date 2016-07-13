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
public class DnxSectionItemLayout extends DnxListViewItemRelativeLayout {


    public DnxSectionItemLayout(Context context) {
        super(context);
    }

    public DnxSectionItemLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DnxSectionItemLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void init() {
        super.init();
        LayoutInflater.from(mContext).inflate(R.layout.dnx_section_item_layout, DnxSectionItemLayout.this, true);
    }


    @Override
    public boolean shouldUpdateViewWithItem(DnxListViewItem item) {
        DnxSectionItem sectionItem = (DnxSectionItem) item;
        return super.shouldUpdateViewWithItem(item);
    }
}
