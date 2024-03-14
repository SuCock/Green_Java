package com.mh.restapi03.unit;

import org.jasypt.encryption.pbe.PooledPBEByteEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

public class MyEncrytor {

//    @Value("${jaspyt.encryptor.password}")
    private String password = "ksm1234ksm1234ksm1234";

    @Test
    void name(){
        System.out.println("실행됩니다." + password);

        // 암호화 클래스 선언
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(password);
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);
        //

        String content = "1234";
        String ensString = encryptor.encrypt(content);
        String decString = encryptor.decrypt(ensString);
        System.out.println(String.format("encString = %s decString = %s", ensString, decString));
    }
}
