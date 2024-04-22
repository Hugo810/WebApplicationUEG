package model.util;
import model.entidade.ECliente;
import model.persistencia.PCliente;

public class TCliente_inserir {
    
    public static void main(String[] args) {
        
        // Objeto de testes, do tipo do Cliente
        ECliente cliente = new ECliente();
        
        // Preenchendo o objeto cliente com valores para testes
        // Se o código do cliente é gerado automaticamente pelo banco de dados,
        // não precisamos definir manualmente aqui.
        cliente.setCodigo(6);
        cliente.setNome("Mariano molina");
        cliente.setDatanascimento(new java.util.Date());
        cliente.setStatus(false); // Defina o status do cliente
        
        // Cria uma instância da persistência para usarmos
        PCliente persistencia = new PCliente();
        
        System.out.println("Iniciando a inclusão de um novo cliente...");
        
        // Verifica se o código do cliente não é nulo
        if (cliente.getCodigo() != 0) {
            persistencia.inserir(cliente);
            System.out.println("Cliente incluído com sucesso!");
        } else {
            System.out.println("Erro: O código do cliente não pode ser nulo.");
        }
    }
    
}
