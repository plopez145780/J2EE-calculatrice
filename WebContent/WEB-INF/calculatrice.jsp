<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Calculatrice</title>
	</head>
	<body>
		<div>
			<h1>Calculatrice 2000 !</h1>
			<form method="post" action="/J2EE-calculatrice/">
				<input type="number" name="nombre1">
				<select name="formule">
					<option value="+">+</option>
					<option value="-">-</option>
					<option value="*">*</option>
					<option value="/">/</option>
				</select>
				<input type="number" name="nombre2">
				<button type="submit">Entrer</button>
			</form>
			<p>${ !empty calcul ? "Calcul :" : ""} ${ calcul.nombre1 } ${ calcul.formule } ${ calcul.nombre2 } ${ !empty calcul ? "=" : ""} ${ calcul.resultat }</p>
		</div>
	</body>
</html>