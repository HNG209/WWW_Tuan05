<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*,com.example.www_tuan05.entities.DienThoai" %>
<table style="width: 100%" border="1" cellpadding="5">
    <tr>
        <th>Mã</th>
        <th>Tên</th>
        <th>Năm SX</th>
        <th>Cấu hình</th>
    </tr>
    <%
        List<DienThoai> products = (List<DienThoai>) request.getAttribute("phones");
        if (products != null) {
            for (DienThoai d : products) {
    %>
    <tr>
        <td><%=d.getMaDT()%></td>
        <td><%=d.getTenDT()%></td>
        <td><%=d.getNamSX()%></td>
        <td><%=d.getCauHinh()%></td>
    </tr>
    <%      }
    }
    %>
</table>
