public class Purchase {

    public static void main(String[] args) {
        // write your code here
        final int PRICE_NOTEBOOK = 206;
        Payable[] buyer = new client[2];
        buyer[0] = new client("Yakov", 50);
        buyer[1] = new client("Pavel Tsarev", -100);

        for (Payable i : buyer)
            i.pay(PRICE_NOTEBOOK);
    }
}
