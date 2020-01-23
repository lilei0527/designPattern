package BusinessDelegatePattern;

class Client {
    private ServiceDelegate serviceDelegate;

    Client(ServiceDelegate serviceDelegate) {
        this.serviceDelegate = serviceDelegate;
    }

    void doTask() {
        serviceDelegate.doTask();
    }
}
