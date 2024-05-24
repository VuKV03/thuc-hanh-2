<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- https://mvnrepository.com/artifact/javax.servlet/jstl -->
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>QUẢN LÝ THÔNG TIN SINH VIÊN</title>
<style><%@include file="style.css"%></style>

</head>
<body>

	<div class="container">
    <div class="row">
      <div class="col-md-8">
      <form method="post" action='svlSV'>
        <table>
          <tbody>
            <tr>
              <td class="form-title" colspan="3">Quản lý sinh viên</td>
            </tr>         
            <tr>
              <td>Mã SV:</td>
              <td>
                <input id="parmasv" type="text" name="parmasv" placeholder="Mã sinh viên" size="20" required pattern="\S+">
              </td>
              <td></td>
            </tr>
            <tr>
              <td>Họ đệm:</td>
              <td>
                <input id="parhodemsv" type="text" name="parhodemsv" placeholder="Họ đệm" size="30" >
              </td>
              <td>Tên: 
                <input id="partensv" type="text" name="partensv" placeholder="Tên" size="10" required pattern="\S+">
              </td>
            </tr>
            <tr>
              <td>Số điện thoại:</td>
              <td>
                <input id="partelsv" type="text" name="partelsv" placeholder="Số điện thoại" size="30" required pattern="\S+">
              </td>
              <td></td>
            </tr>
            <tr>
              <td>Email:</td>
              <td>
                <input id="paremailsv" type="text" name="paremailsv" placeholder="Email" size="30" required pattern="\S+">
              </td>
              <td></td>
            </tr>
            <tr>
              <td colspan="3">&nbsp;</td>
            </tr>
            <tr>
              <td>
              	<div class="button-container">
                  <button type="submit" value="add" name="action">Lưu</button>
                </div>
              </td>
              <td>
                <div class="button-container">
                  <button type="submit" name="action" value="modify">Sửa</button>
                </div>
              </td>
              <td>
                <div class="button-container">
                  <button type="submit" name="action" value="delete">Xóa</button>
                </div>
              </td>            
            </tr>
          </tbody>
        </table>
	</form>
        <br>
        <br>
        <div class="list-std">
          Thông tin sinh viên:
        </div>
        <br>
        <table>
          <thead>
            <tr class="title-table">
              <th scope="row">
                Mã SV</th>
              <th>Họ đệm</th>
              <th>Tên</th>
              <th>Số điện thoại</th>
              <th>Email</th>
            </tr>
          </thead>
          <tbody>
          <c:forEach items="${listS}" var="o">
            	<tr>
	                <td>${o.masv}</td>
	                <td>${o.hodem}</td>
	                <td>${o.tensv}</td>
	                <td>${o.telsv}</td>
	                <td>${o.emailsv}</td>
            	</tr>
        	</c:forEach>
          </tbody>
        </table>
      </div>
    </div>
  </div>
  
</body>
</html>