package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classInterfaces.iAction;

public class aSearch implements iAction {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		
		return "WEB-INF/SHPages/Search.jsp";
	}

}
