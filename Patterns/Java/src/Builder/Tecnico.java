package src.Builder;

public class Tecnico {

    private PcBuilder pcBuilder;

    public void setPcBuilder(PcBuilder pcBuilder) {
        this.pcBuilder = pcBuilder;
    }

    public PcBuilder getPcBuilder() {
        return pcBuilder;
    }

    public void armarPc(){
        pcBuilder.armarNuevaPc();
        pcBuilder.buildMother();
        pcBuilder.buildProcesador();
        pcBuilder.buildRam();
    }
}
