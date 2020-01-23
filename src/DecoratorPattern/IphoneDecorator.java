package DecoratorPattern;

class IphoneDecorator extends Phone{
    private Phone phone;

    IphoneDecorator(Phone phone) {
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
