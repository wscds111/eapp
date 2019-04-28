package com.dingding.modules.org.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.dingding.modules.common.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 机构信息表
 * </p>
 *
 * @author caolei
 * @since 2019-04-28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("SYS_ORG")
public class SysOrg extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId("ID")
    private String id;

    /**
     * 机构名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 注册时间
     */
    @TableField("ZCTIME")
    private LocalDateTime zctime;

    /**
     * 固定电话
     */
    @TableField("TEL")
    private String tel;

    /**
     * 注册资金
     */
    @TableField("ZCZJ")
    private Long zczj;

    /**
     * 网址
     */
    @TableField("ORGURL")
    private String orgurl;

    /**
     * 统一社会信用代码
     */
    @TableField("TYSHXYDM")
    private String tyshxydm;

    /**
     * 联系人
     */
    @TableField("LXR")
    private String lxr;

    /**
     * 法人代表
     */
    @TableField("FRDB")
    private String frdb;

    /**
     * 联系电话
     */
    @TableField("PHONE")
    private String phone;

    /**
     * 企业地址
     */
    @TableField("ADDRESS")
    private String address;

    /**
     * 是否高新技术企业
     */
    @TableField("ISGXQY")
    private String isgxqy;

    /**
     * 科技平台支持情况
     */
    @TableField("PTIDS")
    private String ptids;

    /**
     * 企业行业类型
     */
    @TableField("QYHYTYPE")
    private String qyhytype;

    /**
     * 企业领域类型
     */
    @TableField("QYLYTYPE")
    private String qylytype;

    /**
     * 创建人
     */
    @TableField("CREATE_BY")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    /**
     * 修改人
     */
    @TableField("UPDATE_BY")
    private String updateBy;

    /**
     * 修改时间
     */
    @TableField("UPDATE_DATE")
    private LocalDateTime updateDate;

    /**
     * 备注
     */
    @TableField("REMARKS")
    private String remarks;

    /**
     * 是否删除
     */
    @TableField("DEL_FLAG")
    private String delFlag;

    @TableField("SYSTYPE")
    private String systype;

    /**
     * 图片集
     */
    @TableField("PHOTOS")
    private String photos;

    /**
     * logo标志
     */
    @TableField("LOGO")
    private String logo;

    /**
     * 机构类型
     */
    @TableField("ORGTYPE")
    private String orgtype;

    /**
     * 注册用户编号
     */
    @TableField("USER_ID")
    private String userId;

    /**
     * 邮箱
     */
    @TableField("EMAIL")
    private String email;

    /**
     * 评价
     */
    @TableField("EVALUATE")
    private String evaluate;

    /**
     * 资质荣誉
     */
    @TableField("ZZRY")
    private String zzry;

    /**
     * 信用记录
     */
    @TableField("CREDIT_RECORD")
    private String creditRecord;


}
