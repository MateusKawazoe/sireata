package br.edu.utfpr.dv.sireata.model;

import javax.persistence.*;

@Entity // Define que esta classe é uma entidade a ser mapeada
@Table(name = "anexo") // Define o nome desta tabela para o banco de dados
public class Anexo {
	
	@Id // Normalmente define qual é a primary key das tabelas
	private int idAnexo;
	@Column(name = "ata") // Informa o nome da coluna e o tipo de dado, os quais serão enviados para o banco de dados
	private Ata ata;
	@Column(name = "ordem")
	private int ordem;
	@Column(name = "descricao")
	private String descricao;
	@Column(name = "arquivo")
	private byte[] arquivo;
	
	public Anexo() {
		this.setIdAnexo(0);
		this.setAta(new Ata());
		this.setDescricao("");
		this.setOrdem(0);
		this.setArquivo(null);
	}
	
	public int getIdAnexo() {
		return idAnexo;
	}
	public void setIdAnexo(int idAnexo) {
		this.idAnexo = idAnexo;
	}
	public Ata getAta() {
		return ata;
	}
	public void setAta(Ata ata) {
		this.ata = ata;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getOrdem() {
		return ordem;
	}
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	public byte[] getArquivo() {
		return arquivo;
	}
	public void setArquivo(byte[] arquivo) {
		this.arquivo = arquivo;
	}

}
