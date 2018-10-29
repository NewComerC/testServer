package com.cjm.boot.demo.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author agp
 * @since 2018-10-28
 */
@TableName("tb_area")
public class TbArea extends Model<TbArea> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "area_id", type = IdType.AUTO)
    private Integer areaId;
    @TableField("area_name")
    private String areaName;
    private Integer priority;
    @TableField("create_time")
    private Date createTime;
    @TableField("last_edit_time")
    private Date lastEditTime;


    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.areaId;
    }

    @Override
    public String toString() {
        return "TbArea{" +
        ", areaId=" + areaId +
        ", areaName=" + areaName +
        ", priority=" + priority +
        ", createTime=" + createTime +
        ", lastEditTime=" + lastEditTime +
        "}";
    }
}
