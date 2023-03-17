public class Carro {


        /*Atributos: cor  modelo, capacidade tanque*/
        String cor;
        String modelo;
        int capacidadeTanque;

    /*1º Criar metodo para calcular valor para encher o tanque. Este deve receber
    como parametro o valor da gasolina.
    2º Fazer 2 sobrecargas de construtor
    3º Criar metodos set (definir) e get (pegar) para fornecer os valores dos atributos.
     */

    // 2 Contrutores em sobrecarga
    public Carro() {

    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

                                                            //fim construtores

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    public  int getCapacidadeTanque(){
        return capacidadeTanque;
    }
                                                            //fim metodos get e sets

    public double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;

    }
}