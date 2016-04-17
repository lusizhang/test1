<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<body>
<table style="text-align: center;font-size: 30px">
	<tr>
		<th>序号</th>
		<th>学号</th>
		<th>姓名</th>
		<th>性别</th>
		<th>年级</th>
		<th>班级</th>
		<th>学院</th>
		<th>生日</th>
		<th>是否好学生</th>
		<th>修改</th>

	</tr>
		<tr>
			<td>${student.getId}</td>
			<td>${student.getStudentNumber}</td>
			<td>${student.getStudentName}</td>
			<td>${student.getSex}</td>
			<td>${student.getGrade}</td>
			<td>${student.getClassNumber}</td>
			<td>${student.getCollege}</td>
			<td>${student.getBirthday}</td>
			<td>${student.getIsGoodStudent}</td>


			<td><a href="${website}student/personalInfo">修改</a></td>
		</tr>

</table>

</body>
</html>