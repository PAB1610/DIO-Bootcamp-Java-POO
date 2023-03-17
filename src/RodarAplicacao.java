public class RodarAplicacao {
    public static void main(String[] args) {

        //criando objeto sem passar paramentro (utilizando construtor vazio)
        Carro carro1 =  new Carro();
        carro1.setCor("Azul");
        carro1.setModelo("BMW 3");
        carro1.setCapacidadeTanque(59);

        /*se eu mandar imprimir assim, ele vai imprimir
        o endereco do objeto na memoria. É preciso criar o
        metodo toString na classe carro ou formatar uma saída
        aqui usando o comando system.out.prinln
         */
        System.out.println(carro1);

        //versao 2 saida
        System.out.println("\nCOR: " + carro1.getCor());
        System.out.println("MODELO: " + carro1.getModelo());
        System.out.println("CAPACIDADE: " + carro1.getCapacidadeTanque());
        System.out.println("VALOR TANQUE: R$ " + carro1.totalValorTanque(5.10));

        System.out.println("----------------------------");

        //criando objeto passando parametros (utilizando sobrecarga construtor)
        Carro carroNovo =  new Carro("vermelho", "FORD KA", 44);
        System.out.println("\nCOR: " + carroNovo.getCor());
        System.out.println("MODELO: " + carroNovo.getModelo());
        System.out.println("CAPACIDADE: " + carroNovo.getCapacidadeTanque());
        System.out.println("VALOR TANQUE: R$ " + carroNovo.totalValorTanque(5.10));

    }
}
