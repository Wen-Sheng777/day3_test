package Conroller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import DAO.studentDao;
import model.student;

public class add extends ActionSupport{
	private String name;
	private int chi;
	private int eng;
	private int math;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChi() {
		return chi;
	}
	public void setChi(int chi) {
		this.chi = chi;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String execute() throws Exception
	{
		student s=new student();
		
		s.setName(getName());
		s.setChi(getChi());
		s.setEng(getEng());
		s.setMath(getMath());
		
		//new studentDao().add(s);
		
		Map session=ActionContext.getContext().getSession();
		
		session.put("S", s);
		
		return SUCCESS;
		
	}
	

}