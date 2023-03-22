import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    public String nome;

    Midia(){}
    
    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Midia(int codigo, double preco, String nome){
        setCodigo(codigo);
        setPreco(preco);
        setNome(nome);
    }

    public String getTipo(){
        return "Midia:";
    }

    public String getDetalhes(){
        return "codigo" + getCodigo() + "\n" + "preco" + getPreco() + "\n" + "nome" + getNome() + "\n";
    }

    public void printDados(){
        String s = getTipo() + "\n" + getDetalhes() + "\n";
        System.out.println(s);
    }

    public void inserirDados(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserir o codigo");
        int cod = in.nextInt();
        System.out.println("Inserir o preço");
        double preco = in.nextDouble();
        System.out.println("Inserir o nome da midia");
        String nome  = in.nextLine();
    }
}