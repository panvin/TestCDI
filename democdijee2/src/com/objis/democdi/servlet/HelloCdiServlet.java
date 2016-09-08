package com.objis.democdi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.objis.democdi.service.IClientService;

public class HelloCdiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	IClientService service;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		service.crerClient();

		PrintWriter out = response.getWriter();
		out.println("Mise en oeuvre CDI ok. Bravo !!");
		out.close();

	}
}
