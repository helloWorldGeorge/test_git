package cn.hero.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class CheckPrivilegeFilter implements javax.servlet.Filter {

	boolean check=false;
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("初始化拦截器配置参数");
	}
	
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("拦截进来了！！！！！");
		
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
//		一、字符编码设置
//		request.setCharacterEncoding("UTF-8");
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		二、权限拦截
		String uri = request.getRequestURI();
//		String uritemp= uri.substring(uri.indexOf("Action_"),uri.indexOf(".action"));
//		String methodName = uritemp.substring(uritemp.lastIndexOf('_')+1,uritemp.length());
		System.out.println("uri:"+uri);
//		System.out.println("methodName:"+methodName);
////		1、判断是不是不需要用户登入的请求
//		if(methodName.startsWith("goto"))
//		{
//			try{chain.doFilter(request, response);return;}catch(Exception e){e.printStackTrace();}
//		}
//		
////		2、判断用户是否登入
//		Domain_User login_user = (Domain_User) request.getSession().getAttribute("login_user");
//		if(login_user==null)
//		{
//			request.setAttribute("message", "对不起，您没有登入，请重新登入");
//			System.out.println("对不起，您没有登入，请重新登入");
//			System.out.println(request.getServletPath());
//			response.sendRedirect(request.getContextPath()+"/error.jsp");
//			return;
//		}
//		
////		3、判断此请求是否需要权限
//		List<String> noPrivilege = new ArrayList<String>();
//		noPrivilege.add("my");
//		for(int i=0;i<noPrivilege.size();i++)
//		{
//			if(methodName.startsWith(noPrivilege.get(i)))
//			{
//				check=true;
//				break;
//			}
//		}
//		if(check)
//		{
//			try{chain.doFilter(request, response);return;}catch(Exception e){e.printStackTrace();}
//		}
//		4、判断登入用户是否有权限
//		check =false;
//		List<Domain_Privilege> privilegeList = login_user.getDomain_Role().getPrivilegeList();
//		for(int i=0,size=privilegeList.size();i<size;i++)
//		{
//			if(methodName.equals(privilegeList.get(i).getPrivilegeKey()))
//			{
//				check=true;
//				i=size;
//			}
//		}
//		if(!check)
//		{
//			request.setAttribute("message", "对不起，您没有权限，请联系管理员");
//			request.getRequestDispatcher("/error.jsp").forward(request, response);
//			return;
//		}
		try{chain.doFilter(request, response);}catch(Exception e){e.printStackTrace();}
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
