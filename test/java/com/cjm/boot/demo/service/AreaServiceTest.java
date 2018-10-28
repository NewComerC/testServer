package com.cjm.boot.demo.service;

import com.cjm.boot.demo.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class AreaServiceTest {

    @Autowired
    AreaService areaService;

    @Test
    @Ignore
    public void getAreaList() {
        List<Area> areaList=areaService.getAreaList();
        assertEquals(2,areaList.size());
    }

    @Test
    public void queryAreaById() {
        Area area=areaService.queryAreaById(1);
        assertEquals("东苑",area.getAreaName());
    }

    @Test
    public void addArea() {
    }

    @Test
    public void modifyArea() {
    }

    @Test
    public void deleteArea() {
    }
}