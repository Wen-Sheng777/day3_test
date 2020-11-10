package Conroller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import DAO.studentDao;
import model.student;

public class ok extends ActionSupport {
	
	public String execute() throws Exception
	{

		Map session=ActionContext.getContext().getSession();
		
		student s=(student)session.get("S");
		
		new studentDao().add(s);
		
		
		return SUCCESS;
		
	}

}
