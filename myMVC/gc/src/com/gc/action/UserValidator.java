/*
 * Created on 2006-4-14
 * TODO
 * author:gf
 */
package com.gc.action;

import org.springframework.validation.Validator; 
import org.springframework.validation.Errors;
public class UserValidator implements Validator {
	public boolean supports(Class clazz) { 
	    return clazz.equals(User.class); 
	} 
	//对输入数据进行验证
	public void validate(Object obj, Errors errors) { 
		User user = (User)obj;
	    if(!"gf".equals(user.getUsername()) ) { 
			errors.rejectValue("username", "usernameerror", null, "用户名不正确"); 
	    } 
if(!"123456".equals(user.getPassword()) ) { 
			errors.rejectValue("password", "passworderror", null, "密码不正确"); 
	    }
if(!user.getPassword().equals(user.getPassword2()) ) { 
			errors.rejectValue("password2", "doublepassword", null, "2次输入的密码不一致"); 
	    }
	}
}

