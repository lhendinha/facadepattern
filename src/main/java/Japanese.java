public class Japanese  implements Food {
    public String preparedItem;

    @Override
    public void prepareFood(String itemRequired) {
        preparedItem = "This is the japanese with ingredients: " + itemRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItem;
    }
}