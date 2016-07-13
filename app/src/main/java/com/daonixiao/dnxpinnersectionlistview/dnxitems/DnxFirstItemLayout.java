package com.daonixiao.dnxpinnersectionlistview.dnxitems;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.daonixiao.dnxpinnersectionlistview.R;
import com.daonixiao.dnxpinnersectionlistview.dnxadapter.DnxListViewItem;
import com.daonixiao.dnxpinnersectionlistview.dnxadapter.DnxListViewItemRelativeLayout;

/**
 * Created by liu on 2015/4/3.
 */
public class DnxFirstItemLayout extends DnxListViewItemRelativeLayout {


    public DnxFirstItemLayout(Context context) {
        super(context);
    }

    public DnxFirstItemLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DnxFirstItemLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void init() {
        super.init();
        LayoutInflater.from(mContext).inflate(R.layout.dnx_first_item_layout, DnxFirstItemLayout.this, true);
        final Button button = (Button) this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                button.setText("change");
            }
        });
    }


    @Override
    public boolean shouldUpdateViewWithItem(DnxListViewItem item) {
        DnxFirstItem bannerItem = (DnxFirstItem) item;
        return super.shouldUpdateViewWithItem(item);
    }
}
