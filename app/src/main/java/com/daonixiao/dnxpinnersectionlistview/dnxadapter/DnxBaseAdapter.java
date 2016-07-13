package com.daonixiao.dnxpinnersectionlistview.dnxadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liu on 3/18/15.
 */
public class DnxBaseAdapter extends BaseAdapter {

    private Context mContext = null;
    protected List<DnxListViewItem> listItems = null;

    public DnxBaseAdapter(Context mContext) {
        this.mContext = mContext;
        listItems = new ArrayList<DnxListViewItem>(0);
    }


    public List<DnxListViewItem> getListItems() {
        return listItems;
    }

    public void removeItem(int postion) {
        if (listItems != null && listItems.size() > postion) {
            listItems.remove(postion);
        }
    }

    public void insertItems(int position, List<? extends DnxListViewItem> items) {
        for (int i = items.size() - 1; i >= 0; i--) {
            listItems.add(position, items.get(i));
        }
    }

    public void insertItem(int position, DnxListViewItem item) {
        listItems.add(position, item);
    }

    public void removeItem(DnxListViewItem item) {
        if (listItems.contains(item)) {
            listItems.remove(item);
        }
    }

    public void removeItems(List<DnxListViewItem> items) {
        listItems.removeAll(items);
    }

    public void removeAllItems() {
        listItems.clear();
    }

    public void insertItem(DnxListViewItem item) {
        listItems.add(item);
    }

    public void addItems(List<? extends DnxListViewItem> items) {
        listItems.addAll(items);
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    public int getPositionWithItem(DnxListViewItem item) {
        for (int i = 0; i < listItems.size(); i++) {
            DnxListViewItem object = listItems.get(i);
            if (item == object) {
                return i;
            }
        }
        return -1;
    }

    public DnxListViewItem findFirstItemWithClass(Class itemClass) {
        for (int i = 0; i < listItems.size(); i++) {
            DnxListViewItem object = listItems.get(i);
            if (itemClass.isInstance(object)) {
                return object;
            }
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Object itemObject = getItem(position);
        if (itemObject instanceof DnxListViewItem) {
            if (convertView == null) {
                try {
                    convertView = createNewConvertView((DnxListViewItem) itemObject, this.mContext);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            } else {
                Class c = ((DnxListViewBaseItem) itemObject).layoutClass();
                if (!c.isInstance(convertView)) {
                    try {
                        convertView = createNewConvertView((DnxListViewItem) itemObject, this.mContext);
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (convertView instanceof DnxListViewInterfaceLayout) {
                ((DnxListViewInterfaceLayout) convertView).shouldUpdateViewWithItem((DnxListViewItem) itemObject);
            }
            return convertView;
        }
        return null;
    }

    private View createNewConvertView(DnxListViewItem item, Context mContext) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = item.layoutClass();
        Constructor constructor = c.getDeclaredConstructor(new Class[]{Context.class});
        View convertView = (View) constructor.newInstance(mContext);
        return convertView;
    }

}
