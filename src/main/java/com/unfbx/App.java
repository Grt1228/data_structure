package com.unfbx;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
//        Long timestamp = System.currentTimeMillis();
//        String secret = "SEC912f0fc100943864296d2921efc16fa128878db6d8741185bb9a1d0e0c277f01";
//        System.out.println(timestamp);
//        String stringToSign = timestamp + "\n" + secret;
//        Mac mac = Mac.getInstance("HmacSHA256");
//        mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
//        byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
//        String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)),"UTF-8");
//        System.out.println(sign);
//
//
//        Map<Object, Object> map = Collections.synchronizedMap(new HashMap<>());

        Hashtable hashtable = new Hashtable();
        hashtable.put(null,"1");

    }
}
