package org.seckill.exception;

/**
 * 秒杀业务相关异常
 * @author chm
 * @date 2019/8/19 16:38
 */
public class SeckillExceptioin extends RuntimeException {

    public SeckillExceptioin(String s) {
        super(s);
    }

    public SeckillExceptioin(String s, Throwable throwable) {
        super(s, throwable);
    }
}
