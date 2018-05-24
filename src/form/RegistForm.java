package form;

import org.apache.struts.action.ActionForm;

import entity.User;

public class RegistForm extends ActionForm{
	
	private User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
//	private String name;
//	private String password;
//	private String phone;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public RegistForm() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		return "RegistForm [name=" + name + ", password=" + password
//				+ ", phone=" + phone + "]";
//	}
//	

}
