package com.cjm.boot.demo.service;

import com.cjm.boot.demo.entity.Area;

import java.util.List;

public interface AreaService {
    /**
     * 列出列表区域
     * @return
     */
    List<Area> getAreaList();

    /**
     * 根据Id列出具体区域
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
