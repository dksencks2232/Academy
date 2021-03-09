package vo;
//강사
public class TeacherBean {
	private String Teacher_ID;//'강사_아이디',
	private int EDC_Num;//'교육과정_번호',
	private String Teacher_Name;//'강사_이름',
	private String Teacher_Gender;//'강사_성별',
	private String Teacher_Phone;//'강사_휴대전화',
	private String Teacher_Grade;//'강사_등급',
	private String Teacher_PW;//'강사_비밀번호',
	public String getTeacher_ID() {
		return Teacher_ID;
	}
	public void setTeacher_ID(String teacher_ID) {
		Teacher_ID = teacher_ID;
	}
	public int getEDC_Num() {
		return EDC_Num;
	}
	public void setEDC_Num(int eDC_Num) {
		EDC_Num = eDC_Num;
	}
	public String getTeacher_Name() {
		return Teacher_Name;
	}
	public void setTeacher_Name(String teacher_Name) {
		Teacher_Name = teacher_Name;
	}
	public String getTeacher_Gender() {
		return Teacher_Gender;
	}
	public void setTeacher_Gender(String teacher_Gender) {
		Teacher_Gender = teacher_Gender;
	}
	public String getTeacher_Phone() {
		return Teacher_Phone;
	}
	public void setTeacher_Phone(String teacher_Phone) {
		Teacher_Phone = teacher_Phone;
	}
	public String getTeacher_Grade() {
		return Teacher_Grade;
	}
	public void setTeacher_Grade(String teacher_Grade) {
		Teacher_Grade = teacher_Grade;
	}
	public String getTeacher_PW() {
		return Teacher_PW;
	}
	public void setTeacher_PW(String teacher_PW) {
		Teacher_PW = teacher_PW;
	}
	
	
}
