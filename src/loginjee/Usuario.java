package loginjee;

import java.sql.ResultSet;
import java.sql.SQLException;

//BEAN DE USUARIO - entity porque guarda relación con una tabla
public class Usuario implements Comparable<Usuario>{
	
	private int id;
	private String nombre;
	private String pwd;
	
	
	public Usuario(int id, String nombre, String pwd) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pwd = pwd;
	}
	
	public Usuario (ResultSet resultSet) throws SQLException
	{
		super();
		this.nombre = resultSet.getString(2);
		this.id = resultSet.getInt(1);
		this.pwd = resultSet.getString(3);
	}
	
	public Usuario(String nombre, String pwd) {
		super();
		this.nombre = nombre;
		this.pwd = pwd;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID = " + this.id  +" NOMBRE = "+ this.nombre + " PASS " + this.pwd;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	//SI + --> MAYOR THIS
	//SI - --> MENOR THIS (MAYOR o)
	//SI 0 --> son iguales
	//ORDENAR LA LISTA POR PASSWORD

	@Override
	public int compareTo(Usuario o) {
		// TODO Auto-generated method stub
		int resultado = 0;
		
			resultado = this.getPwd().compareTo(o.getPwd());
		
		return resultado;
	}
	
	

}
