package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.jp */
final class C16807jp {
    /* renamed from: a */
    static String m40608a(C16691fs fsVar) {
        C16809jr jrVar = new C16809jr(fsVar);
        StringBuilder sb = new StringBuilder(jrVar.mo32355a());
        for (int i = 0; i < jrVar.mo32355a(); i++) {
            byte a = jrVar.mo32354a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
