

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/HtwgBook")
public class HtwgBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public HtwgBook() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("vorname", request.getParameter("vorname"));
		session.setAttribute("nachname", request.getParameter("nachname"));
		session.setAttribute("studiengang", request.getParameter("studiengang"));
		PrintWriter pw = response.getWriter();
		pw.write("<table><form action='/uebung06servlets/change' method='GET'>"
				+ "<tr><th>Vorname</th><td>" + session.getAttribute("vorname") + "</td><td><input type='submit' value='ändern'/></td></tr>"
				+ "<tr><th>Nachname</th><td>" + session.getAttribute("nachname") + "</td><td><input type='submit' value='ändern'/></td></tr>"
				+ "<tr><th>Studiengang</th><td>" + session.getAttribute("studiengang") + "</td><td><input type='submit' value='ändern'/></td></tr>"
				+ "</form></table>");
		pw.flush();
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
