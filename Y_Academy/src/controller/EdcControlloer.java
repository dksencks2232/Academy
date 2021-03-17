package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EDC.action.EduListAction;
import EDC.action.EduResgistStuAction;
import EDC.action.EduViewAction;
import member.action.Action;
import vo.ActionForward;

/**
 * Servlet implementation class EdcControlloer
 */
@WebServlet("*.edc")
public class EdcControlloer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EdcControlloer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request,response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		request.setCharacterEncoding("utf-8");
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		ActionForward forward = null;
		Action action = null;
		
		System.out.println("requestURI : " + RequestURI);
		System.out.println("contextPath : " + contextPath);
		System.out.println("command : " + command);
		
		if(command.equals("/educationList.edc")) {//과정보기 리스트로 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			request.setAttribute("pagefile", "education2.jsp");
			forward.setPath("index2.jsp");
		}else if(command.equals("/educationListAction.edc")) {//과정보기 리스트 액션
			action = new EduListAction();
			try {
				forward = action.execute(request, response);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/educationView.edc")) {//과정 상세보기
			
			action = new EduViewAction();
			try {
				forward = action.execute(request, response);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/Regist.edc")) {//수강신청뷰
			
			request.setAttribute("id", request.getParameter("id"));//과목코드를 view에서 받음
			request.setAttribute("subject", request.getParameter("subject"));//과목명을 view에서 받음
			
			forward = new ActionForward();
			forward.setRedirect(false);
			request.setAttribute("pagefile", "/Student/Regist.jsp");
			
			
			forward.setPath("/index2.jsp");
		}else if(command.equals("/ResgistStudent.edc")) {//과정 상세보기
			
			action = new EduResgistStuAction();
			try {
				forward = action.execute(request, response);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("forward : " + forward.getPath());
		//페이지 이동
		if(forward != null) {
			if(forward.isRedirect()){
				response.sendRedirect(forward.getPath());
			
			}else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}
	
	
	
}
