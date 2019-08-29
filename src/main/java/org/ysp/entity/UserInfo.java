package org.ysp.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author pai
 * @date 2019/8/27
 */
@Data
public class UserInfo implements Serializable {


    private Long id;
    private String name;


}
