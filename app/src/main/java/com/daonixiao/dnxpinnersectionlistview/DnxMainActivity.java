package com.daonixiao.dnxpinnersectionlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daonixiao.dnxpinnersectionlistview.dnxadapter.DnxPinnedListViewBaseItem;
import com.daonixiao.dnxpinnersectionlistview.dnxadapter.DnxPinnedSectionAdatper;
import com.daonixiao.dnxpinnersectionlistview.dnxitems.DnxFirstItem;
import com.daonixiao.dnxpinnersectionlistview.dnxitems.DnxSectionItem;
import com.daonixiao.dnxpinnersectionlistview.dnxitems.DnxThreeItem;
import com.hb.views.PinnedSectionListView;

public class DnxMainActivity extends AppCompatActivity {
    private PinnedSectionListView dnxPinnedListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dnx_pinned_section_list_activity);
        dnxPinnedListView = (PinnedSectionListView) this.findViewById(R.id.dnx_pinned_listview);
        DnxPinnedSectionAdatper appBaseAdapter = new DnxPinnedSectionAdatper(this);
        for (int i = 0; i < 100; i++) {
            if (i == 2 || i == 5) {
                DnxFirstItem dnxFirstItem = new DnxFirstItem();
                dnxFirstItem.setType(DnxPinnedListViewBaseItem.SECTION);
                appBaseAdapter.insertItem(dnxFirstItem);
            } else if (i == 10) {
                DnxSectionItem dnxSectionItem = new DnxSectionItem();
                dnxSectionItem.setType(DnxPinnedListViewBaseItem.SECTION);
                appBaseAdapter.insertItem(dnxSectionItem);
            } else if (i % 2 == 0) {
                DnxSectionItem dnxSectionItem = new DnxSectionItem();
                appBaseAdapter.insertItem(dnxSectionItem);
            } else {
                DnxThreeItem dnxThreeItem = new DnxThreeItem();
                appBaseAdapter.insertItem(dnxThreeItem);
            }
        }
        dnxPinnedListView.setAdapter(appBaseAdapter);
        dnxPinnedListView.setShadowVisible(false);
    }
}
