package com.sailfish.authorization.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sailfish.authorization.model.OauthAccessToken;

/**
 * @author XIAXINYU3
 * @date 2020/12/17
 */
public interface OauthAccessTokenMapper extends BaseMapper<OauthAccessToken> {
     OauthAccessToken findOauthAccessToken(String accessToken);
}
