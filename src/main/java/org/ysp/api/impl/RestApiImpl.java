package org.ysp.api.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.ysp.api.RestApi;
import org.ysp.entity.UserInfo;
import org.ysp.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author pai
 * @date 2019/9/2
 */
@Component("restApi")
@Slf4j
public class RestApiImpl implements RestApi {
    @Resource
    private UserService userService;

    @Override
    public List<UserInfo> getAllUserInfo() {

        return userService.getAllUserInfo();
    }
}
