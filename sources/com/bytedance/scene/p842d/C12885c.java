package com.bytedance.scene.p842d;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: com.bytedance.scene.d.c */
public class C12885c extends FrameLayout {

    /* renamed from: a */
    private boolean f33710a = true;

    public void setTouchEnabled(boolean z) {
        this.f33710a = z;
    }

    public C12885c(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f33710a) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
