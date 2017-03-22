package com.id.taqi.action;

import java.util.Map;

import com.id.taqi.model.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class InterceptorAction implements Interceptor{

	private static final long serialVersionUID = 1L;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
		User user =(User)session.get("user");
		if(user == null){
			return ActionSupport.LOGIN;
		}
		return actionInvocation.invoke();
	}

}
