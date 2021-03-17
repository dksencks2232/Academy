package admin.svc;

import dao.AdminDAO;
import vo.TeacherBean;
import static db.JdbcUtil.*;

import java.sql.Connection;

public class AdminRegisterService {

	public boolean registAdmin(TeacherBean teacher) {  //직원등록
		boolean registSuccess = false;
		AdminDAO adminDAO = AdminDAO.getInstance();
		Connection con = getConnection();
		
		int insertCount = adminDAO.insertAdmin(teacher);
		
		if(insertCount > 0) {
			registSuccess = true;
			commit(con);
			System.out.println("직원 등록 완료");
		} else {
			rollback(con);
			System.out.println("직원 등록 실패");
		}
		return registSuccess;
	}

}
