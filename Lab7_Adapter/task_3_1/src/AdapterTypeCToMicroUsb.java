public class AdapterTypeCToMicroUsb implements MicroUsbCharger {
    final TypeCCharger typeCCharger;

    public AdapterTypeCToMicroUsb(TypeCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
    }

    @Override
    public float getOutputVoltage() {
        return typeCCharger.getOutputPower() / 3.0f;
    }

    @Override
    public float getOutputAmperage() {
        return typeCCharger.getOutputPower() / 5.0f;
    }
}
