package com.sailfish.authorization.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author XIAXINYU3
 * @date 2020/12/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("oauth_access_token")
public class OauthAccessToken {
    private String tokenId;
    private String token;
    private String authentication;
}
