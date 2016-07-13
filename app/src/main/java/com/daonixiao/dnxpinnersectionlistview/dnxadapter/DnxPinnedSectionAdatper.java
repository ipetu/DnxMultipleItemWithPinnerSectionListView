package com.daonixiao.dnxpinnersectionlistview.dnxadapter;

import android.content.Context;

import com.hb.views.PinnedSectionListView;

/**
 * Created by liu on 16/7/12.
 */

public class DnxPinnedSectionAdatper extends DnxBaseAdapter implements PinnedSectionListView.PinnedSectionListAdapter {

    public DnxPinnedSectionAdatper(Context mContext) {
        super(mContext);
    }

    @Override
    public int getItemViewType(int position) {
        return ((DnxPinnedListViewBaseItem) getItem(position)).getType();
    }

    @Override
    public int getViewTypeCount() {
        return 4;
    }

    @Override
    public boolean isItemViewTypePinned(int viewType) {
        return viewType == DnxPinnedListViewBaseItem.SECTION;
    }
}
