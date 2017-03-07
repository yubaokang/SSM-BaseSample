package com.yubaokang.web.app.demo.service;

import com.yubaokang.web.app.demo.entity.Seckill;

import java.util.List;

/**
 * Created by yubao on 2017/3/5.
 */
public interface QueryInfoService {

    Seckill getSeckill(long id);

    List<Seckill> getSeckills(int offset, int limit);
}
