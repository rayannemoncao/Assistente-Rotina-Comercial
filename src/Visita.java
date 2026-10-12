import java.util.List;
import java.time.LocalTime;
import java.time.LocalDate;

public class Visita {
    int id;
    LocalDate data;
    LocalTime horario;
    String objetivo;
    String resultado;
    String observacao;
    List<ProximaAcao> proximaAcoes;
    Filial filial;
    Contato contato;
    Empresa empresa;

    public void validarVisita() {
        if ( contato == null) {
            throw new IllegalArgumentException ("Inválido, preencha o campo contato.");
        }
        if ((empresa == null && filial == null) || (empresa != null && filial != null)) {
            throw new IllegalArgumentException ("Preencha um dos campos, empresa ou filial.");
        }
        if (empresa != null && contato.empresa != empresa) {
            throw new IllegalArgumentException ("Contato não pertence a empresa visitada.");
        }
        if (filial != null && contato.filial != filial) {
            throw new IllegalArgumentException ("Contato não pertence a filial visitada.");
        }
        if ((objetivo == null)||(objetivo.isBlank())) {
            throw new IllegalArgumentException ("Preencha o campo objetivo para prosseguir com o registro.");
        }
        if (data == null) {
            throw new IllegalArgumentException("Preencha o campo data para prosseguir com o registro.");
        }
        if (horario == null) {
            throw new IllegalArgumentException ("Preencha o campo horário para prosseguir com o registro.");
        }
    }
}
