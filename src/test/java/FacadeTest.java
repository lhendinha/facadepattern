import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacadeTest {
    Ingredients ingredients;
    Food food;

    @BeforeEach
    void setUp() {
        ingredients = new Ingredients();
    }

    @Test
    void testHamburguer() {
        System.out.println("Running: testHamburguer");

        food = new Hamburguer();
        String hamburguerItems = ingredients.getHamburguerItems();
        food.prepareFood(hamburguerItems);

        assertEquals(hamburguerItems, "ground beef, big white onion, two garlic cloves, black pepper and salt to taste.");
        assertEquals(food.deliverFood(), "This is the hamburguer with ingredients: ground beef, big white onion, two garlic cloves, black pepper and salt to taste.");
    }

    @Test
    void testJapanese() {
        System.out.println("Running: testJapanese");

        food = new Japanese();
        String japaneseItems = ingredients.getJapaneseItems();
        food.prepareFood(japaneseItems);

        assertEquals(japaneseItems, "soy sauce, rice vinegar, mirin, suhi rice, miso paste, wakame, bonito flakes and kombu.");
        assertEquals(food.deliverFood(), "This is the japanese with ingredients: soy sauce, rice vinegar, mirin, suhi rice, miso paste, wakame, bonito flakes and kombu.");
    }
}
