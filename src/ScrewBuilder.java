public class ScrewBuilder extends ChillerBuilder {
    void buildCapacity() {
        chiller.setCoolingCapacity(((12-7)*1042*1000/3600));
    }
    void buildCompressorPower() {
        chiller.setCompressorPower(((12-7)*1042*1000/3600)*0.83);
    }
    void buildEER() {
        chiller.setEER(((12-7)*1042*1000/3600)/(((12-7)*1042*1000/3600)*0.83));
    }
    void buildRefrigerantType() {
        chiller.setRefrigerantType(RefrigerantType.R134a);
    }
}
