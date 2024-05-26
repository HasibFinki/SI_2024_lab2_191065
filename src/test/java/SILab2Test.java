import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    public void testItemNameIsNull() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(null, "123456", 100, 0.1f));
        assertTrue(SILab2.checkCart(items, 100));
    }

    @Test
    public void testItemNameIsEmpty() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("", "123456", 100, 0.1f));
        assertTrue(SILab2.checkCart(items, 100));
    }

    @Test
    public void testAllItemsIsNull() {
        RuntimeException ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 100));
        assertEquals("allItems list can't be null!", ex.getMessage());
    }

    @Test
    public void testItemBarcodeContainsInvalidCharacter() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "12a456", 100, 0.1f));
        RuntimeException ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, 100));
        assertEquals("Invalid character in item barcode!", ex.getMessage());
    }

    @Test
    public void testItemWithDiscountValidBarcode() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "123456", 100, 0.1f));
        assertTrue(SILab2.checkCart(items, 90));
    }

    @Test
    public void testItemWithoutDiscountValidBarcode() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "123456", 100, 0.0f));
        assertTrue(SILab2.checkCart(items, 100));
    }

    @Test
    public void testItemBarcodeIsNull() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", null, 100, 0.1f));
        RuntimeException ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, 100));
        assertEquals("No barcode!", ex.getMessage());
    }

    @Test
    public void testItemPriceGreaterThan300DiscountGreaterThan0BarcodeStartsWith0() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 400, 0.1f));
        assertTrue(SILab2.checkCart(items, 370));
    }

    @Test
    public void testItemPriceGreaterThan300DiscountGreaterThan0BarcodeDoesNotStartWith0() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "112345", 400, 0.1f));
        assertTrue(SILab2.checkCart(items, 360));
    }


    @Test
    public void testPriceGreaterThan300DiscountGreaterThan0BarcodeDoesNotStartWith0() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "112345", 400, 0.1f));
        assertTrue(SILab2.checkCart(items, 360));
    }
    @Test
    public void testPriceNotGreaterThan300DiscountGreaterThan0BarcodeStartsWith0() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 300, 0.1f));
        assertTrue(SILab2.checkCart(items, 270));
    }


    @Test
    public void testPriceGreaterThan300DiscountNotGreaterThan0BarcodeStartsWith0() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 400, 0.0f));
        assertTrue(SILab2.checkCart(items, 400));
    }

    @Test
    public void testPriceGreaterThan300DiscountNotGreaterThan0BarcodeDoesNotStartWith0() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "112345", 400, 0.0f));
        assertTrue(SILab2.checkCart(items, 400));
    }

    @Test
    public void testPriceNotGreaterThan300DiscountNotGreaterThan0BarcodeStartsWith0() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 300, 0.0f));
        assertTrue(SILab2.checkCart(items, 300));
    }

    @Test
    public void testPriceNotGreaterThan300DiscountGreaterThan0BarcodeDoesNotStartWith0() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "112345", 300, 0.1f));
        assertTrue(SILab2.checkCart(items, 270));
    }


    @Test
    public void testPositiveCaseForAllConditions() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 500, 0.1f));
        assertTrue(SILab2.checkCart(items, 470));
    }

    @Test
    public void testNegativeCaseForAllConditions() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "122345", 400, 0.0f));
        assertTrue(SILab2.checkCart(items, 400));
    }

    @Test
    public void testSumOfPricesThatExceedsPayment() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "123456", 100, 0.0f));
        items.add(new Item("Item2", "789011", 200, 0.0f));
        assertFalse(SILab2.checkCart(items, 250));
    }
}
