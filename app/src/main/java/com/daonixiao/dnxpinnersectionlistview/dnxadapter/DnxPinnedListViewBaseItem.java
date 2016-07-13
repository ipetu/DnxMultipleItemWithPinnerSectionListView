package com.daonixiao.dnxpinnersectionlistview.dnxadapter;

/**
 * Created by liu on 16/7/12.
 */

public class DnxPinnedListViewBaseItem extends DnxListViewBaseItem {
    public static final int ITEM = 0;
    public static final int SECTION = 1;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public  int type;


}
