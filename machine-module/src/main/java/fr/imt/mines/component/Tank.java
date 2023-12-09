package fr.imt.mines.component;

public class Tank {
    private final double maxVolume;
    private final double minVolume;
    private double actualVolume;

    /**
     * Réservoir d'eau de la cafetière.
     * @param initialVolume Volume à mettre dans le réservoir à sa création
     * @param minVolume Volume minimal du réservoir
     * @param maxVolume Volume maximal du réservoir
     */
    public Tank(double initialVolume, double minVolume, double maxVolume){
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.actualVolume = initialVolume;
    }

    /**
     * Réduit le volume de matière dans le réservoir
     * @param volumeToDecrease Volume de matière à enlever dans le réservoir (volumeToDecrease > 0)
     */
    public void decreaseVolumeInTank(double volumeToDecrease){
        if (this.actualVolume - volumeToDecrease <= this.minVolume){
            this.actualVolume = this.minVolume;
        } else {
            this.actualVolume -= volumeToDecrease;
        }
    }

    /**
     * Augmente le volume de matière dans le réservoir
     * @param volumeToIncrease Volume de matière à ajouter dans le réservoir (volumeToDecrease > 0)
     */
    public void increaseVolumeInTank(double volumeToIncrease){
        if (this.actualVolume + volumeToIncrease >= this.maxVolume){
            this.actualVolume = this.maxVolume;
        } else {
            this.actualVolume += volumeToIncrease;
        }
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public double getMinVolume() {
        return minVolume;
    }

    public double getActualVolume() {
        return actualVolume;
    }
}
