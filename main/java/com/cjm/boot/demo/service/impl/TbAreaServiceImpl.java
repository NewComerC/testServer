package com.cjm.boot.demo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.cjm.boot.demo.entity.TbArea;
import com.cjm.boot.demo.mapper.TbAreaDao;
import com.cjm.boot.demo.service.TbAreaService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author agp
 * @since 2018-10-28
 */
@Service
public class TbAreaServiceImpl extends ServiceImpl<TbAreaDao, TbArea> implements TbAreaService {

    @Override
    public TbArea getInfo() {
        EntityWrapper<TbArea> ew = new EntityWrapper<>();
        ew.eq("area_id", 2);
        TbArea res =this.selectOne(ew);
        return res;
    }
}
