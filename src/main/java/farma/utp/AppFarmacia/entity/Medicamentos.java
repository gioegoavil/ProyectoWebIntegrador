package farma.utp.AppFarmacia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicamentos")
public class Medicamentos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "codigo", nullable = false, length = 50)
	private String codigo;
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	@Column(name = "fechavenc", nullable = false, length = 50)
	private String fechavenc;
	@Column(name = "stock", nullable = false, length = 50)
	private int stock;


	public Medicamentos() {

	}

	public Medicamentos(long id, String codigo, String nombre, String fechavenc, int stock) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechavenc = fechavenc;
		this.stock = stock;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechavenc() {
		return fechavenc;
	}

	public void setFechavenc(String fechavenc) {
		this.fechavenc = fechavenc;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
