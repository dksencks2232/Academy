package admin.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.svc.AdminRegisterService;
import member.action.Action;
import vo.ActionForward;
import vo.TeacherBean;
//직원 등록하는 action 클래스
public class AdminRegisterAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		TeacherBean teacher = new TeacherBean();
		boolean registResult = false;
		
		teacher.setTeacher_ID(request.getParameter("id"));
		teacher.setEdc_Num((Integer.parseInt(request.getParameter("search"))));
		teacher.setTeacher_PW(request.getParameter("password"));
		teacher.setTeacher_Name(request.getParameter("name"));
		teacher.setTeacher_Gender(request.getParameter("gender"));
		teacher.setTeacher_Phone(request.getParameter("tel"));
		teacher.setTeacher_Grade(request.getParameter("grade"));
		
		AdminRegisterService adminRegisterService = new AdminRegisterService();
		registResult = adminRegisterService.registAdmin(teacher);
		
		ActionForward forward = null;
		
		if(registResult == false) {
			response.setContentType("text/html;charset=UTF-8");
   			PrintWriter out = response.getWriter();
   			out.println("<script>");
   			out.println("alert('직원등록실패')");
   			out.println("history.back()");
   			out.println("</script>");
		} else {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./AdminListAction.ad");
		}
		
		return forward;
	}

}
