package DecoratorPattern;

class HuaWeiDecorator extends Phone{
    private Phone phone;

    HuaWeiDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    void sale() {
        phone.sale();
        afterSale();
    }

    private void afterSale(){
        System.out.println("Iphone after sale");
    }
}
