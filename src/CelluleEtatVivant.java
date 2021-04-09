public class CelluleEtatVivant implements CelluleEtat {
    private static CelluleEtatVivant instanceUnique = null;

    private CelluleEtatVivant(){}

    public static CelluleEtatVivant getInstance(){
        if (instanceUnique == null) return new CelluleEtatVivant();
        return instanceUnique;
    }

    @Override
    public CelluleEtat vit() {
        return this;
    }

    @Override
    public CelluleEtat meurt() {
        return CelluleEtatMort.getInstance();
    }

    @Override
    public boolean estVivante() {
        return true;
    }
}
