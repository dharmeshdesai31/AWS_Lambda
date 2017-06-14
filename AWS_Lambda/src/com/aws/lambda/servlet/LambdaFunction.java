package com.aws.lambda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class LambdaFunction
 */
@WebServlet("/LambdaFunction")
public class LambdaFunction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LambdaFunction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("requestObj", new RequestObject());
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("JSON String............."+request.getParameter("productInfo"));
		try{
			Gson gson = new GsonBuilder().create();
			RequestObject req = gson.fromJson(request.getParameter("productInfo"), RequestObject.class);
			System.out.println(req.toString());
			ResponseObject resObj = new ResponseObject(req.getId(), req.getShippingPrice(), req.getProductTotal(), req.getAddress().getState());
			String responceToSend = gson.toJson(resObj); 
			System.out.println("responceToSend: "+responceToSend);
			//JSONObject jsonObj = new JSONObject(responceToSend);
			response.setContentType("application/json;charset=UTF-8");
			//PrintWriter out = response.getWriter();
			//System.out.println("returned value: "+jsonObj.toString());
			//out.print(jsonObj);
			//out.flush();
			response.getWriter().write(responceToSend);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
