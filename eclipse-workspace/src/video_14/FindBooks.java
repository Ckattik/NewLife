package video_14;

import java.io.PrintWriter;

@WebServlet (urlPatterns = "/books" , name = "FindBooks")
public class FindBooks extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		

		
		PrintWriter out = response.getWriter();
		out.println("Hello from FindBooks");
		
		
	}
	
	
	

}
