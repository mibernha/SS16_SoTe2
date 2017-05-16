

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/autocomplete")
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String[] names = new String[200];

    public AjaxServlet() throws IOException {
        super();
        BufferedReader bf = new BufferedReader(new FileReader("C:/Users/Micha/SoTe2/uebungen07ajax/names.txt"));
        int i = 0;
        String in;
        while((in = bf.readLine()) != null){
        	names[i] = in;
        	i++;
        }
        bf.close();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String teilwort = request.getParameter("name");
		PrintWriter pw = response.getWriter();
		for(int i = 0; i < names.length; i++){
			if(names[i].startsWith(teilwort)){
				pw.write(names[i]);
				pw.flush();
				pw.close();
				return;
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
