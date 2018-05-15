package com.itheima.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilterConfigTest implements Filter {

	
	private FilterConfig filterConfig;
	
	
	@Override
		public void init(FilterConfig arg0) throws ServletException {
			this.filterConfig = filterConfig;
	
		}
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		
		//通过FilterConfig对象获取配置文件中的初始化信息
		String encoding = filterConfig.getInitParameter("encoding");
		System.out.println(encoding);
		arg0.setCharacterEncoding(encoding);
		//放行
		arg2.doFilter(arg0, arg1);

	}
	@Override
	public void destroy() {
		

	}

}
