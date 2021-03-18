package EDC.action;



import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EDC.service.EduResgistService;

import member.action.Action;
import vo.ActionForward;
import vo.RegistBean;

public class EduResgistStuAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//교육과정 신청 학생 추가
		
		RegistBean registBean = new RegistBean();
		String Regist_Pro_Check = "N";
		String Regist_Check = "Y";
		
		registBean.setRegist_Num(Integer.parseInt(request.getParameter("id")));//교육과정번호
		registBean.setRegsit_Name(request.getParameter("name"));//이름
		registBean.setRegist_Phone(request.getParameter("phone"));//휴대전화
		registBean.setRegist_Birth(request.getParameter("birth"));//생년월일
		registBean.setRegist_Email(request.getParameter("email"));//이메일
		registBean.setRegist_Pro_Check(Regist_Pro_Check);//신청처리여부
		registBean.setRegist_Check(Regist_Check);//신청여부
		registBean.setRegist_Content(request.getParameter("content"));//내용
		
		
		
		EduResgistService eduResgistService = new EduResgistService(); 
		boolean isResgistSuccess = eduResgistService.resgistStudent(registBean);
		
		if(!isResgistSuccess) {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			
			out.print("<script>");
			out.print("alert('등록실패')");
			out.println("history.back();");
			out.println("</script>");
		}else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			
			out.print("<script>");
			out.print("alert('등록성공')");
			
			out.println("</script>");
		}
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("index.jsp");
		
		
		return forward;
	}

}
