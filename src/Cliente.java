public class Cliente {

    String CPF;
    String Name;
    String End;
    int IDD;
    char sexo;

    void imprimirCliente(){

        System.out.println("Nome: " + this.Name);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Endereço: " + this.End);
        System.out.println("Idade: " + this.IDD);

    }
}