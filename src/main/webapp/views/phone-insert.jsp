<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 9/26/2025
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form style="width: 100%; display: flex; justify-content: center; align-items: center" enctype="multipart/form-data" method="post" action="phone-insert">
    <table style="width: 75%">
        <tr>
            <td>Tên điện thoại</td>
            <td>
                <input style="width: 100%;" type="text" name="name" placeholder="Tên điện thoại">
            </td>
        </tr>
        <tr>
            <td>Năm sản xuất</td>
            <td>
                <input style="width: 100%" type="number" name="year" placeholder="Năm sản xuất">
            </td>
        </tr>
        <tr>
            <td>Cấu hình</td>
            <td>
                <textarea style="width: 100%" name="specs" placeholder="Cấu hình"></textarea>
            </td>
        </tr>
        <tr>
            <td>Hình ảnh</td>
            <td>
                <input style="width: 100%" type="file" name="image" size="50">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <select name="nccId" style="width: 100%;">
                    <c:forEach var="ncc" items="${dsNCC}">
                        <option value="${ncc.maNCC}">
                            ${ncc.tenNCC}
                        </option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button style="width: 100%; margin-top: 30px; background-color: green; color: white" type="submit">Thêm</button>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button style="width: 100%; background-color: red; color: white" type="reset">Xoá</button>
            </td>
        </tr>
    </table>
</form>
