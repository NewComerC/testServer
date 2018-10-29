package com.cjm.boot.demo.service;

import com.cjm.boot.demo.entity.TbArea;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author agp
 * @since 2018-10-28
 */
public interface TbAreaService extends IService<TbArea> {

    public TbArea getInfo();
}
