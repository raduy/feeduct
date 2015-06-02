package pl.agh.tai.portsadapter.soap.allegroapi.impl;

import org.apache.axis.encoding.Base64;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class PasswordEncryptor {

    private static String encryptAndEncodePassword(String password)
            throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes("UTF-8"));
        return Base64.encode(md.digest());
    }
}
