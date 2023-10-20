package com.sfcclass.app;

public class Chapter5EncodeCipher {
    public static void main(String[] args) {
        String msg = "This is a test";
        String key = "abcdefgh";
        String encmsg = "";
        String decmsg = "";

        System.out.print("Original message: ");
        System.out.println(msg);

        // Encode the message
        for (int i = 0; i < msg.length(); i++) {
            char msgChar = msg.charAt(i);
            char keyChar = key.charAt(i % 8);
            encmsg += (char) (msgChar ^ keyChar);
        }

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // Decode the message
        for (int i = 0; i < msg.length(); i++) {
            char encChar = encmsg.charAt(i);
            char keyChar = key.charAt(i % 8);
            decmsg += (char) (encChar ^ keyChar);
        }

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}
