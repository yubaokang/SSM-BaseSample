package com.yubaokang.web.app.demo.controllar;

import com.yubaokang.web.app.demo.entity.Seckill;
import com.yubaokang.web.app.demo.service.QueryInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by yubao on 2017/3/5.
 */

@Controller
@RequestMapping("/queryInfo") // url:/模块/资源/{id}/细分 /seckill/list
public class TestControllar {
    @Autowired
    private QueryInfoService queryInfoService;

    //http://localhost:8080/app/queryInfo/queryById?seckillId=8
    @RequestMapping(value = "/queryById", method = RequestMethod.GET)
    @ResponseBody
    public Seckill queryById(@Param("seckillId") long seckillId) {
        return queryInfoService.getSeckill(seckillId);
    }

    @RequestMapping(value = "/queryAll")
    public List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit) {
        List<Seckill> seckills = queryInfoService.getSeckills(offset, limit);
        for (Seckill seckill : seckills) {
            System.out.println(seckill);
        }
        return seckills;
    }
}
