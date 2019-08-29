package org.ysp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.ysp.entity.UserInfo;

import javax.annotation.Resource;

/**
 * @author pai
 * @date 2019/8/27
 */
@RequestMapping("/user")
@Controller
@Slf4j
public class UserController {
    @Resource
    private HibernateTemplate template;

    @RequestMapping("/saveUserInfo.do")
    @ResponseBody
    public UserInfo saveUserInfo(String name){
        UserInfo userInfo = new UserInfo();
        userInfo.setName(name);
        template.save(userInfo);
        log.info("userinfo:{}",userInfo);
        return userInfo;
    }


}
