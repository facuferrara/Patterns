package src.Builder;

public abstract  class PcBuilder {
    protected Pc pc;

    public void armarNuevaPc() {
        pc = new Pc();
    }

    public void setPc(Pc pc) {
        this.pc = pc;
    }

    public Pc getPc() {
        return pc;
    }

    public abstract void buildRam();
    public abstract void buildProcesador();
    public abstract void buildMother();
}
