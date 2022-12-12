abstract class ChillerBuilder {
    Chiller chiller;
    void createChiller() {
        chiller = new Chiller();
    }

    abstract void buildCapacity();
    abstract void buildCompressorPower();
    abstract void buildEER();
    abstract void buildRefrigerantType ();

    Chiller getChiller() {
        return chiller;
    }
}