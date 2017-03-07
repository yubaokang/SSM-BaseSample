package com.yubaokang.web.app.demo.dao;

import com.yubaokang.web.app.demo.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;

/**
 * Created by yubao on 2017/3/5.
 */
public interface SuccessKilledDao {

    /**
     * 插入购买明细，可过滤重复
     *
     * @param seckillId
     * @param
     * @return 插入的行数userPhone
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") String userPhone);


    /**
     * 根据id查询SuccessKilled并携带秒杀产品对象实体
     *
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId);
}
