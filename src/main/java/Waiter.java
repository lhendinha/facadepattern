public class Waiter {
    public static String deliverFood(String foodType) {
        Ingredients ingredients = new Ingredients();

        switch (foodType) {
            case "Hamburguer":
                Food hamburguer = new Hamburguer();
                String hamburguerItems = ingredients.getHamburguerItems();
                hamburguer.prepareFood(hamburguerItems);
                return hamburguer.deliverFood();

            case "Japanese":
                Food japanese = new Japanese();
                String japaneseItems = ingredients.getJapaneseItems();
                japanese.prepareFood(japaneseItems);
                return japanese.deliverFood();
        }

        return null;
    }
}