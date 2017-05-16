

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/change")
public class ChangeData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ChangeData() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter pw = response.getWriter();
		pw.write("<div><form action='/uebung06servlets/HtwgBook' method='GET'>"
				+ "<div>Vorname <input type='text' name='vorname' value="+session.getAttribute("vorname")+"></div>"
				+ "<div>Nachname <input type='text' name='nachname' value="+session.getAttribute("nachname")+"></div>"
				+ "<div>Studiengang <input type='text' name='studiengang' value="+session.getAttribute("studiengang")+"></div>"
				+ "<input type='submit' value='save'/>"
				+ "</form></div>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
