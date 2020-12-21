package com.test;

import com.sailfish.authorization.ApplicationAuth2Starter;
import com.sailfish.authorization.mapper.OauthAccessTokenMapper;
import com.sailfish.authorization.model.OauthAccessToken;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author XIAXINYU3
 * @date 2020/12/17
 */
@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringRunner.class)
@SpringBootTest(classes = {ApplicationAuth2Starter.class})
@Slf4j
public class OauthAccessTokenMapperTest {
    @Autowired
    OauthAccessTokenMapper oauthAccessTokenMapper;

    @Test
    public void testGet() {
        String token = "14489ce1bbad4fedfb9e7c4f6d7a5e77";
        OauthAccessToken tokenObj = oauthAccessTokenMapper.findOauthAccessToken(token);
        log.info("token={}", tokenObj);
    }

    @Test
    public void testGet2() {
        log.info("=========================================================");
        String token = "cce336447a5e43b6860f07e39c7291d5";
        OauthAccessToken tokenObj = oauthAccessTokenMapper.findOauthAccessToken(token);
        log.info("token={}", tokenObj);
    }
}
