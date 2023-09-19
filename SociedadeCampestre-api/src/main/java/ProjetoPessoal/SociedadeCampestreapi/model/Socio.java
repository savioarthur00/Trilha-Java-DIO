package ProjetoPessoal.SociedadeCampestreapi.model;


import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tab_socios")
public class Socio {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;
	
	
    @Column(length = 50, nullable = false)
    private String name;
    
 
    @Column(length = 50, nullable = false)
    private String data_nascimento;
    
    @Column(length = 50, nullable = false)
    private String formaDePagamento;
        
    @Column(length = 50, nullable = false)
    private String status;
         
    @OneToOne(cascade = CascadeType.ALL)
    private Contato contato;
    
    @ManyToOne
    private Endereco endereco;
    
	public Socio() {
	
	}
	public Socio(String name, String data_nascimento, String formaDePagamento, String status) {
		super();
		this.name = name;
		this.data_nascimento =  data_nascimento;
		this.formaDePagamento = formaDePagamento;
		this.status = status;
	}
			
	@Override
	public String toString() {
		return "Socio [name=" + name + ", data_nascimento=" + data_nascimento + ", formaDePagamento=" + formaDePagamento
				+ ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Socio))
			return false;
		Socio other = (Socio) obj;
		return Objects.equals(id, other.id);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

    
    
	

}
