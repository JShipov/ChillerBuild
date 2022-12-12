public class Director {
    ChillerBuilder builder;
    void setBuilder(ChillerBuilder b) {
        builder = b;
    }

    Chiller BuildChiller() {
        builder.createChiller();
        builder.buildCapacity();
        builder.buildCompressorPower();
        builder.buildEER();
        builder.buildRefrigerantType();
        Chiller chiller = builder.getChiller();
        return chiller;
    }
}
