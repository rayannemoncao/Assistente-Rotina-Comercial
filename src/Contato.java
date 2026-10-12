public class Contato {
    int id;
    String nome;
    String cargo;
    String telefone;
    String email;
    StatusContato status;
    Empresa empresa;
    Filial filial;

    public void validarContato(){
        if ((empresa == null && filial == null) || (empresa != null && filial != null)) {
            throw new IllegalArgumentException
                    ("Inválido: informa uma empresa ou filial, mas não ambas.");
        }
    }
}
