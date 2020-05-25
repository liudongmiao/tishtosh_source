package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<BitmapTeleporter> CREATOR = new C15379a();

    /* renamed from: a */
    private final int f39660a;

    /* renamed from: b */
    private ParcelFileDescriptor f39661b;

    /* renamed from: c */
    private final int f39662c;

    /* renamed from: d */
    private Bitmap f39663d;

    /* renamed from: e */
    private File f39664e;

    BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f39660a = i;
        this.f39661b = parcelFileDescriptor;
        this.f39662c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f39661b == null) {
            Bitmap bitmap = this.f39663d;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(m31953a()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                m31954a(dataOutputStream);
            } catch (IOException e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m31954a(dataOutputStream);
                throw th;
            }
        }
        int i2 = i | 1;
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39660a);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f39661b, i2, false);
        C15469b.m32195b(parcel, 3, this.f39662c);
        C15469b.m32197c(parcel, a);
        this.f39661b = null;
    }

    /* renamed from: a */
    private final FileOutputStream m31953a() {
        if (this.f39664e != null) {
            try {
                File createTempFile = File.createTempFile("teleporter", ".tmp", this.f39664e);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    this.f39661b = ParcelFileDescriptor.open(createTempFile, 268435456);
                    createTempFile.delete();
                    return fileOutputStream;
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e) {
                throw new IllegalStateException("Could not create temporary file", e);
            }
        } else {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
    }

    /* renamed from: a */
    private static void m31954a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
