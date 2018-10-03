package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
   private final String bun;
   private final int burgers;
   private final String sauce;
   private final List <String> ingredients;

   public static class BigmacBuilder {
       private String bun;
       private int burgers;
       private String sauce;
       private List <String> ingredientsList = new ArrayList<>();

       public BigmacBuilder bun(String bun) {
           this.bun = bun;
           return this;
       }

       public BigmacBuilder burgers(int burgers) {
           this.burgers = burgers;
           return this;
       }

       public BigmacBuilder ingredients(String ingredients) {
           ingredientsList.add(ingredients);
           return this;
       }

       public BigmacBuilder sauce(String sauce) {
           this.sauce = sauce;
           return this;
       }

       public Bigmac build() {
           return new Bigmac(bun, burgers, sauce, ingredientsList);
       }
   }

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }


    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac {" +
                "bun = " + bun + '\'' +
                ", burgers = " + burgers +
                ", sauce = " + sauce + '\'' +
                ", ingredients = " + ingredients +
                '}';
    }
}
