package task18_6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.*;

@WebSerlet("/HelloServlet")

public class HelloServlet extends HttpServlet{
	/**
	 * @param req
	 * @param res
	 * @throws IOException
	 */
	protected void doGet(HttpServletRequest req,
			HttpServletResponse res) throws IOException {
		Date d = new Date();
		PrintWriter w = res.getWriter();
		res.tContentType("text/html");
		w.write("<html><body>");
		w.write("Today is" + d.toString());
		w.write("</body></html>");
	}
}
