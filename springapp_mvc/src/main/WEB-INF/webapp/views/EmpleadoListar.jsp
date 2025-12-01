<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Empleados</title>
<link rel="stylesheet" href="/styles.css">
</head>
<body>

<h1>Listado de Empleados</h1>
<h2>Haz clic en un DNI para editar</h2>

<table border="1">
    <tr>
        <th>DNI</th>
        <th>Nombre</th>
        <th>Sexo</th>
        <th>Categoría</th>
        <th>Años</th>
    </tr>

    <c:forEach var="empleado" items="${lista}">
        <tr>
            <td>
                <a href="/empleados/editar/${empleado.dni}">
                    <c:out value="${empleado.dni}" />
                </a>
            </td>
            <td><c:out value="${empleado.nombre}" /></td>
            <td><c:out value="${empleado.sexo}" /></td>
            <td><c:out value="${empleado.categoria}" /></td>
            <td><c:out value="${empleado.anyos}" /></td>
        </tr>
    </c:forEach>
</table>

<br>
<a href="/" class="volver">Volver al menú</a>

</body>
</html>
