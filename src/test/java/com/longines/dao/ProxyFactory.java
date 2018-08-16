package com.longines.dao;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author FengTianHao
 * @version 1.0
 * @since 2018/8/16 16:51
 */

/**
 * 代理对象
 */
public class ProxyFactory implements MethodInterceptor {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance()
    {
        Enhancer en=new Enhancer();
        en.setSuperclass(target.getClass());
        en.setCallback(this);
        return en.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务");
        Object result=method.invoke(target,objects);
        System.out.println("提交事务");
        return result;
    }

    public static void main(String[] args) {
        Sale target=new Sale();
        Sale proxy=(Sale)new ProxyFactory(target).getProxyInstance();
        proxy.sale();
    }
}
