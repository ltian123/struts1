package action;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import entity.User;
import exception.UserExistException;
import form.RegistForm;

public class RegistAction extends Action implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
//		String name = request.getParameter("name");
//		String password = request.getParameter("password");
//		String phone = request.getParameter("phone");
//		
//		if("admin".equals(name)){
//			request.setAttribute("msg", "用户名已经存在");
//			return mapping.findForward("fail");
//		}
//		request.getSession().setAttribute("name", name);
//		return mapping.findForward("success");
		
		
		
//		RegistForm registForm = (RegistForm) form;
//		System.out.println(registForm);
//		
//		
//		
//		if("admin".equals(registForm.getName())){
//			request.setAttribute("msg", "用户名已经存在");
//			return mapping.findForward("fail");
//		}
//		request.getSession().setAttribute("name", registForm.getName());
//		return mapping.findForward("success");
//		
		
		
		RegistForm registForm = (RegistForm) form;

		User user = registForm.getUser();
		System.out.println(user);
				
		
		
		if("admin".equals(user.getName())){
			request.setAttribute("msg", "用户名已经存在");
//			return mapping.findForward("fail");
			throw new UserExistException();
		}
		request.getSession().setAttribute("name", user.getName());
		return mapping.findForward("success");
		
	}

}
