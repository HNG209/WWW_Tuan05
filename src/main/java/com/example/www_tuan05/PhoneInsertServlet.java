package com.example.www_tuan05;

import com.example.www_tuan05.daos.DienThoaiDAO;
import com.example.www_tuan05.daos.NhaCungCapDAO;
import com.example.www_tuan05.daos.impl.DienThoaiDAOImpl;
import com.example.www_tuan05.daos.impl.NhaCungCapDAOImpl;
import com.example.www_tuan05.entities.DienThoai;
import com.example.www_tuan05.entities.NhaCungCap;
import jakarta.persistence.EntityManagerFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.util.List;

@WebServlet("/phone-insert")
@MultipartConfig
public class PhoneInsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        NhaCungCapDAO nhaCungCapDAO = new NhaCungCapDAOImpl(emf);
        List<NhaCungCap> list = nhaCungCapDAO.getDSNCC();
        list.forEach(System.out::println);
        req.setAttribute("contentPage", "/views/phone-insert.jsp");
        req.setAttribute("dsNCC", list);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int year = Integer.parseInt(req.getParameter("year"));
        String specs = req.getParameter("specs");
        int idNCC = Integer.parseInt(req.getParameter("nccId"));

        Part imagePart = req.getPart("image"); // javax.servlet.http.Part
        byte[] imageBytes = imagePart.getInputStream().readAllBytes();

        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        DienThoaiDAO dienThoaiDAO = new DienThoaiDAOImpl(emf);
        NhaCungCapDAO nhaCungCapDAO = new NhaCungCapDAOImpl(emf);

        NhaCungCap nhaCungCap = nhaCungCapDAO.findById(idNCC);

        DienThoai dienThoai = DienThoai.builder()
                .tenDT(name)
                .namSX(year)
                .cauHinh(specs)
                .hinhAnh(imageBytes)
                .nhaCungCap(nhaCungCap)
                .build();

        dienThoaiDAO.addDienThoai(dienThoai);

        req.setAttribute("contentPage", "/views/phone-insert.jsp");
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
