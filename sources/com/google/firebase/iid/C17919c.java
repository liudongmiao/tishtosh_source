package com.google.firebase.iid;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.firebase.iid.c */
public final class C17919c {
    /* renamed from: a */
    public static KeyPair m43927a() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(2048);
            return instance.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
