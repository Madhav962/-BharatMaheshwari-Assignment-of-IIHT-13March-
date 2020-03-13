

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.ConfigFile;

import jdk.nashorn.internal.runtime.regexp.joni.Config;


public class ConnectionServlet extends HttpServlet {

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");  
	PrintWriter out = resp.getWriter();  
	          
	String n=req.getParameter("fname");  
	String l=req.getParameter("lname"); 
	String i=req.getParameter("EId");
	String d=req.getParameter("designation");  
	String de=req.getParameter("department");
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/form";
		java.sql.Connection con=DriverManager.getConnection(url, "root", "root");
		
		java.sql.PreparedStatement ps=con.prepareStatement("insert into form values(?,?,?,?,?)");  
				  
				ps.setString(1,n);  
				ps.setString(2,l);  
				ps.setString(3,i);  
				ps.setString(4,d);
				ps.setString(5,de);
				          
				int k=ps.executeUpdate();  
				if(k>0)  
				out.print("You are successfully registered...");  		
				  
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	out.close();
}

}
