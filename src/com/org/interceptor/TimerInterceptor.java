package com.org.interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TimerInterceptor implements Interceptor {
    @Override
    public void destroy() {

    }
    @Override
    public void init(){}

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        long startTime = System.currentTimeMillis();
        String result = actionInvocation.invoke();
        long executionTime = System.currentTimeMillis() - startTime;
        System.out.println("executionTime = "+executionTime);
        return result;
    }

}
