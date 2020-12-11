
package br.com.salao.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Financeiro implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private double valorTotal;
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    private String situacao;
    @ManyToOne
    private Funcionario funcionario;
    @ManyToOne
    private HorarioMarcado horarioMarcado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public HorarioMarcado getHorarioMarcado() {
        return horarioMarcado;
    }

    public void setHorarioMarcado(HorarioMarcado horarioMarcado) {
        this.horarioMarcado = horarioMarcado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Financeiro other = (Financeiro) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorTotal) != Double.doubleToLongBits(other.valorTotal)) {
            return false;
        }
        if (!Objects.equals(this.situacao, other.situacao)) {
            return false;
        }
        if (!Objects.equals(this.dataPagamento, other.dataPagamento)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        if (!Objects.equals(this.horarioMarcado, other.horarioMarcado)) {
            return false;
        }
        return true;
    }
    
    public String toString(){
	return id+ " - " + dataPagamento + " - " + valorTotal + " - " + funcionario;
    }

}
