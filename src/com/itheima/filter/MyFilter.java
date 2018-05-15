package com.itheima.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("过滤器1拦截开始");
		
		//放行
		chain.doFilter(request, response);
		
		System.out.println("过滤器1拦截结束");
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	
		
	}

}
