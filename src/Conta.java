public class Conta {

    public static int Contas;
    private Cliente Dono;
    private double saldo;
    private int Num;
    private String AgBancaria;
    private double Lim;
    private Operacao[] operacoes = new Operacao[1000];
    private int ultima_operacao = 0;

    public Conta(Cliente Dono, double saldo, int Num, String AgBancaria, double Lim) {
        Contas++;
        this.Dono = Dono;
        this.saldo = saldo;
        this.Num = Num;
        this.AgBancaria = AgBancaria;
        this.Lim = Lim;
    }

    boolean Saque(double valor) {
        if(valor > 0.0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.operacoes[ultima_operacao] = new Operacao('s',valor);
            this.ultima_operacao ++;
            return true;
        } else {
            return false;
        }
    }

    boolean Deposito(double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
            this.operacoes[ultima_operacao] = new Operacao('d',valor);
            this.ultima_operacao ++;
            return true;
        } else {
            return false;
        }
    }

     else {
        return false;
    }



    void imprimirConta(){

        Dono.imprimirCliente();
        System.out.println("Número da conta: " + this.Num);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.Lim);

    }
    void extrato(){

        for(int i = 0; i < this.ultima_operacao; i++) {

            System.out.print(this.operacoes[i].getData() + "  ");
            System.out.print(this.operacoes[i].getTipo() + "  ");
            System.out.print(this.operacoes[i].getValor() + "\n");

        }

    }

    public Cliente getDono(){
        return this.Dono;
    }
    public void setDono(Cliente novoDono){
        this.Dono = novoDono;
    }

    public int getNumero(){
        return this.Num;
    }

    public void setNumero(int novoNumero){
        this.Num = novoNumero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getLimite(){
        return this.limite;
    }

    public void setLimite(double novoLimite){
        this.Lim = novoLimite;
    }
}
