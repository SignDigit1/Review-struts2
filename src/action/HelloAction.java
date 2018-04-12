package action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author admin
 *
 */
public class HelloAction extends ActionSupport {
	private String message;

	private String name;

	public String select() {
		System.out.println("select");
		String password = ServletActionContext.getRequest().getParameter("password");
		message = "用户名和密码正确分别为" + name + "::" + password;

		ActionContext.getContext().put("message", message);
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
