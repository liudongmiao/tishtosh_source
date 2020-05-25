package com.bytedance.p702im.core.internal.utils;

import com.google.gson.C18097x;

/* renamed from: com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory */
public class EnumTypeAdapterFactory implements C18097x {

    /* renamed from: com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a */
    enum C11460a {
        INT("int"),
        STRING("java.lang.String"),
        LONG("long"),
        DOUBLE("double"),
        BOOLEAN("boolean");
        

        /* renamed from: f */
        public String f30769f;

        public final String toString() {
            return this.f30769f;
        }

        private C11460a(String str) {
            this.f30769f = str;
        }
    }

    /* renamed from: com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$b */
    static class C11461b {

        /* renamed from: a */
        Object f30770a;

        /* renamed from: b */
        C11460a f30771b;

        C11461b(Object obj, C11460a aVar) {
            this.f30770a = obj;
            this.f30771b = aVar;
        }
    }

    /* renamed from: a */
    private static boolean m23437a(String str) {
        for (C11460a aVar : C11460a.values()) {
            if (aVar.f30769f.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static C11460a m23438b(String str) {
        for (C11460a aVar : C11460a.values()) {
            if (aVar.f30769f.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[Catch:{ Throwable -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba A[Catch:{ Throwable -> 0x00c8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.google.gson.C18095w<T> create(com.google.gson.C17971f r11, com.google.gson.p1077b.C17956a<T> r12) {
        /*
            r10 = this;
            java.lang.Class<? super T> r11 = r12.f49842b
            boolean r12 = r11.isEnum()
            r0 = 0
            if (r12 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.lang.Object[] r11 = r11.getEnumConstants()
            int r1 = r11.length
            r2 = 0
            r3 = 0
        L_0x0016:
            if (r3 >= r1) goto L_0x00cc
            r4 = r11[r3]
            if (r4 == 0) goto L_0x00c8
            java.lang.Class r5 = r4.getClass()     // Catch:{ Throwable -> 0x00c8 }
            java.lang.String r6 = r4.toString()     // Catch:{ Throwable -> 0x00c8 }
            java.lang.reflect.Field r5 = r5.getField(r6)     // Catch:{ Throwable -> 0x00c8 }
            java.lang.Class<com.google.gson.a.c> r6 = com.google.gson.p1076a.C17952c.class
            java.lang.annotation.Annotation r5 = r5.getAnnotation(r6)     // Catch:{ Throwable -> 0x00c8 }
            com.google.gson.a.c r5 = (com.google.gson.p1076a.C17952c) r5     // Catch:{ Throwable -> 0x00c8 }
            if (r5 == 0) goto L_0x0042
            com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$b r6 = new com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$b     // Catch:{ Throwable -> 0x00c8 }
            java.lang.String r5 = r5.mo34828a()     // Catch:{ Throwable -> 0x00c8 }
            com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a r7 = com.bytedance.p702im.core.internal.utils.EnumTypeAdapterFactory.C11460a.STRING     // Catch:{ Throwable -> 0x00c8 }
            r6.<init>(r5, r7)     // Catch:{ Throwable -> 0x00c8 }
            r12.put(r4, r6)     // Catch:{ Throwable -> 0x00c8 }
            goto L_0x00c8
        L_0x0042:
            java.lang.Class r5 = r4.getClass()     // Catch:{ Throwable -> 0x00c8 }
            java.lang.reflect.Field[] r5 = r5.getDeclaredFields()     // Catch:{ Throwable -> 0x00c8 }
            if (r5 == 0) goto L_0x0067
            int r6 = r5.length     // Catch:{ Throwable -> 0x00c8 }
            if (r6 <= 0) goto L_0x0067
            int r6 = r5.length     // Catch:{ Throwable -> 0x00c8 }
            r7 = 0
        L_0x0051:
            if (r7 >= r6) goto L_0x0067
            r8 = r5[r7]     // Catch:{ Throwable -> 0x00c8 }
            java.lang.Class r9 = r8.getType()     // Catch:{ Throwable -> 0x00c8 }
            java.lang.String r9 = r9.getName()     // Catch:{ Throwable -> 0x00c8 }
            boolean r9 = m23437a(r9)     // Catch:{ Throwable -> 0x00c8 }
            if (r9 == 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            int r7 = r7 + 1
            goto L_0x0051
        L_0x0067:
            r8 = r0
        L_0x0068:
            if (r8 == 0) goto L_0x00ba
            r5 = 1
            r8.setAccessible(r5)     // Catch:{ Throwable -> 0x00c8 }
            java.lang.Class r5 = r8.getType()     // Catch:{ Throwable -> 0x00c8 }
            java.lang.String r5 = r5.getName()     // Catch:{ Throwable -> 0x00c8 }
            com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a r5 = m23438b(r5)     // Catch:{ Throwable -> 0x00c8 }
            int[] r6 = com.bytedance.p702im.core.internal.utils.EnumTypeAdapterFactory.C114592.f30762a     // Catch:{ Throwable -> 0x00c8 }
            int r7 = r5.ordinal()     // Catch:{ Throwable -> 0x00c8 }
            r6 = r6[r7]     // Catch:{ Throwable -> 0x00c8 }
            switch(r6) {
                case 1: goto L_0x00a7;
                case 2: goto L_0x00a2;
                case 3: goto L_0x0099;
                case 4: goto L_0x0090;
                case 5: goto L_0x0087;
                default: goto L_0x0085;
            }     // Catch:{ Throwable -> 0x00c8 }
        L_0x0085:
            r6 = r0
            goto L_0x00af
        L_0x0087:
            boolean r6 = r8.getBoolean(r4)     // Catch:{ Throwable -> 0x00c8 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Throwable -> 0x00c8 }
            goto L_0x00af
        L_0x0090:
            double r6 = r8.getDouble(r4)     // Catch:{ Throwable -> 0x00c8 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ Throwable -> 0x00c8 }
            goto L_0x00af
        L_0x0099:
            long r6 = r8.getLong(r4)     // Catch:{ Throwable -> 0x00c8 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Throwable -> 0x00c8 }
            goto L_0x00af
        L_0x00a2:
            java.lang.Object r6 = r8.get(r4)     // Catch:{ Throwable -> 0x00c8 }
            goto L_0x00af
        L_0x00a7:
            int r6 = r8.getInt(r4)     // Catch:{ Throwable -> 0x00c8 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x00c8 }
        L_0x00af:
            if (r6 == 0) goto L_0x00c8
            com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$b r7 = new com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$b     // Catch:{ Throwable -> 0x00c8 }
            r7.<init>(r6, r5)     // Catch:{ Throwable -> 0x00c8 }
            r12.put(r4, r7)     // Catch:{ Throwable -> 0x00c8 }
            goto L_0x00c8
        L_0x00ba:
            com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$b r5 = new com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$b     // Catch:{ Throwable -> 0x00c8 }
            java.lang.String r6 = r4.toString()     // Catch:{ Throwable -> 0x00c8 }
            com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$a r7 = com.bytedance.p702im.core.internal.utils.EnumTypeAdapterFactory.C11460a.STRING     // Catch:{ Throwable -> 0x00c8 }
            r5.<init>(r6, r7)     // Catch:{ Throwable -> 0x00c8 }
            r12.put(r4, r5)     // Catch:{ Throwable -> 0x00c8 }
        L_0x00c8:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x00cc:
            com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$1 r11 = new com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory$1
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.utils.EnumTypeAdapterFactory.create(com.google.gson.f, com.google.gson.b.a):com.google.gson.w");
    }
}
