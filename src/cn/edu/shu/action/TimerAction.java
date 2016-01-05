package cn.edu.shu.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by jxxiangwen on 16-1-5.
 */
public class TimerAction extends ActionSupport{

    @Override
    public String execute() throws Exception {
        for(int i = 0;i < 10000; i++){
            System.out.println("I Love Hanlu");
        }
        return SUCCESS;
    }
}
