public class Hamburguer  implements Food {
    public String preparedItem;

    @Override
    public void prepareFood(String itemRequired) {
        preparedItem = "This is the hamburguer with ingredients: " + itemRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItem;
    }
}