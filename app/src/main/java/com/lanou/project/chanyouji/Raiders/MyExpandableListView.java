package com.lanou.project.chanyouji.Raiders;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ExpandableListView;

/**
 * Created by lanouhn on 16/9/29.
 */
public class MyExpandableListView extends ExpandableListView {
    public MyExpandableListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);

        super.onMeasure(widthMeasureSpec, expandSpec);
    }

    @Override
    public void setOnGroupClickListener(OnGroupClickListener onGroupClickListener) {

        super.setOnGroupClickListener(onGroupClickListener);
    }
}
