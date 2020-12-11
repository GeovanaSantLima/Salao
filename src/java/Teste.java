
import br.com.salao.dao.HibernateUtil;
import br.com.salao.dao.ServicoDAO;
import br.com.salao.vo.Servico;


public class Teste {
    public static void main(String [] args){
        Servico s = new Servico();
        s.setNome("Corte de cabelo");
        s.setValor(10);
        
        new ServicoDAO().salvar(s);
        
        System.out.println("Serviço salvo com sucesso");
    
    }
}
