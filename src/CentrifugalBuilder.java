public class CentrifugalBuilder extends ChillerBuilder {
    void buildCapacity() {
        chiller.setCoolingCapacity(((12 - 7) * 1042 * 1000 / 3600));
    }

    void buildCompressorPower() {
        chiller.setCompressorPower(((12 - 7) * 1042 * 1000 / 3600) * 0.92);
    }

    void buildEER() {
        chiller.setEER(((12 - 7) * 1042 * 1000 / 3600) / (73 * (12 - 7) * 1042 * 1000 / 3600) * 0.92);
    }

    void buildRefrigerantType() {
        chiller.setRefrigerantType(RefrigerantType.R12);
    }
}
