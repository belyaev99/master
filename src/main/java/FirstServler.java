import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

public class FirstServler extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

        String name = request.getParameter("name");
        String email = request.getParameter("email");

        FormProcessor formProcessor = new FormProcessor();

        String result = formProcessor.processForm(name, email);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Form Submit Result:</h1>");
        out.print(result);
        out.println("</body></html>");
    }
}

