package farma.utp.AppFarmacia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="laboratorios")
public class Laboratorios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "codigo", nullable = false, length = 50)
	private String codigo;
	@Column(name = "nombrelab", nullable = false, length = 50)
	private String nombrelab;
	@Column(name = "preciog", nullable = false, length = 50)
	private double preciog;
	@Column(name = "preciom", nullable = false, length = 50)
	private double preciom;
	public Laboratorios() {
		
	}
	public Laboratorios(long id, String codigo, String nombrelab, double preciog, double preciom) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombrelab = nombrelab;
		this.preciog = preciog;
		this.preciom = preciom;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombrelab() {
		return nombrelab;
	}
	public void setNombrelab(String nombrelab) {
		this.nombrelab = nombrelab;
	}
	public double getPreciog() {
		return preciog;
	}
	public void setPreciog(double preciog) {
		this.preciog = preciog;
	}
	public double getPreciom() {
		return preciom;
	}
	public void setPreciom(double preciom) {
		this.preciom = preciom;
	}
	
}
