package com.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Note;

@WebServlet("/SaveNoteServlet")
public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SaveNoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			//title, content fetch
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			Note note = new Note(title, content, new Date());
			System.out.println(note.getId()+" : "+note.getTitle());
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
