package util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import entity.User;

public class MyIntercept extends HandlerInterceptorAdapter{

/*	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterCompletion");//���conteoller��Ⱦ��ͼ֮��
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("postHandle");//���conteoller��Ⱦ��ͼ֮ǰ
	}*/

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		User user=(User) request.getSession().getAttribute("user");//����controller֮ǰ
		String path=request.getServletPath();
		if(path.equals("/jsp/login.s")){
			return true;
		}
		if(user!=null){
			return true;
		}
		else{
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return false;
		}
	}

}
