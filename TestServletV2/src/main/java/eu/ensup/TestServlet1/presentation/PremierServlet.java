package eu.ensup.TestServlet1.presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PremierServlet
 */
public class PremierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PremierServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String contextpath = request.getContextPath();
		int localport = request.getLocalPort();
		String remoteaddr = request.getRemoteAddr();
		String protocol = request.getProtocol();
		String localaddr = request.getLocalAddr();
		String remoteuser = request.getRemoteUser();
		// Ecriture dans la servlet
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Info HTTP</TITLE></HEAD>");
		out.println("<H1>Méthodes de HTTPREQUEST</H1>");
		out.println("<li>contextpath : " + contextpath);
		out.println("<li>localport : " + localport);
		out.println("<li>remoteaddr : " + remoteaddr);
		out.println("<li>protocol : " + protocol);
		out.println("<li>localaddr : " + localaddr);
		out.println("<li>remoteuser : " + remoteuser);
		out.println("<li>getAuthType :" + request.getAuthType());
		out.println("<li>getMethod : " + request.getMethod());
		out.println("<li>getPathTranslated : " + request.getPathTranslated());
		out.println("<li>getPathTranslated : " + request.getSession());
		out.println("<BODY>");
		out.println("</BODY>");
		out.println("</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// String contextpath = request.getContextPath();
		// int localport = request.getLocalPort();
		// String remoteaddr = request.getRemoteAddr();
		// String protocol = request.getProtocol();
		// String localaddr = request.getLocalAddr();
		// HttpSession maSession = request.getSession();
		// maSession.setAttribute("servlet", protocol);
		// request.setAttribute("localport", localport);
		// RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
		// rs.forward(request, response);
		doGet(request, response);
	}

}
