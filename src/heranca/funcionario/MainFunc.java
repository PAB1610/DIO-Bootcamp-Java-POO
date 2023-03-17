package heranca.funcionario;

public class MainFunc {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); // criei um objeto modo convencional

        /**Fazendo Upcast:
        Gerente, Vendedor e Faxineiro são subtipos de Funcionarios.
        A classe Gerente, Vendedor e Faxineiro passa a se comportar como a classe mãe.
         Upcast é implícito */
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        /**Fazendo um Downcast:
         * Transformar a classe mãe Funcionario em classe filha, Vendedor
         * Downcast é explicito, ou seja, preciso colocar para quem será (Vendedor) */
        Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}
