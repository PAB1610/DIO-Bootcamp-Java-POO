package fundamentosPOO;

public class RodarAplicacao {
    public static void main(String[] args) {

        //criando objeto sem passar paramentro (utilizando construtor vazio)
        Car car1 =  new Car();
        car1.setCor("Azul");
        car1.setModelo("BMW 3");
        car1.setCapacidadeTanque(59);

        /*se eu mandar imprimir assim, ele vai imprimir
        o endereco do objeto na memoria. É preciso criar o
        metodo toString na classe carro ou formatar uma saída
        aqui usando o comando system.out.prinln
         */
        System.out.println(car1);

        //versao 2 saida
        System.out.println("\nCOR: " + car1.getCor());
        System.out.println("MODELO: " + car1.getModelo());
        System.out.println("CAPACIDADE: " + car1.getCapacidadeTanque());
        System.out.println("VALOR TANQUE: R$ " + car1.totalValorTanque(5.10));

        System.out.println("----------------------------");

        //criando objeto passando parametros (utilizando sobrecarga construtor)
        Car carNovo =  new Car("vermelho", "FORD KA", 44);
        System.out.println("\nCOR: " + carNovo.getCor());
        System.out.println("MODELO: " + carNovo.getModelo());
        System.out.println("CAPACIDADE: " + carNovo.getCapacidadeTanque());
        System.out.println("VALOR TANQUE: R$ " + carNovo.totalValorTanque(5.10));

    }
}
