package android.support.p019b;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: android.support.b.i */
final class C0283i implements TypeEvaluator<Rect> {

    /* renamed from: a */
    private Rect f693a;

    C0283i() {
    }

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int i = rect.left + ((int) (((float) (rect2.left - rect.left)) * f));
        int i2 = rect.top + ((int) (((float) (rect2.top - rect.top)) * f));
        int i3 = rect.right + ((int) (((float) (rect2.right - rect.right)) * f));
        int i4 = rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f));
        if (this.f693a == null) {
            return new Rect(i, i2, i3, i4);
        }
        this.f693a.set(i, i2, i3, i4);
        return this.f693a;
    }
}
