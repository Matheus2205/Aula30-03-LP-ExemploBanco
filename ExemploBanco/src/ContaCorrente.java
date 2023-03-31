public class ContaCorrente {

    int saldo;
    Cliente cliente; // referencia

    public void deposita (Double valorDeposito){ //criando um metodo
           saldo = saldo + valorDeposito;
    }

    public int getSaldo(){
        return saldo;

    }
}
