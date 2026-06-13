package comServlet.HeaderServlet.CGI;

public class HelloCGI {

	public static void main(String[] args) {
		 System.out.println("Content-Type:text/html\n\n");
		 	System.out.println("<html>");
	        System.out.println("<body>");
	        System.out.println("<h2>Hello CGI Program</h2>");
	        System.out.println("</body>");
	        System.out.println("</html>");
	}
}
