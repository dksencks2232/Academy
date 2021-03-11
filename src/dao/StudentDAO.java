package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;
import static db.JdbcUtil.*;
import vo.StudentMemberBean;

public class StudentDAO {
	public static StudentDAO instance;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	private StudentDAO() {
		
	}
	public static StudentDAO getInstance(){
		if(instance == null){
			instance = new StudentDAO();
		}
		return instance;
	}
	public void setConnection(Connection con){
		this.con = con;
	}
	public String studentLoginID(StudentMemberBean member) {
		String loginId = null;
		String sql = "select Stu_ID from StudentMember where Stu_ID =? and Stu_PW=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getStu_ID());
			pstmt.setString(2, member.getStu_PW());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				loginId = rs.getString("Stu_ID");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return loginId;
	}
	public StudentMemberBean selectMember(String viewID) {
		String sql = "select * from StudentMember where Stu_ID =?";
		StudentMemberBean member = null;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, viewID);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
			member = new StudentMemberBean();
			member.setStu_Num(rs.getInt("Stu_Num"));
			member.setStu_Name(rs.getString("Stu_Name"));
			member.setStu_Gender(rs.getString("Stu_Gender"));
			member.setStu_Birth(rs.getString("Stu_Birth"));
			member.setStu_ID(rs.getString("Stu_ID"));
			member.setStu_PW(rs.getString("Stu_PW"));
			member.setStu_Email(rs.getString("Stu_Email"));
			member.setStu_Phone(rs.getString("Stu_Phone"));
			member.setStu_Address(rs.getString("Stu_Address"));
			member.setLecture_Time(rs.getString("Lecture_Time"));
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return member;
	}
	
}
