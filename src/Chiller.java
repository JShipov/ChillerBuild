import java.util.ArrayList;
import java.util.List;

public class Chiller {

    private double coolingCapacity;
    private double compressorPower;
    private double EER;
    RefrigerantType refrigerantType;

    public void setCoolingCapacity(double coolingCapacity) {
        this.coolingCapacity = coolingCapacity;
    }

    public void setCompressorPower(double compressorPower) {
        this.compressorPower = compressorPower;
    }

    public void setEER(double EER) {
        this.EER = EER;
    }

    public double getCoolingCapacity() {
        return coolingCapacity;
    }

    public double getCompressorPower() {
        return compressorPower;
    }

    public double getEER() {
        return EER;
    }

    public RefrigerantType getRefrigerantType() {
        return refrigerantType;
    }

    public void setRefrigerantType(RefrigerantType refrigerantType) {
        this.refrigerantType = refrigerantType;
    }

    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, "" + this.coolingCapacity);
        values.add(1, "" + this.compressorPower);
        values.add(2, "" + this.EER);
        values.add(3, "" + this.refrigerantType);
        return values;
    }

    public void read(List<String> list) {
        if (list != null && list.size() > 0) {
            this.coolingCapacity =Double.parseDouble(list.get(0));
            this.compressorPower = Double.parseDouble(list.get(1));
            this.EER = Double.parseDouble(list.get(2));
            this.refrigerantType = RefrigerantType.valueOf("" + getRefrigerantType());
        }
    }


    @Override
    public String toString() {
        return "Chiller [Cooling capacity = " + coolingCapacity + " compressor power input = " + compressorPower + " EER = " + Math.round(EER) +
                " refrigerant type is " + refrigerantType + "]";
    }

}