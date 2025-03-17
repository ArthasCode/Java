package builder_teste;

public class NutritionFacts {
    private final int quantityPerPortion;
    private final int quantityTotal;
    private final int fat;
    private final double sodium;
    private final int sugar;

    public static class Builder{
        private final int quantityPerPortion;
        private final int quantityTotal;
        
        private int fat = 0;
        private double sodium = 0;
        private int sugar = 0;

        public Builder(int quantityPerPortion, int quantityTotal){
            this.quantityPerPortion = quantityPerPortion;
            this.quantityTotal = quantityTotal;
        }

        public Builder setFat(int fat){
            this.fat = fat; return this;
        }

        public Builder setSodium(double sodium){
            this.sodium = sodium; return this;
        }

        public Builder setSugar(int sugar){
            this.sugar = sugar; return  this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }

    }

    public NutritionFacts(Builder build){
        this.quantityPerPortion = build.quantityPerPortion;
        this.quantityTotal = build.quantityTotal;
        this.fat = build.fat;
        this.sodium = build.sodium;
        this.sugar = build.sugar;
    }

    
    @Override
    public String toString() {
        return "NutritionFacts [quantityPerPortion=" + quantityPerPortion + "g, quantityTotal=" + quantityTotal
                + ", fat=" + fat + "g, sodium=" + sodium + "g, sugar=" + sugar + "g]";
    }


    public static void main(String[] args) {
        NutritionFacts bolachaMaria = new Builder(90, 6).setFat(1).setSugar(8).setSodium(0.20).build();
        System.out.println(bolachaMaria);
    }
}
