package org.seckill.exception;

/**
 * 秒杀关闭异常
 * @author chm
 * @date 2019/8/19 16:36
 */
public class SeckillCloseException extends SeckillExceptioin{

    public SeckillCloseException(String s) {
        super(s);
    }

    public SeckillCloseException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
