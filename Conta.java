public class Conta {

    private int numero;
    private String nome;
    private double saldo;
    private double limite;

    // Construtor
    public Conta(int numero, String nome, double saldo, double limite) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    // Depositar
    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Saque (agora PRIVATE)
    private boolean saca(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para sacar R$" + valor);
            return false;
        }
    }

    // Método público para saque (controlado)
    public void realizarSaque(double valor) {
        if (valor > 0) {
            this.saca(valor);
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    // Transferência
    public void transfere(Conta destino, double valor) {
        if (valor > 0) {
            boolean sacouComSucesso = this.saca(valor);
            if (sacouComSucesso) {
                destino.deposita(valor);
                System.out.println("Transferência de R$" + valor + " para " + destino.nome + " concluída!");
            }
        } else {
            System.out.println("Valor inválido para transferência.");
        }
    }

    // Exibir dados
    public void exibeDados() {
        System.out.println("------------------------------");
        System.out.println("Conta nº: " + this.numero);
        System.out.println("Titular: " + this.nome);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Limite: R$" + this.limite);
        System.out.println("------------------------------");
    }

    // Getters (boa prática)
    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }
}jhjkhjkljkhhgkhjkhhjkkhjkhhjkhjkhgjhhjkfdkflu  urre uyyuhghghghghghghghghghghghghghghghghghghghghghghghghghghghghghghghghghghgjfhhdfdiiugfiu6yrkhjgo7yr;jhjvhhgjkjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjhlk8iuoy9iy0fggggggggggggggjhjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg vvvvvvvvvvvvvvvvvvvvvvvvvv vvvvvvvvvvvvvvvvvvvvvvvvv