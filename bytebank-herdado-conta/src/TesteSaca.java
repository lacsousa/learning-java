public class TesteSaca {
    
    public static void main(String[] args) {

        Conta conta = new ContaCorrente(122, 123123);
        conta.deposita(100);
        conta.saca(200);

        System.out.println(conta.getSaldo());
    }


}
