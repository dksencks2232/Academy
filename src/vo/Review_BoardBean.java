package vo;

import java.sql.Date;

//수강후기 게시판
public class Review_BoardBean {
	private int Review_Board_Num;//'수강후기 게시판번호',
	private int Stu_Num;//'학생_번호',
	private String Review_Board_Title;//'제목',
	private Date Review_Board_Date;//'등록일',
	private String Review_Board_Hit;//'조회수',
	private String Review_Board_Content;//'내용',
	public int getReview_Board_Num() {
		return Review_Board_Num;
	}
	public void setReview_Board_Num(int review_Board_Num) {
		Review_Board_Num = review_Board_Num;
	}
	public int getStu_Num() {
		return Stu_Num;
	}
	public void setStu_Num(int stu_Num) {
		Stu_Num = stu_Num;
	}
	public String getReview_Board_Title() {
		return Review_Board_Title;
	}
	public void setReview_Board_Title(String review_Board_Title) {
		Review_Board_Title = review_Board_Title;
	}
	public Date getReview_Board_Date() {
		return Review_Board_Date;
	}
	public void setReview_Board_Date(Date review_Board_Date) {
		Review_Board_Date = review_Board_Date;
	}
	public String getReview_Board_Hit() {
		return Review_Board_Hit;
	}
	public void setReview_Board_Hit(String review_Board_Hit) {
		Review_Board_Hit = review_Board_Hit;
	}
	public String getReview_Board_Content() {
		return Review_Board_Content;
	}
	public void setReview_Board_Content(String review_Board_Content) {
		Review_Board_Content = review_Board_Content;
	}
	
	
}
