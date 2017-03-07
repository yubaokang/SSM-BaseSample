-- 创建数据库
CREATE DATABASE seckill;
-- 使用数据库
USE seckill;
-- 创建秒杀库存
CREATE TABLE seckill (
  'seckill_id'  BIGINT       NOT NULL AUTO_INCREMENT
  COMMENT '商品库存id',
  'name'        VARCHAR(120) NOT NULL
  COMMENT '商品名称',
  'number'      INT          NOT NULL
  COMMENT '库存数量',
  'start_time'  TIMESTAMP    NOT NULL
  COMMENT '秒杀开启时间',
  'end_time'    TIMESTAMP    NOT NULL
  COMMENT '秒杀结束时间',
  'create_time' TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
  COMMENT '创建时间',
  PRIMARY KEY (seckill_id),
  KEY idx_start_time(start_time),
  KEY idx_end_time(end_time),
  KEY idx_create_time(create_time)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 1000
  DEFAULT CHARSET = utf8
  COMMENT = '秒杀库存表';

-- 初始化数据
INSERT INTO
  seckill (NAME, NUMBER, start_time, end_time)
VALUES
  ('100元苹果手机', 100, '2017-3-5 00:00:00', '2017-3-6 00:00:00'),
  ('200元小米手机', 200, '2017-3-5 00:00:00', '2017-3-6 00:00:00'),
  ('300元三星手机', 300, '2017-3-5 00:00:00', '2017-3-6 00:00:00'),
  ('400元华为手机', 400, '2017-3-5 00:00:00', '2017-3-6 00:00:00');

CREATE TABLE success_killed (
  'seckill_id'  BIGINT    NOT NULL
  COMMENT '秒杀商品id',
  'user_phone'  BIGINT    NOT NULL
  COMMENT '用户手机号',
  'state'       TINYINT   NOT NULL DEFAULT -1
  COMMENT '状态标示：-1:无效  0:成功  1:已付款  2:已发货',
  'create_time' TIMESTAMP NOT NULL
  COMMENT '创建时间',
  PRIMARY KEY (seckill_id, user_phone), /*联合组建*/
  KEY idx_create_time(create_time)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 1000
  DEFAULT CHARSET = utf8
  COMMENT = '秒杀成功明细表';

-- 链接数据库控制台