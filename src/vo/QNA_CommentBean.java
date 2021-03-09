package vo;

import java.sql.Date;

//질의응답 게시판댓글
public class QNA_CommentBean {
	private int QNA_Com_Num ;// '댓글번호',
	private String Teacher_ID;// '강사_아이디',
	private Date QNA_Com_Date;// '등록일',
	private String QNA_Com_Content;// '내용',
	private int QNA_Com_Re_Ref;//'부모글넘버',
	private int QNA_Com_lvl;//'댓글레벨',
	private int QNA_Board_Num;//'질의응답 게시판 번호',
	public int getQNA_Com_Num() {
		return QNA_Com_Num;
	}
	public void setQNA_Com_Num(int qNA_Com_Num) {
		QNA_Com_Num = qNA_Com_Num;
	}
	public String getTeacher_ID() {
		return Teacher_ID;
	}
	public void setTeacher_ID(String teacher_ID) {
		Teacher_ID = teacher_ID;
	}
	public Date getQNA_Com_Date() {
		return QNA_Com_Date;
	}
	public void setQNA_Com_Date(Date qNA_Com_Date) {
		QNA_Com_Date = qNA_Com_Date;
	}
	public String getQNA_Com_Content() {
		return QNA_Com_Content;
	}
	public void setQNA_Com_Content(String qNA_Com_Content) {
		QNA_Com_Content = qNA_Com_Content;
	}
	public int getQNA_Com_Re_Ref() {
		return QNA_Com_Re_Ref;
	}
	public void setQNA_Com_Re_Ref(int qNA_Com_Re_Ref) {
		QNA_Com_Re_Ref = qNA_Com_Re_Ref;
	}
	public int getQNA_Com_lvl() {
		return QNA_Com_lvl;
	}
	public void setQNA_Com_lvl(int qNA_Com_lvl) {
		QNA_Com_lvl = qNA_Com_lvl;
	}
	public int getQNA_Board_Num() {
		return QNA_Board_Num;
	}
	public void setQNA_Board_Num(int qNA_Board_Num) {
		QNA_Board_Num = qNA_Board_Num;
	}
	
	
}
