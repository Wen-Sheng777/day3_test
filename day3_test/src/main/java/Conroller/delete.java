package Conroller;

import com.opensymphony.xwork2.ActionSupport;

import DAO.studentDao;

public class delete extends ActionSupport{
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String execute() throws Exception
	{
		new studentDao().delete(getId());
		
		return SUCCESS;
	}

}
