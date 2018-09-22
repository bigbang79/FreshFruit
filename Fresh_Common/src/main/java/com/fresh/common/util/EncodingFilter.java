package com.fresh.common.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Filter本身不生成任何请求和响应，只提供过滤功能。
 * @author Administrator
 *
 */
public class EncodingFilter implements Filter{

    /**
     * encode是xml文件中<init-param>的<param-name>，其<param-value>为UTF-8。
     */
    private String encode;

    /**
     * Filter的创建和销毁由WEB服务器负责。
     * WEB应用程序启动时，WEB服务器会创建Filter的实例对象，并调用其init()方法，完成对象的初始化功能，从而为后续的用户请求做好拦截的准备工作。
     * filter对象只会创建一次，init()方法也只会执行一次。
     * 通过init()方法的参数，可获得当前filter配置信息的FilterConfig对象。
     */
    public void init(FilterConfig filterConfig) throws ServletException {
        /**
         * 用户在配置filter时，可以使用<init-param>为filter配置一些初始化参数。
         * 当WEB容器实例化filter对象，调用其init()方法时，会把封装了filter的初始化参数的filterConfig对象传递进来。
         * So，我们在编写filter时，通过filterConfig对象的方法，就可获得:
         *      【1】String getFilterName():得到当前所配置的Filter的名字。
         *      【2】String getInitParameter(String name):返回在部署描述中，指定名字(即<param-name>中的名称)的初始化参数的值。如果不存在则返回null。
         *      【3】Enumeration getInitParameterNames():返回过滤器所有初始化参数的名字的枚举集合。
         *      【4】public ServletContext getServletContext():返回Servlet上下文对象的引用。
         */
        encode = filterConfig.getInitParameter("encode");
    }

    /**
     * 两个过滤器同时过滤一个请求时，就要用到过滤链FilterChain。服务器会根据web.xml中过滤器定义的先后顺序组成一条'过滤链'，后一次执行其中的doFilter()方法。
     * ForExample:第一个过滤器执行完的代码 --> 第二个过滤器执行...... 过滤响应时:第二个过滤器执行完的代码 --> 第一个过滤器执行......
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        servletRequest.setCharacterEncoding(encode);
        servletResponse.setContentType("text/html;charset=utf-8");
        filterChain.doFilter(servletRequest, servletResponse);

    }


    /**
     * 过滤器销毁方法，在服务器关闭时调用。
     * WEB容器调用destroy()方法销毁Filter，destroy()方法在Filter的生命周期中只执行一次。
     * 调用destroy()方法后，会释放掉过滤器所使用的资源。
     */
    public void destroy() {}

    /**
     * <servlet-name>指定过滤器所拦截的Servlet名称。
     * <dispatcher.>指定过滤器所拦截的资源被 Servlet容器调用的方式。
     * <dispatcher.> 子元素可以设置的值及其意义:
     *  REQUEST：当用户直接访问页面时，Web容器将会调用过滤器。如果目标资源是通过RequestDispatcher的include()或forward()方法访问时，那么该过滤器就不会被调用。
     INCLUDE：如果目标资源是通过RequestDispatcher的include()方法访问时，那么该过滤器将被调用。除此之外，该过滤器不会被调用。
     FORWARD：如果目标资源是通过RequestDispatcher的forward()方法访问时，那么该过滤器将被调用，除此之外，该过滤器不会被调用。
     ERROR：如果目标资源是通过声明式异常处理机制调用时，那么该过滤器将被调用。除此之外，过滤器不会被调用。
     */
}
