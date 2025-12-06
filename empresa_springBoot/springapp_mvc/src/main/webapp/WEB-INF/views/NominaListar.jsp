<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consulta de Nóminas</title>
<link rel="stylesheet" href="/styles.css">
</head>
<body>

<h2>Consulta de Nóminas</h2>

<!-- Formulario de búsqueda -->
<form action="/nominas/buscar" method="get">
    <label for="dni">Introduce DNI del empleado:</label>
    <input type="text" name="dni" id="dni" required>
    <button type="submit">Buscar sueldo</button>
</form>

<hr>

<c:if test="${empleado != null && sueldo >= 0}">
    <h3>Información del empleado</h3>

    <table border="1" cellpadding="5">
        <tr><th>DNI</th><td>${empleado.dni}</td></tr>
        <tr><th>Nombre</th><td>${empleado.nombre}</td></tr>
        <tr><th>Sexo</th><td>${empleado.sexo}</td></tr>
        <tr><th>Categoría</th><td>${empleado.categoria}</td></tr>
        <tr><th>Años</th><td>${empleado.anyos}</td></tr>
        <tr><th>Sueldo</th><td>${sueldo} €</td></tr>
    </table>
</c:if>

<c:if test="${sueldo == -1}">
    <p style="color:red;">No se encontró ningún empleado con ese DNI.</p>
</c:if>

<br>
<a href="/" class="volver">Volver al menú</a>

</body>
</html>
