interface  Payable {
    /**
     * Метод для вывода на экран кто и по чем купил с учетом скидки
     * @param price цена товара
     */
    void pay(int price);
}

class client implements Payable {
    private final String name;
    private final int discount;

    client (String name, int discount) {
        this.name = name;
        this.discount = discount;
    }
    @Override
    public void pay (int price) {
        System.out.println(name + " buys for " + price * (100 - discount)/100 + "$");
    }
}

