package tarefa1;

public class Conta {
    private String nome;
    private Integer numero;
    private Double saldo;

    public Conta(String nome, Integer numero, Double saldo) {
        super();
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Boolean depositar(Double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            return true;
        }
        return false;

    }

    public Boolean sacar(Double valor) {
        if (saldo - valor >= 0 && valor >= 0) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
}
