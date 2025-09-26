package com.example.www_tuan05;

import com.example.www_tuan05.daos.DienThoaiDAO;
import com.example.www_tuan05.daos.impl.DienThoaiDAOImpl;
import com.example.www_tuan05.entities.DienThoai;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/phone-list")
public class PhoneListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        DienThoaiDAO dienThoaiDAO = new DienThoaiDAOImpl(emf);
        try {
            List<DienThoai> list = dienThoaiDAO.getDSDienThoai();
            req.setAttribute("contentPage", "views/phone-list.jsp");
            req.setAttribute("phones", list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
