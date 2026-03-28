package com.Employee;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

```
protected void doPost(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {

    response.setContentType("text/html");

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // ✅ TEMP LOGIN (NO DATABASE)
    if ("admin".equals(username) && "admin123".equals(password)) {

        // ✅ Redirect to dashboard
        response.sendRedirect(request.getContextPath() + "/dashboard.html");

    } else {

        // ❌ Invalid login
        response.getWriter().println("<h2>Invalid Username or Password</h2>");
        response.getWriter().println("<a href='index.html'>Try Again</a>");
    }
}
```

}
