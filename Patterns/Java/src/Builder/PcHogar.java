package src.Builder;

public class PcHogar extends PcBuilder{

    public void buildRam() {
        pc.setRam("Kingston");
    }

    public void buildProcesador() {
        pc.setProcesador("Intel Core i9");
    }

    public void buildMother() {
        pc.setMother("H61m-VG3");
    }
}
