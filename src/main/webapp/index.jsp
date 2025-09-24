<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quản lý Sản Phẩm</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
        }
        /* Khung tổng thể */
        .container {
            border: 1px solid #000;
            width: 800px;
            margin: 20px auto;
            background: #fff;
        }
        /* Header logo */
        .header {
            text-align: center;
            padding: 10px;
            border-bottom: 1px solid #000;
        }
        .header img {
            max-height: 80px;
        }
        /* Thanh menu */
        .menu {
            text-align: center;
            padding: 8px 0;
            border-bottom: 1px solid #000;
            background-color: #f3f3f3;
        }
        .menu a {
            margin: 0 20px;
            text-decoration: none;
            color: #003399;
            font-weight: bold;
        }
        .menu a:hover {
            text-decoration: underline;
        }
        /* Nội dung chính */
        .content {
            min-height: 300px;
            padding: 20px;
        }
        /* Footer */
        .footer {
            border-top: 1px solid #000;
            text-align: center;
            padding: 10px;
            font-size: 14px;
            color: #333;
        }
    </style>
</head>
<body style="display: flex; justify-content: center; align-items: center">
<div class="container">

    <!-- Logo -->
    <div class="header">
        <img style="width: 100%" src="images/logo.png" alt="Logo">
    </div>

    <!-- Menu -->
    <div class="menu">
        <a href="listProducts.jsp">Danh sách sản phẩm</a> |
        <a href="addProduct.jsp">Thêm mới sản phẩm</a> |
        <a href="adminFunctions.jsp">Chức năng quản lý</a>
    </div>

    <!-- Nội dung chính -->
    <div class="content">
        <!-- Nội dung động sẽ được include hoặc code tại đây -->
    </div>

    <!-- Footer -->
    <div class="footer">
        Trần Phúc Hưng – 22671951 – DHKTPM18ATT
    </div>

</div>
</body>
</html>
