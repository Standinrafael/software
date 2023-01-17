package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.util.List;

public class EstudianteSencillo {

	private String nombre;

	private String apellido;

	private List<Materia> listaMateria;

	private BigDecimal materia1;
	private BigDecimal materia2;
	private BigDecimal materia3;
	private BigDecimal materia4;
	private BigDecimal materia5;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<Materia> getListaMateria() {
		return listaMateria;
	}

	public void setMateria(List<Materia> listaMateria) {
		this.listaMateria = listaMateria;
	}

	public BigDecimal getMateria1() {
		return materia1;
	}

	public void setMateria1(BigDecimal materia1) {
		this.materia1 = materia1;
	}

	public BigDecimal getMateria2() {
		return materia2;
	}

	public void setMateria2(BigDecimal materia2) {
		this.materia2 = materia2;
	}

	public BigDecimal getMateria3() {
		return materia3;
	}

	public void setMateria3(BigDecimal materia3) {
		this.materia3 = materia3;
	}

	public BigDecimal getMateria4() {
		return materia4;
	}

	public void setMateria4(BigDecimal materia4) {
		this.materia4 = materia4;
	}

	public BigDecimal getMateria5() {
		return materia5;
	}

	public void setMateria5(BigDecimal materia5) {
		this.materia5 = materia5;
	}

	public void setListaMateria(List<Materia> listaMateria) {
		this.listaMateria = listaMateria;
	}

	@Override
	public String toString() {
		return "EstudianteSencillo [nombre=" + nombre + ", apellido=" + apellido + ", materia1=" + materia1
				+ ", materia2=" + materia2 + ", materia3=" + materia3 + ", materia4=" + materia4 + ", materia5="
				+ materia5 + "]";
	}

}
