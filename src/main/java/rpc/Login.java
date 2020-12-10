package rpc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;

import db.DBConnection;
import db.DBConnectionFactory;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//first check if the request has session info. 
		//if not, then redirect to log-in page
		DBConnection connection = DBConnectionFactory.getConnection();
 		JSONObject obj = new JSONObject();

		try {
			HttpSession session = request.getSession(false);
			//flase, has session just return; doesn't have session, do nothing 
			if(session != null) {
				String userId = session.getAttribute("user_id").toString();
	  			obj.put("status", "OK").put("user_id", userId).put("name", connection.getFullname(userId));

			}else {
				response.setStatus(403);
				obj.put("status", "Invalid session");		
			}
	  		 RpcHelper.writeJsonObject(response, obj);
		}catch (Exception e) {
	  		 e.printStackTrace();
	  	 } finally {
	  		 connection.close();
	  	 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DBConnection connection = DBConnectionFactory.getConnection();
	  	 try {
	  		 JSONObject input = RpcHelper.readJSONObject(request);
	  		 String userId = input.getString("user_id");
	  		 String password = input.getString("password");
	  		 JSONObject obj = new JSONObject();
	  		 if(connection.verifyLogin(userId, password)) {
	  			//log in sucessful will return session_id (tomCat will do it)
	  			HttpSession session = request.getSession();//session will bound to response
	  			session.setAttribute("user_id", userId);
	  			session.setMaxInactiveInterval(600);
	  			obj.put("status", "OK").put("user_id", userId).put("name", connection.getFullname(userId));
	  		 }else {
	  			 //log-in failed
	  			 response.setStatus(401); //401 --- user not exists 
	  		 }
	  		 
	  		 RpcHelper.writeJsonObject(response, obj);
	  		
	  	 } catch (Exception e) {
	  		 e.printStackTrace();
	  	 } finally {
	  		 connection.close();
	  	 }
	}

}
