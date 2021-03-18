package EDC.service;

import java.sql.Connection;

import dao.EdcDAO;

import static db.JdbcUtil.*;
import vo.RegistBean;

public class EduResgistService {

	public boolean resgistStudent(RegistBean registBean) {
		boolean isResgistStudent = false;
		Connection con = null;
		
		try {
			con = getConnection();
			EdcDAO resgistDAO = EdcDAO.getinstance();
			resgistDAO.setConnection(con);
			
			int resgistCount = resgistDAO.resgistStudent(registBean);
			
			if(resgistCount > 0) {
				isResgistStudent = true;
				commit(con);
			}else {
				isResgistStudent = false;
				rollback(con);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con);
		}
		return isResgistStudent;
	}

}
