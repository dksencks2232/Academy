package vo;

import java.sql.Date;

//출석
public class AttendBean {
	private int Stu_Num ;// '학생_번호',
	private int Attend_Check ; // '출석체크',
	private int Attend_Late;  // '지각체크',
	private int Attend_Leave;  // '결석체크',
	private int Attend_Day ; //'출석일수',
	private Date Attend_StartTime ; // '입실시간',
	private Date Attend_endTime; // '퇴실시간',
	public int getStu_Num() {
		return Stu_Num;
	}
	public void setStu_Num(int stu_Num) {
		Stu_Num = stu_Num;
	}
	public int getAttend_Check() {
		return Attend_Check;
	}
	public void setAttend_Check(int attend_Check) {
		Attend_Check = attend_Check;
	}
	public int getAttend_Late() {
		return Attend_Late;
	}
	public void setAttend_Late(int attend_Late) {
		Attend_Late = attend_Late;
	}
	public int getAttend_Leave() {
		return Attend_Leave;
	}
	public void setAttend_Leave(int attend_Leave) {
		Attend_Leave = attend_Leave;
	}
	public int getAttend_Day() {
		return Attend_Day;
	}
	public void setAttend_Day(int attend_Day) {
		Attend_Day = attend_Day;
	}
	public Date getAttend_StartTime() {
		return Attend_StartTime;
	}
	public void setAttend_StartTime(Date attend_StartTime) {
		Attend_StartTime = attend_StartTime;
	}
	public Date getAttend_endTime() {
		return Attend_endTime;
	}
	public void setAttend_endTime(Date attend_endTime) {
		Attend_endTime = attend_endTime;
	}
	
}
