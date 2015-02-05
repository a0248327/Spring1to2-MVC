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
	//���������ݽ�����֤
	public void validate(Object obj, Errors errors) { 
		User user = (User)obj;
	    if(!"gf".equals(user.getUsername()) ) { 
			errors.rejectValue("username", "usernameerror", null, "�û�������ȷ"); 
	    } 
if(!"123456".equals(user.getPassword()) ) { 
			errors.rejectValue("password", "passworderror", null, "���벻��ȷ"); 
	    }
if(!user.getPassword().equals(user.getPassword2()) ) { 
			errors.rejectValue("password2", "doublepassword", null, "2����������벻һ��"); 
	    }
	}
}

