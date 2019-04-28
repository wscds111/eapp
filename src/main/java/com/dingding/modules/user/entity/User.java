package com.dingding.modules.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.util.Date;

import com.dingding.modules.common.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author caolei
 * @since 2019-04-28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("SYS_USER")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("COMPANY_ID")
    private String companyId;

    @TableField("OFFICE_ID")
    private String officeId;

    @TableField("LOGIN_NAME")
    private String loginName;

    @TableField("PASSWORD")
    private String password;

    @TableField("NO")
    private String no;

    @TableField("NAME")
    private String name;

    @TableField("EMAIL")
    private String email;

    @TableField("PHONE")
    private String phone;

    @TableField("MOBILE")
    private String mobile;

    @TableField("USER_TYPE")
    private String userType;

    @TableField("PHOTO")
    private String photo;

    @TableField("LOGIN_IP")
    private String loginIp;

    @TableField("LOGIN_DATE")
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date loginDate;

    @TableField("LOGIN_FLAG")
    private String loginFlag;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("CREATE_DATE")
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createDate;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("UPDATE_DATE")
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date updateDate;

    @TableField("REMARKS")
    private String remarks;

    @TableField("DEL_FLAG")
    private String delFlag;

    @TableField("ADDRESS")
    private String address;

    @TableField("ORG_TYPE")
    private String orgType;

    @TableField("ID_CARD")
    private String idCard;


}
