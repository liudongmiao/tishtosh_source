package com.facebook.p909a;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: com.facebook.a.f */
class C13579f {

    /* renamed from: a */
    private static final String f35433a = "com.facebook.a.f";

    /* renamed from: com.facebook.a.f$a */
    static class C13580a extends ObjectInputStream {
        /* access modifiers changed from: protected */
        public final ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(C13511a.class);
            }
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(C13570a.class);
            }
            return readClassDescriptor;
        }

        public C13580a(InputStream inputStream) throws IOException {
            super(inputStream);
        }
    }

    C13579f() {
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:16|17|19|20|21|22|23|24|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x003d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x004d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0059 A[SYNTHETIC, Splitter:B:43:0x0059] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0031=Splitter:B:19:0x0031, B:24:0x003d=Splitter:B:24:0x003d, B:36:0x004d=Splitter:B:36:0x004d} */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.p909a.C13590m m27411a() {
        /*
            java.lang.Class<com.facebook.a.f> r0 = com.facebook.p909a.C13579f.class
            monitor-enter(r0)
            android.content.Context r1 = com.facebook.C14533n.m29773g()     // Catch:{ all -> 0x0060 }
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x004c, Exception -> 0x003e, all -> 0x0030 }
            com.facebook.a.f$a r4 = new com.facebook.a.f$a     // Catch:{ FileNotFoundException -> 0x004c, Exception -> 0x003e, all -> 0x0030 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x004c, Exception -> 0x003e, all -> 0x0030 }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x004c, Exception -> 0x003e, all -> 0x0030 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x004c, Exception -> 0x003e, all -> 0x0030 }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x004d, Exception -> 0x003f, all -> 0x002c }
            com.facebook.a.m r3 = (com.facebook.p909a.C13590m) r3     // Catch:{ FileNotFoundException -> 0x004d, Exception -> 0x003f, all -> 0x002c }
            com.facebook.internal.C14277aa.m29267a(r4)     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x002a }
            r1.delete()     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            r2 = r3
            goto L_0x0057
        L_0x002c:
            r2 = move-exception
            r3 = r2
            r2 = r4
            goto L_0x0031
        L_0x0030:
            r3 = move-exception
        L_0x0031:
            com.facebook.internal.C14277aa.m29267a(r2)     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x003d }
            r1.delete()     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            throw r3     // Catch:{ all -> 0x0060 }
        L_0x003e:
            r4 = r2
        L_0x003f:
            com.facebook.internal.C14277aa.m29267a(r4)     // Catch:{ all -> 0x0060 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0057 }
        L_0x0048:
            r1.delete()     // Catch:{ Exception -> 0x0057 }
            goto L_0x0057
        L_0x004c:
            r4 = r2
        L_0x004d:
            com.facebook.internal.C14277aa.m29267a(r4)     // Catch:{ all -> 0x0060 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0057 }
            goto L_0x0048
        L_0x0057:
            if (r2 != 0) goto L_0x005e
            com.facebook.a.m r2 = new com.facebook.a.m     // Catch:{ all -> 0x0060 }
            r2.<init>()     // Catch:{ all -> 0x0060 }
        L_0x005e:
            monitor-exit(r0)
            return r2
        L_0x0060:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p909a.C13579f.m27411a():com.facebook.a.m");
    }

    /* renamed from: a */
    public static synchronized void m27413a(C13572d dVar) {
        synchronized (C13579f.class) {
            C13590m a = m27411a();
            for (C13509a aVar : dVar.mo25397a()) {
                a.mo25413a(aVar, dVar.mo25396a(aVar).mo25415a());
            }
            m27414a(a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r6 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[ExcHandler: all (th java.lang.Throwable), PHI: r1 
      PHI: (r1v3 java.io.ObjectOutputStream) = (r1v0 java.io.ObjectOutputStream), (r1v2 java.io.ObjectOutputStream), (r1v2 java.io.ObjectOutputStream), (r1v0 java.io.ObjectOutputStream) binds: [B:1:0x0005, B:14:0x0026, B:15:?, B:2:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0005] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m27414a(com.facebook.p909a.C13590m r6) {
        /*
            android.content.Context r0 = com.facebook.C14533n.m29773g()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0024, all -> 0x0022 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0024, all -> 0x0022 }
            java.lang.String r4 = "AppEventsLogger.persistedevents"
            r5 = 0
            java.io.FileOutputStream r4 = r0.openFileOutput(r4, r5)     // Catch:{ Exception -> 0x0024, all -> 0x0022 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0022 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0024, all -> 0x0022 }
            r2.writeObject(r6)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            com.facebook.internal.C14277aa.m29267a(r2)
            return
        L_0x001d:
            r6 = move-exception
            r1 = r2
            goto L_0x002e
        L_0x0020:
            r1 = r2
            goto L_0x0024
        L_0x0022:
            r6 = move-exception
            goto L_0x002e
        L_0x0024:
            java.lang.String r6 = "AppEventsLogger.persistedevents"
            java.io.File r6 = r0.getFileStreamPath(r6)     // Catch:{ Exception -> 0x0032, all -> 0x0022 }
            r6.delete()     // Catch:{ Exception -> 0x0032, all -> 0x0022 }
            goto L_0x0032
        L_0x002e:
            com.facebook.internal.C14277aa.m29267a(r1)
            throw r6
        L_0x0032:
            com.facebook.internal.C14277aa.m29267a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p909a.C13579f.m27414a(com.facebook.a.m):void");
    }

    /* renamed from: a */
    public static synchronized void m27412a(C13509a aVar, C13593n nVar) {
        synchronized (C13579f.class) {
            C13590m a = m27411a();
            if (a.f35452a.containsKey(aVar)) {
                a.mo25412a(aVar).addAll(nVar.mo25415a());
            } else {
                a.mo25413a(aVar, nVar.mo25415a());
            }
            m27414a(a);
        }
    }
}
