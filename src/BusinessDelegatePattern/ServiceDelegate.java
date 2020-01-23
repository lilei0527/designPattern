package BusinessDelegatePattern;



class ServiceDelegate {
    private String serviceType;

    void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    void doTask() {
        Service service = ServiceLoopUp.getService(serviceType);
        if (service != null) {
            service.doService();
        }
    }
}
