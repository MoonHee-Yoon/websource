package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// post 방식에서 깨지는 한글 보완 / 이거 아래에다 하면 안 됨.
		request.setCharacterEncoding("utf-8");
		
		// 사용자가 보낸 값 가져오기
		// 웹에서 넘어오는 값은 String이라고 보면 됨
		// 여기 username 자리에 뭐 넣을거냐는 보내는 페이지(hello) name에 넣은 거로
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		
		// 사용자가 보낸 값 확인 -> 브라우저 화면에 출력
		response.setContentType("text/html;charset=utf-8");
		// get 방식 : 위에꺼 치면 한글 안 깨짐. 빼고 하면 한글 깨져 / post 방식은 깨짐
		
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>결과값 확인</title><head>");
		out.print("<body><h2>결과값 확인</h2>");
		out.print("<ul><li>username : " + username + "</li>");
		out.print("<li>age : " + age + "</li>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
