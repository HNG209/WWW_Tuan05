<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.www_tuan05.entities.DienThoai" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table style="width: 100%" border="1" cellpadding="5">
    <tr>
        <th>Mã</th>
        <th>Tên</th>
        <th>Năm SX</th>
        <th>Cấu hình</th>
        <th>Thao tác</th>
    </tr>

    <c:forEach var="dt" items="${dsDT}">
        <tr>
            <td>${dt.getMaDT()}
            </td>
            <td>${dt.getTenDT()}
            </td>
            <td>${dt.getNamSX()}
            </td>
            <td>${dt.getCauHinh()}
            </td>
            <td>
                <form action="quan-ly-form" method="post" style="margin:0">
                    <input type="hidden" name="id" value="${dt.getMaDT()}">
                    <button type="submit"
                            style="width:100%; background:red; color:white">
                        Xoá
                    </button>
                </form>
            </td>
        </tr>
    </c:forEach>

</table>
