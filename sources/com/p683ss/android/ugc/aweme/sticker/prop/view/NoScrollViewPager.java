package com.p683ss.android.ugc.aweme.sticker.prop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p683ss.android.ugc.aweme.views.RtlViewPager;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.view.NoScrollViewPager */
public class NoScrollViewPager extends RtlViewPager {

    /* renamed from: a */
    private boolean f117066a = true;

    public void setNoScroll(boolean z) {
        this.f117066a = z;
    }

    public NoScrollViewPager(Context context) {
        super(context);
    }

    public void setCurrentItem(int i) {
        super.setCurrentItem(i, false);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f117066a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f117066a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    public void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(i, z);
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
