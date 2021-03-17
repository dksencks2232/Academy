package admin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.action.Action;
import vo.ActionForward;

public class AdminRegisterFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String sessionId = (String)session.getAttribute("id");
		ActionForward forward = null;
		
		if(sessionId == null) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./Admin_LoginForm.ad");  //세션없으면 관리자 로그인페이지로 이동
		} else {
			request.setAttribute("contentPage", "/Admin/AdminRegisterForm.jsp");
			forward = new ActionForward("AdminMain.jsp",false); 
		}  
		return forward;
	}

}
