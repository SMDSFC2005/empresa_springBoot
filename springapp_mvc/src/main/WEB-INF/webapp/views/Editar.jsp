<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Empleado</title>
<link rel="stylesheet" href="/styles.css">
</head>
<body>

<h1>Editar Empleado</h1>

<form action="/empleados/editar" method="post">
    
    <!-- Campo oculto para persistir el DNI -->
    <input type="hidden" name="dni" value="${empleado.dni}" />

    <table border="1">
        <tr>
            <td>Nombre:</td>
            <td>
                <input type="text" name="nombre" size="50" value="${empleado.nombre}" required>
            </td>
        </tr>

        <tr>
            <td>Sexo (M/F):</td>
            <td>
                <input type="text" name="sexo" size="1" maxlength="1" value="${empleado.sexo}" required>
            </td>
        </tr>

        <tr>
            <td>Categoría:</td>
            <td>
                <input type="number" name="categoria" min="1" max="10" value="${empleado.categoria}" required>
            </td>
        </tr>

        <tr>
            <td>Años:</td>
            <td>
                <input type="number" name="anyos" min="0" value="${empleado.anyos}" required>
            </td>
        </tr>
    </table>

    <br>
    <input type="submit" value="Guardar cambios">
</form>

<br>
<a href="/" class="volver">Volver al menú</a>

</body>
</html>
