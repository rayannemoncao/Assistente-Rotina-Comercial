import java.time.LocalDate;

public class ProximaAcao {
    int id;
    String descricao;
    LocalDate dataLimite;
    Prioridade prioridade;
    StatusAcao status;
    Visita visita;



    public void validarProximaAcao () {
        if ((descricao == null ) || (descricao.isBlank())) {
            throw new IllegalArgumentException ("Preencha a descrição.");
        }
        if (dataLimite == null) {
            throw new IllegalArgumentException("Preencha a data limite do compromisso.");
        }
        if (prioridade == null) {
            throw new IllegalArgumentException ("Escolha uma opção.");
        }
        if (status == null) {
            throw new IllegalArgumentException ("Escolha uma opção.");
        }
        if (visita == null) {
            throw new IllegalArgumentException ("Identifique a visita.");
        }
    
    
    }
    public ProximaAcao() {
    }

}
