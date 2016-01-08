package cn.edu.shu.action;

import com.opensymphony.xwork2.ActionSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jxxiangwen on 16-1-5.
 */
public class TimerAction extends ActionSupport{
    //日志
    private static final Logger logger = LoggerFactory.getLogger(TimerAction.class);

    @Override
    public String execute() throws Exception {
        logger.debug("{}开始计算时间",TimerAction.class);
        logger.warn("{}开始计算时间",TimerAction.class);
        logger.error("{}开始计算时间",TimerAction.class);
        logger.info("{}开始计算时间",TimerAction.class);
        for(int i = 0;i < 10000; i++){
            System.out.println("I Love Hanlu");
        }
        logger.debug("{}结束计算时间",TimerAction.class);
        logger.warn("{}结束计算时间",TimerAction.class);
        logger.error("{}结束计算时间",TimerAction.class);
        logger.info("{}结束计算时间",TimerAction.class);
        return SUCCESS;
    }
}
