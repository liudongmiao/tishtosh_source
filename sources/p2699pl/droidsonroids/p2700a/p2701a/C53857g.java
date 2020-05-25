package p2699pl.droidsonroids.p2700a.p2701a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53851b;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53852c;

/* renamed from: pl.droidsonroids.a.a.g */
public final class C53857g extends C53852c {
    public C53857g(C53856f fVar, C53851b bVar, long j) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f133452a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = bVar.f133454c + (j * ((long) bVar.f133456e));
        this.f133461a = fVar.mo113855b(allocate, j2);
        this.f133462b = fVar.mo113855b(allocate, 4 + j2);
        this.f133463c = fVar.mo113855b(allocate, 8 + j2);
        this.f133464d = fVar.mo113855b(allocate, j2 + 20);
    }
}
