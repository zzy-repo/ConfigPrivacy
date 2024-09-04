package com.zzy.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * (MUser)表实体类
 *
 * @author makejava
 * @since 2024-09-04 14:10:48
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("m_user")
public class User {

    @TableId
    private Long id;

    private String username;

    private String avatar;

    private String email;

    private String password;

    private Integer status;

    private Date created;

    private Date lastLogin;
    
}
