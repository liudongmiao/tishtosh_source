package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent */
public final class InteractStickerParent extends RelativeLayout {

    /* renamed from: a */
    private boolean f112931a = true;

    public final boolean getNeedConsumeEvent() {
        return this.f112931a;
    }

    public final void setNeedConsumeEvent(boolean z) {
        this.f112931a = z;
    }

    public InteractStickerParent(Context context) {
        super(context);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f112931a) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public InteractStickerParent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InteractStickerParent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
