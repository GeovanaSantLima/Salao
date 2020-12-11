
package br.com.salao.vo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ServicoMarcado implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Servico servico;
    @ManyToOne
    private HorarioMarcado horarioMarcado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public HorarioMarcado getHorarioMarcado() {
        return horarioMarcado;
    }

    public void setHorarioMarcado(HorarioMarcado horarioMarcado) {
        this.horarioMarcado = horarioMarcado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final ServicoMarcado other = (ServicoMarcado) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.servico, other.servico)) {
            return false;
        }
        if (!Objects.equals(this.horarioMarcado, other.horarioMarcado)) {
            return false;
        }
        return true;
    }
}
