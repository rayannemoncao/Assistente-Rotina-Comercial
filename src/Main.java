//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;


/*public class Main {
    public static void main (String[] args){
        Empresa empresa = new Empresa();
        empresa.id = 1;
        empresa.nome = "Farmacia Central";
        empresa.cnpj = "00.000.000/0001-00";

        System.out.println("Assistente de Rotina Comercial");
        System.out.println("ID:" + empresa.id);
        System.out.println("Empresa:" + empresa.nome);
        System.out.println("CNPJ:" + empresa.cnpj);
    }
}*/
public class Main {
    public static void main (String[] args){
        Empresa empresa = new Empresa ();
        empresa.nome = "Farmacia Central";

        Empresa outraEmpresa = new Empresa();
        outraEmpresa.nome = "Farmacia Popular";

        Filial filial = new Filial ();
        filial.nome = "Central 2";//

        Contato contato = new Contato ();
        contato.nome = "Maria";
        contato.filial = null;
        contato.empresa = empresa;

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Visita visita = new Visita ();
        visita.id = 1;
        visita.data = LocalDate.parse ("05/10/2026", formato);
        visita.horario = LocalTime.of (10,0);
        visita.empresa = empresa;
        visita.filial = null;
        visita.contato = contato;
        visita.objetivo = "Solicitou catalógo.";
        visita.resultado = "Cliente solicitou mais informações.";
        visita.observacao = "Fechou negócio.";

        try {
            contato.validarContato();
        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
            return;
        }

        try {
            visita.validarVisita();
        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
            return;
        }

        System.out.println("Contato válido!");
        System.out.println("Visita válida!");

// Só exibe os dados depois de todas as validações passarem.
        System.out.println("=== Registro de Visita ===");
        System.out.println("ID: " + visita.id);
        System.out.println("Data: " + formato.format (visita.data));
        System.out.println("Horário: " + visita.horario);
        System.out.println("Empresa: " + visita.empresa.nome);
        System.out.println("Contato: " + visita.contato.nome);
        System.out.println("Objetivo: " + visita.objetivo);
        System.out.println("Resultado: " + visita.resultado);
        if (( visita.observacao == null )  || (visita.observacao.isBlank())) {
            System.out.println("Sem observação.");
        } else {
            System.out.println("Observação: " + visita.observacao);
        }
    }
}