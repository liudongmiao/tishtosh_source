package p064c.p065a.p072e.p087j;

/* renamed from: c.a.e.j.l */
public final class C2139l<T> {

    /* renamed from: a */
    final float f6896a;

    /* renamed from: b */
    int f6897b;

    /* renamed from: c */
    public int f6898c;

    /* renamed from: d */
    int f6899d;

    /* renamed from: e */
    public T[] f6900e;

    /* renamed from: a */
    private static int m6432a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    public C2139l() {
        this(16, 0.75f);
    }

    /* renamed from: a */
    private void m6433a() {
        T[] tArr = this.f6900e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (Object[]) new Object[i];
        int i3 = this.f6898c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a = m6432a(tArr[length].hashCode()) & i2;
                if (tArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (tArr2[a] != null);
                }
                tArr2[a] = tArr[length];
                i3 = i4;
            } else {
                this.f6897b = i2;
                this.f6899d = (int) (((float) i) * this.f6896a);
                this.f6900e = tArr2;
                return;
            }
        }
    }

    public C2139l(int i) {
        this(i, 0.75f);
    }

    /* renamed from: b */
    public final boolean mo6436b(T t) {
        T t2;
        T[] tArr = this.f6900e;
        int i = this.f6897b;
        int a = m6432a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return m6434a(a, tArr, i);
        }
        do {
            a = (a + 1) & i;
            t2 = tArr[a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return m6434a(a, tArr, i);
    }

    /* renamed from: a */
    public final boolean mo6435a(T t) {
        T t2;
        T[] tArr = this.f6900e;
        int i = this.f6897b;
        int a = m6432a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 != null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.f6898c + 1;
        this.f6898c = i2;
        if (i2 >= this.f6899d) {
            m6433a();
        }
        return true;
    }

    private C2139l(int i, float f) {
        this.f6896a = 0.75f;
        int a = C2140m.m6437a(i);
        this.f6897b = a - 1;
        this.f6899d = (int) (((float) a) * 0.75f);
        this.f6900e = (Object[]) new Object[a];
    }

    /* renamed from: a */
    private boolean m6434a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f6898c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = m6432a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }
}
