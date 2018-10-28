package com.cjm.boot.demo.web;


import com.cjm.boot.demo.common.JsonResult;
import com.cjm.boot.demo.entity.Area;
import com.cjm.boot.demo.service.AreaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea",method =RequestMethod.GET)
    @ApiOperation(value = "查询区域列表",httpMethod = "Get",response = ResponseEntity.class)
    public ResponseEntity<JsonResult> getUserList (){
        JsonResult res = new JsonResult();
        List<Area> areaList = areaService.getAreaList();
        res.setResult(areaList);
        res.setStatus("ok");
        return ResponseEntity.ok(res);
    }

    @RequestMapping(value = "/getareabyid/{areaId}",method =RequestMethod.GET)
    @ApiOperation(value = "根据id查询区域",httpMethod = "Get",response = ResponseEntity.class)
//    public ResponseEntity<Area> getAreaById (@PathVariable Integer areaId){
//        Area area=areaService.queryAreaById(areaId);
//        return ResponseEntity.ok(area);
//    }
    private Map<String,Object> getAreaById(Integer areaId){

        Map<String,Object> modelMap=new HashMap<String,Object>();
        Area area=areaService.queryAreaById(areaId);
        modelMap.put("area",area);
        return modelMap;
    }

    @RequestMapping(value = "/addarea}",method =RequestMethod.POST)
    private Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object> modelMap=new HashMap<String,Object>();
        modelMap.put("success",areaService.addArea(area));
        return modelMap;
    }

    @RequestMapping(value = "/modifyarea}",method =RequestMethod.POST)
    private Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object> modelMap=new HashMap<String,Object>();
        modelMap.put("success",areaService.modifyArea(area));
        return modelMap;
    }

    @RequestMapping(value = "/removearea}",method =RequestMethod.GET)
    private Map<String,Object> removeArea(Integer areaId){
        Map<String,Object> modelMap=new HashMap<String,Object>();
        modelMap.put("success",areaService.deleteArea(areaId));
        return modelMap;
    }

}
