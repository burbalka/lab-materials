package org.exadel.todos.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static Logger logger = Logger.getLogger(LoginServlet.class.getName());
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");

		// TODO Credential Check
		logger.info(login + " Authorization...");

		HttpSession session = request.getSession();
		session.setAttribute("user", login);
		response.sendRedirect(request.getContextPath() + "/index.html");
	}

}
