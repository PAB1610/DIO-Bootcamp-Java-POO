package interfaces;

public interface OperacaoMatematica {

    //Na interface voce nao desenvolve a logica do metodo apenas informa quais metodos
    //deverao fazer parte da classe que implementa esta interface
    public void soma(double num1, double num2);
    public void subtracao(double num1, double num2);
    public void multiplicacao(double num1, double num2);
    public void divisao(double num1, double num2);
}
