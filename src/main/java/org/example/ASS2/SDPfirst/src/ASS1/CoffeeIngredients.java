package ASS1;
public interface CoffeeIngredients {
    String createCoffee();
    String createMilk();
    String createWater();
    String createSyrup();
    String createFoam();
}

class LatteIngredientsFactory implements CoffeeIngredients {
    @Override
    public String createCoffee() {
        return "Adding coffee";
    }

    @Override
    public String createMilk() {
        return "Adding milk";
    }

    @Override
    public String createWater() {
        return "Adding water";
    }

    @Override
    public String createSyrup() {
        return "Adding syrup";
    }

    @Override
    public String createFoam() {
        return "Adding foam";
    }
}
class EspressoIngredientsFactory implements CoffeeIngredients {
    @Override
    public String createCoffee() {
        return "Adding coffee";
    }

    @Override
    public String createMilk() {
        return "";
    }

    @Override
    public String createWater() {
        return "Adding water";
    }

    @Override
    public String createSyrup() {
        return ""; // No syrup in espresso
    }

    @Override
    public String createFoam() {
        return ""; // No foam in espresso
    }
}

class CappuccinoIngredientsFactory implements CoffeeIngredients {
    @Override
    public String createCoffee() {
        return "Adding coffee";
    }

    @Override
    public String createMilk() {
        return "Adding milk";
    }

    @Override
    public String createWater() {
        return ""; // No water in cappuccino
    }

    @Override
    public String createSyrup() {
        return "Adding syrup";
    }

    @Override
    public String createFoam() {
        return ""; // No foam in cappuccino
    }
}

// Implementing ViennaIngredientsFactory class (without public modifier)
class ViennaIngredientsFactory implements CoffeeIngredients {
    @Override
    public String createCoffee() {
        return "Adding coffee";
    }

    @Override
    public String createMilk() {
        return ""; // No milk in vienna
    }

    @Override
    public String createWater() {
        return ""; // No water in vienna
    }

    @Override
    public String createSyrup() {
        return ""; // No syrup in vienna
    }

    @Override
    public String createFoam() {
        return "Adding foam";
    }
}