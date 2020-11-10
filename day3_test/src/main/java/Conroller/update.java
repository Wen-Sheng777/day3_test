package Conroller;

import com.opensymphony.xwork2.ActionSupport;

import DAO.studentDao;

public class update extends ActionSupport {
	
	private int id;
	private String name;
	private int chi;
	private int eng;
	private int math;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		new studentDao().update(getId(), getName(), getChi(), getEng(), getMath());
		
		return SUCCESS;
		
		
	}
	
	

}
