package org.seckill.exception;

/**
 * 重复秒杀异常（运行期异常）
 * @author chm
 * @date 2019/8/19 16:33
 */
public class RepeatKillException extends SeckillExceptioin{

    public RepeatKillException(String message){
        super(message);
    }

    public RepeatKillException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
