public class contaBancaria {
    String nome;
    float saldo;
    boolean contaEspecial;

    void abreConta(String nomeCorrentista){
        nome = nomeCorrentista;
        saldo = 0;
        contaEspecial = false;
    }

    void deposita(float valor){
        saldo = valor + saldo;
    }

    boolean saque(float valor){
        if(contaEspecial == false){
            if(valor <= saldo){
                saldo = saldo - valor;
                return true;
            }
            else{
                return false;
            }
        }
        else{
            saldo = saldo - valor;
            return true;
        }
    }
    void mostraDados() {
        System.out.print("\n O nome do correntista é: ");
        System.out.print(nome);
        if(saldo < 0 && contaEspecial == false){
            System.out.print("O saldo voce esta com debito na conta");
        }
        else{
            System.out.print("\n o saldo é: ");
            System.out.print(saldo);
        }
        if(contaEspecial == true){
            System.out.print("\n A conta é especial");
        }
        else{
            System.out.print("\n A conta é comum");
        }
    }
    public static void main(String[] args){
        contaBancaria c1 = new contaBancaria();
        contaBancaria c2 = new contaBancaria();

        c1.abreConta("Herlinton");
        c1.contaEspecial = false;
        c1.deposita(400);
        c1.saque(120);
        c1.mostraDados();

        System.out.print("\n ===========================");

        c2.abreConta("Borba");
        c2.contaEspecial = false;
        c2.deposita(400);
        c2.saque(420);
        c2.mostraDados();

    }
}
