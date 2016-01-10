package cn.edu.shu.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 计算执行Action花费的时间
 * Created by jxxiangwen on 16-1-5.
 */
public class TimerInterceptor extends AbstractInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(TimerInterceptor.class);

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        //TODO:计算执行时间
        //1.执行Action之前
        long start = System.currentTimeMillis();
        //2.执行下一个拦截器，如果已经是最后一个则执行Action
        //result为Action返回结果
        String result = actionInvocation.invoke();
        //3.执行Action之后
        long end = System.currentTimeMillis();
        logger.debug("ActionName:{}--Method:{}--总执行时间:{}ms", actionInvocation.getProxy().getAction(), actionInvocation.getProxy().getMethod(), (end - start));
        return result;
    }
}
