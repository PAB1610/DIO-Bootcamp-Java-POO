package heranca.polimorfismo;

public class MainPolimorfismo {
    public static void main(String[] args) {

        /*criacao de vetor de classes*/
        Mae[] classes = new Mae[]{new Filha1(), new Filha2(), new Mae()};

        /*foreach: percorrendo as 3 classes e executando o metodo 1 de cada uma delas
        É um exemplo de polimorfismo pois se comportou de acordo com o tipo de dado
        recebido, neste caso a classe filha que sobrescreveu a classe mãe.
         OBS: o mesmo método escrito na classe mãe foi sobrescrito nas classes filhas
          mas ao utilizar-se a classe mãe, o método se comporta de acordo com a declaracao
          dele na classe mãe. Ao se utilizar a classe filha, ele se comporta de acordo
          com a declaracao dele na classe filha
         */

        for(Mae cl: classes){
            cl.metodo1();
        }

        System.out.println();
        for(Mae cl: classes){
            cl.metodo2();
        }

        System.out.println();

        /*exemplo de sobrescrita porque usei o metodo direto da classe filha que foi
        sobrescrito.*/
        Filha2 filha2 = new Filha2();
        filha2.metodo2();
    }
}
