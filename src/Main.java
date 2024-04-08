public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();


        cliente1.Name = "Cristiano Ronaldo";
        cliente1.End = "Ilha Da Madeira";
        cliente1.Sexo= 'M';
        cliente1.IDD = 39;
        cliente1.CPF = "11122233345";



        Conta conta1 = new Conta(cliente1, 1985,1111, "343-5", 2000);


        conta1.Deposito(900);
        conta1.Saque(2900);

        conta1.extrato();
    }
}