package com.anqiu.springcloud.modular.basecode.entity;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 基础表代码
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("BASE_CODE")
@KeySequence("SEQ_BASE_COMMON")
public class BaseCode implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private Long id;

    /**
     * 代码类型
     */
    @TableField("CODE_TYPE")
    private String codeType;

    /**
     * 代码
     */
    @TableField("CODE")
    private String code;

    /**
     * 英文名称
     */
    @TableField("NAME_EN")
    private String nameEn;

    /**
     * 中文名称
     */
    @TableField("NAME_CN")
    private String nameCn;

    /**
     * 备注
     */
    @TableField("NOTES")
    private String notes;

    /**
     * 备注2
     */
    @TableField("NOTES2")
    private String notes2;

    /**
     * 排列顺序
     */
    @TableField("SEQUENCE")
    private Long sequence;


}
