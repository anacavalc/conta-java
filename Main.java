public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta(1, "Ana", 500, 200);
        Conta conta2 = new Conta(2, "Maria", 300, 100);

        conta1.deposita(100);
        conta1.realizarSaque(50);
        conta1.transfere(conta2, 200);

        conta1.exibeDados();
        conta2.exibeDados();


    }
}