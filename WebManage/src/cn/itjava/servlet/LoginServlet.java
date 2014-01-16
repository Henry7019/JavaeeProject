package cn.itjava.servlet;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itjava.domain.Log;
import cn.itjava.domain.User;
import cn.itjava.service.LogService;
import cn.itjava.service.UserService;
import cn.itjava.service.impl.LogServiceImpl;
import cn.itjava.service.impl.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String verifycode = request.getParameter("verifycode");
		String rightcode = request.getSession().getAttribute("rightcode")
				.toString();
		
		
		
		if (verifycode.equals(rightcode)) {
			
			User user = new User();
			user.setName(username);
			user.setPassword(password);
			UserService userservice = new UserServiceImpl();
			int leval = userservice.searchInfo(user);
			if(leval>0){
				request.getSession().setAttribute("leval", leval);
				request.getSession().setAttribute("name", username);
				
				LogService logService = new LogServiceImpl();
				Log log = new Log();
				Date time = new Date();
				log.setName(request.getSession().getAttribute("name").toString());
				log.setOpera("��½");
				log.setTime(new Timestamp(time.getTime()));
				logService.addRecord(log);
				
				// ��������ע�⣬��this.getServletContext()
				// �ض��������ǿͻ���ִ�еģ���������Ŀ·������Ҫ������Ŀ����
				response.sendRedirect(request.getContextPath()+"/auth/Index.jsp");
			}else{
				request.setAttribute("str", "�û������������벻��");
				// �������������ˣ���ôת�����ض������Ŀ¼��һ��
				// ת�����Ƿ������˽��еģ�������Ŀ·��
				request.getRequestDispatcher("/Login.jsp").forward(request, response);
			}
		}else{
			request.setAttribute("str", "��֤�����벻��");
			request.getRequestDispatcher("/Login.jsp").forward(request, response);
		}
	}

}
