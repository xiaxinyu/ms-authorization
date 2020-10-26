package com.sailfish.authorization.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.jwt.crypto.sign.MacSigner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author XIAXINYU3
 * @date 2020/10/26
 */
public class JwtUtils {
    /**
     * 签名工具
     */
    private static MacSigner signer;

    static {
        signer = new MacSigner("summer");
    }

    /**
     * 加密token
     *
     * @param json 要加密的json
     * @return
     */
    public static String encode(JSONObject json) {
        Jwt jwt = JwtHelper.encode(json.toJSONString(), signer);
        return jwt.getEncoded();
    }

    /**
     * @param json    要加密的json
     * @param headers 共享数据，这个可以JwtHelper.headers取得map得取得：{headers.key=headers.val, alg=HS256, typ=JWT}
     * @return
     */
    public static String encode(JSONObject json, Map<String, String> headers) {
        Jwt jwt = JwtHelper.encode(json.toJSONString(), signer, headers);
        return jwt.getEncoded();
    }

    /**
     * 解密token|token自带了解密串，使用了公私对串再进行一次校验
     *
     * @return
     */
    public static JSONObject decode(String token) {
        Jwt jwt = JwtHelper.decodeAndVerify(token, signer);
        return JSONObject.parseObject(jwt.getClaims());
    }

    public static void main(String[] args) {
        Map<String, String> headers = new HashMap<>();
        headers.put("test", "test");

        JSONObject json = new JSONObject();
        json.put("hehe", "https://my.oschina.net/yifanxiang");
        String token = JwtUtils.encode(json, headers);
        System.out.println(token);
        JSONObject info = JwtUtils.decode(token);
        System.out.println(info);
    }
}