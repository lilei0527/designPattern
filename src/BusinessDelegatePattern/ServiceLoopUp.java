package BusinessDelegatePattern;

class ServiceLoopUp {
    static Service getService(String type) {
        switch (type) {
            case "serviceA":
                return new ServiceA();
            case "serviceB":
                return new ServiceB();
            default:
                return null;
        }
    }
}
