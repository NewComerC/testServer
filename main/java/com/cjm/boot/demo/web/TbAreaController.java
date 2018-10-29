package com.cjm.boot.demo.web;


import com.cjm.boot.demo.entity.TbArea;
import com.cjm.boot.demo.service.TbAreaService;
import io.swagger.annotations.ApiOperation;
import com.cjm.boot.demo.common.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author agp
 * @since 2018-10-28
 */
@RestController
@RequestMapping("/tbArea")
public class TbAreaController {

    @Autowired
    private TbAreaService tbAreaService;

    @PostMapping("/app/expense/chooseInvoice")
    @ApiOperation(value = "选中发票列",httpMethod = "POST",response = ResponseEntity.class)
    private ResponseEntity<TbArea> chooseInvoice(){
        ResponseEntity<TbArea> res=new ResponseEntity<>();
        TbArea tb=tbAreaService.getInfo();
        res.setData(tb);
        return res;
    }
}

