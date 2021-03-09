package vo;

import java.sql.Date;

//질의응답 게시판
public class QNA_BoardBean {
	private int QNA_Board_Num ;// '질의응답 게시판 번호',
	private String QNA_Board_Name ;//'등록자이름',
	private String QNA_Board_Password ;// '등록자비밀번호',
	private String QNA_Board_Title;// '제목',
	private Date QNA_Board_Date ;// '등록일',
	private String QNA_Board_Hit;// '조회수',
	private String QNA_Board_Content;//'내용'
	public int getQNA_Board_Num() {
		return QNA_Board_Num;
	}
	public void setQNA_Board_Num(int qNA_Board_Num) {
		QNA_Board_Num = qNA_Board_Num;
	}
	public String getQNA_Board_Name() {
		return QNA_Board_Name;
	}
	public void setQNA_Board_Name(String qNA_Board_Name) {
		QNA_Board_Name = qNA_Board_Name;
	}
	public String getQNA_Board_Password() {
		return QNA_Board_Password;
	}
	public void setQNA_Board_Password(String qNA_Board_Password) {
		QNA_Board_Password = qNA_Board_Password;
	}
	public String getQNA_Board_Title() {
		return QNA_Board_Title;
	}
	public void setQNA_Board_Title(String qNA_Board_Title) {
		QNA_Board_Title = qNA_Board_Title;
	}
	public Date getQNA_Board_Date() {
		return QNA_Board_Date;
	}
	public void setQNA_Board_Date(Date qNA_Board_Date) {
		QNA_Board_Date = qNA_Board_Date;
	}
	public String getQNA_Board_Hit() {
		return QNA_Board_Hit;
	}
	public void setQNA_Board_Hit(String qNA_Board_Hit) {
		QNA_Board_Hit = qNA_Board_Hit;
	}
	public String getQNA_Board_Content() {
		return QNA_Board_Content;
	}
	public void setQNA_Board_Content(String qNA_Board_Content) {
		QNA_Board_Content = qNA_Board_Content;
	}
	
	
}
