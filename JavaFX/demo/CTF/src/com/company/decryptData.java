//package com.company;
//import java.nio.charset.StandardCharsets;
//import java.security.spec.AlgorithmParameterSpec;
//import java.security.Key;
//import java.util.Base64;
//import javax.crypto.Cipher;
//import javax.crypto.spec.IvParameterSpec;
//import javax.crypto.spec.SecretKeySpec;
//
////
//// Decompiled by Procyon v0.5.36
////
//
//class decryptData
//{
//    private byte[] encrypted;
//    private boolean printKey;
//
//    public decryptData() {
//        this.encrypted = new byte[] { 124, 72, 53, 85, 34, -117, 63, 119, -62, -62, -62, -39, 73, 117, -72, -46, 59, -120, 64, -105, -87, 18, 75, -97, -58, -2, 11, 84, -106, 61, -56, -114, -116, 19, -64, -28, -76, -47, -46, -67, -28, 99, 118, -120, -89, 14, -65, 80 };
//        this.printKey = false;
//        byte[] decrypted = decrypt();
//        String s = Base64.getEncoder().encodeToString(decrypted);
//        System.out.println("The decrypted array is " + s);
//
//    }
//
//    public byte[] decrypt() {
//        byte[] array = null;
//        final byte[] key = { 11, -83, -16, 13, 11, -83, -16, 13 };
//        final byte[] iv = new byte[8];
//        for (int i = 0; i < iv.length; ++i) {
//            iv[i] = -51;
//        }
//        final SecretKeySpec secretKeySpec = new SecretKeySpec(key, "DES");
//        final IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
//        try {
//            final Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
//            instance.init(1, secretKeySpec, ivParameterSpec);
//            instance.init(2, secretKeySpec, ivParameterSpec);
//            array = new byte[instance.getOutputSize(this.encrypted.length)];
//            final int update = instance.update(this.encrypted, 0, this.encrypted.length, array, 0);
//            final int n = update + instance.doFinal(array, update);
//        }
//        catch (Exception ex) {}
//        return array;
//    }
//
//    public void go() {
//        if (this.printKey) {
//            System.out.println(new String(this.decrypt()));
//        }
//        else {
//            System.out.println("Sorry, can't help you!");
//        }
//    }
//
//
//    public static void main(final String[] array) {
//        System.out.println("Here we go...");
//        new decryptData();
//
//
//    }
//}