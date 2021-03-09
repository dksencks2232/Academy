package vo;

import java.sql.Date;
// 신청
public class RegistBean {
	private int Regist_Num ;// '신청_번호',
	private int EDC_Num;// '교육과정_번호',
	private String Regsit_Name;// '신청_이름',
	private String Regist_Birth;//'신청_생년월일',
	private String Regist_Phone ;//'신청_휴대전화',
	private String Regist_Email;//'신청_이메일',
	private Date Regist_Date;//'신청_날짜',
	private String Regist_Pro_Check;//'신청_처리여부',
	private String Regist_Check;// '신청_여부',
	private String Regist_Content;//'신청_내용',
	public int getRegist_Num() {
		return Regist_Num;
	}
	public void setRegist_Num(int regist_Num) {
		Regist_Num = regist_Num;
	}
	public int getEDC_Num() {
		return EDC_Num;
	}
	public void setEDC_Num(int eDC_Num) {
		EDC_Num = eDC_Num;
	}
	public String getRegsit_Name() {
		return Regsit_Name;
	}
	public void setRegsit_Name(String regsit_Name) {
		Regsit_Name = regsit_Name;
	}
	public String getRegist_Birth() {
		return Regist_Birth;
	}
	public void setRegist_Birth(String regist_Birth) {
		Regist_Birth = regist_Birth;
	}
	public String getRegist_Phone() {
		return Regist_Phone;
	}
	public void setRegist_Phone(String regist_Phone) {
		Regist_Phone = regist_Phone;
	}
	public String getRegist_Email() {
		return Regist_Email;
	}
	public void setRegist_Email(String regist_Email) {
		Regist_Email = regist_Email;
	}
	public Date getRegist_Date() {
		return Regist_Date;
	}
	public void setRegist_Date(Date regist_Date) {
		Regist_Date = regist_Date;
	}
	public String getRegist_Pro_Check() {
		return Regist_Pro_Check;
	}
	public void setRegist_Pro_Check(String regist_Pro_Check) {
		Regist_Pro_Check = regist_Pro_Check;
	}
	public String getRegist_Check() {
		return Regist_Check;
	}
	public void setRegist_Check(String regist_Check) {
		Regist_Check = regist_Check;
	}
	public String getRegist_Content() {
		return Regist_Content;
	}
	public void setRegist_Content(String regist_Content) {
		Regist_Content = regist_Content;
	}
	
	
}
