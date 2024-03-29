package atendimento.model;

import atendente.model.Atendente;
import cliente.model.Cliente;
import equipamento.model.Equipamento;
import ordemService.model.OrdemServico;

public class Atendimento {
	
	private Long id;
	
	private String solicitacao;
	
	private Cliente clienteSolicitacao;
	
	private Atendente  atendente;
	
	private OrdemServico ordemDeServico;
	
	private Equipamento equipamento;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}

	public Cliente getClienteSolicitacao() {
		return clienteSolicitacao;
	}

	public void setClienteSolicitacao(Cliente clienteSolicitacao) {
		this.clienteSolicitacao = clienteSolicitacao;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

	public OrdemServico getOrdemDeServico() {
		return ordemDeServico;
	}

	public void setOrdemDeServico(OrdemServico ordemDeServico) {
		this.ordemDeServico = ordemDeServico;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atendimento other = (Atendimento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
