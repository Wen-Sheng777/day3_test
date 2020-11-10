package DAO;

import java.sql.ResultSet;

public interface implDao {
	void add(Object o);
	ResultSet query();
	void update(int id,String name,int chi,int eng,int math);
	void delete(int id);

}