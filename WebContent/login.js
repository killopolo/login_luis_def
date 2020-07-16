/**
 * 
 */

//todo OBTENER LOS DATOS DEL FORMULARIO LOGIN Y PWD INTRODUCIDOS
//POR EL CLIENTE
//Y ENVIARLOS AL SERVIDOR, PARA COMPROBAR SI ESE USUARIO EXISTE
//O ESTÁ REGISTRADO
const URL_LOGIN = "http://localhost:8080/loginjee/Login"

//https://www.bing.com/search?q=realm+adrid&cvid=6da69e504f24467c997e6a1210719880&FORM=ANNTA1&PC=U531
//SERVICIO ES SINÓNIMO DE Servlet en JAVA
var xhr = new XMLHttpRequest();
function servidorlogin()
{
	console.log("Entrando al servidor");
	var name = document.getElementById("nombre").value;
	var password = document.getElementById("pwd").value;
	
	var usuario = {nombre:name,pwd:password};
	
	var jsonusuario = JSON.stringify(usuario);
	console.log(jsonusuario);
	//si en vio info dsede el cliente al servidor debe usar post
	
	
	//TODO usar AJAX para enviar al servidor los datos
	xhr.open ("POST", URL_LOGIN);
	xhr.onreadystatechange = respuestaLogin;//programar el callback
    xhr.send(jsonusuario);
    //console.log ("la respuesta del soervidor ha sido ..");

	
}

function respuestaLogin ()
{
	//esta función será invocada cuando vuelva del servidor
	console.log("ha vuelto del servidor");
	
}


