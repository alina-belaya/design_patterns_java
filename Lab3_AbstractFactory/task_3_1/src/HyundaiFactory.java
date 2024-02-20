class HyundaiFactory implements TransportFactory {
    @Override
    public Bus createBus() {
        return new HyundaiBus();
    }

    @Override
    public Tram createTram() {
        return new HyundaiTram();
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new HyundaiTrolleybus();
    }
}