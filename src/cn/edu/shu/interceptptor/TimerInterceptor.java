package cn.edu.shu.interceptptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 计算执行Action花费的时间
 * Created by jxxiangwen on 16-1-5.
 */
public class TimerInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        //TODO:计算执行时间
        //1.执行Action之前
        long start = System.currentTimeMillis();
        //2.执行下一个拦截器，如果已经是最后一个则执行Action
        //result为Action返回结果
        String result = actionInvocation.invoke();
        System.out.println("result:" + result);
        //3.执行Action之后
        long end = System.currentTimeMillis();
        System.out.println("总执行时间:" + (end - start) + "ms");
        return result;
    }
}
