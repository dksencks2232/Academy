package admin.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import admin.svc.AdminListService;
import member.action.Action;
import vo.ActionForward;
import vo.TeacherBean;

public class AdminListAction implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		ActionForward forward = null;
		if(id == null) {					// 아이디가 없을 때
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./Admin_LoginForm.ad");
		} else {							//아이디가 존재할때
			
			AdminListService adminListService = new AdminListService();
			ArrayList<TeacherBean> allList = adminListService.getAllList();
			
			request.setAttribute("allList", allList);
			request.setAttribute("contentPage", "/Admin/AdminListForm.jsp");		//관리자 리스트 폼 경로를 넣어줌
			forward = new ActionForward("AdminMain.jsp",false);
			
		}
		return forward;
	}

}
