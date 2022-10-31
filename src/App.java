import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem vindo ao Progama Hidrate-se Melhor!");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira seu nome: ");
        String nome = sc.next();
        System.out.print("Informe seu peso atual: ");
        double peso = sc.nextDouble();
        System.out.print("Informe a quantidade de água ingerida em litros: ");
        double qAgua = sc.nextDouble();
        
        double qIdealÁgua = (peso*35)/1000;
        qIdealÁgua = Math.ceil(qIdealÁgua);
        double qAingerirnoDia = qIdealÁgua - qAgua;
        sc.close();
        System.out.println();

        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + (int)peso + "Kg");
        System.out.println("Quantidade de água ingerida: " + (int)qAgua + " litros ");
        System.out.println("Quantidade ideal de água a ingerir: " + (int)qIdealÁgua + " litros ");

        if (qAingerirnoDia<=0){
           System.out.println("Parabéns, você atingiu a meta de hidratação diária!");
        } else  {
         System.out.println("Continue focado em se hidratar por hoje, ainda faltam "+(int)qAingerirnoDia+ " litros! Você consegue! ");
        }

        
    }
}
