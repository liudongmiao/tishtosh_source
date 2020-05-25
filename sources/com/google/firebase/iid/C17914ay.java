package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.firebase.iid.ay */
public final class C17914ay implements C17913ax {

    /* renamed from: a */
    private final IBinder f49772a;

    C17914ay(IBinder iBinder) {
        this.f49772a = iBinder;
    }

    /* renamed from: a */
    public final void mo34756a(Message message) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f49772a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f49772a;
    }
}
