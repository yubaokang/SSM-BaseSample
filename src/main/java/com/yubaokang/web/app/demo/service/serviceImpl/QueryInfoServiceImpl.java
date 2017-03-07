package com.yubaokang.web.app.demo.service.serviceImpl;

import com.yubaokang.web.app.demo.dao.SeckillDao;
import com.yubaokang.web.app.demo.entity.Seckill;
import com.yubaokang.web.app.demo.service.QueryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yubao on 2017/3/5.
 */
@Service
public class QueryInfoServiceImpl implements QueryInfoService {

    @Autowired
    private SeckillDao seckillDao;

    @Override
    public Seckill getSeckill(long id) {
        return seckillDao.queryById(id);
    }

    @Override
    public List<Seckill> getSeckills(int offset, int limit) {
        return seckillDao.queryAll(offset, limit);
    }
}
