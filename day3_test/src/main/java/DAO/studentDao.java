package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DbConn.DbConn;
import model.student;

public class studentDao implements implDao{

	public static void main(String[] args) {
//		student s=new student();
//		s.setName("aaa");
//		s.setChi(65);
//		s.setEng(85);
//		s.setMath(99);
//		
//		new studentDao().add(s);
//		System.out.println(s);
		
		//new studentDao().update(4, "b", 0, 0, 0);
		
		new studentDao().delete(13);
		
	}

	public void add(Object o) {
		
		student s=(student)o;		
		String sql="insert into student(name,chi,eng,math) values(?,?,?,?)";
		
		Connection conn=DbConn.get();
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, s.getName());
			ps.setInt(2, s.getChi());
			ps.setInt(3, s.getEng());
			ps.setInt(4, s.getMath());
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println("·s¼W¥¢±Ñ");
			e.printStackTrace();
		}
		
		
	}

	public ResultSet query() {
		Connection conn=DbConn.get();
		String sql="select * from student";
		ResultSet rs=null;
		
		try {
			Statement st=conn.createStatement();
			
			rs=st.executeQuery(sql);
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}

		return rs;
	}

	public void update(int id, String name, int chi, int eng, int math) {
		Connection conn=DbConn.get();
		String sql="update student set name='"+name+
				"',chi="+chi+",eng="+eng+",math="+math+" where id="+id;
		
		try {
				PreparedStatement ps=conn.prepareStatement(sql);
				
				ps.executeUpdate();
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public void delete(int id) {
			Connection conn=DbConn.get();
			String sql="delete from student where id="+id;
			
			try {
					PreparedStatement ps=conn.prepareStatement(sql);
					
					ps.executeUpdate();
					
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}

}