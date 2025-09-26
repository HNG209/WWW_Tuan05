package com.example.www_tuan05;

import com.example.www_tuan05.daos.DienThoaiDAO;
import com.example.www_tuan05.daos.impl.DienThoaiDAOImpl;
import com.example.www_tuan05.entities.DienThoai;
import jakarta.persistence.EntityManagerFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/quan-ly-form")
public class QuanLyFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        DienThoaiDAO dienThoaiDAO = new DienThoaiDAOImpl(emf);
        List<DienThoai> list = dienThoaiDAO.getDSDienThoai();

        req.setAttribute("dsDT", list);
        req.setAttribute("contentPage", "/views/quan-ly-form.jsp");
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        DienThoaiDAO dienThoaiDAO = new DienThoaiDAOImpl(emf);

        long maDT = Long.parseLong(req.getParameter("id"));
        dienThoaiDAO.removeDienThoai(maDT);

        List<DienThoai> list = dienThoaiDAO.getDSDienThoai();

        req.setAttribute("dsDT", list);
        req.setAttribute("contentPage", "/views/quan-ly-form.jsp");
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
