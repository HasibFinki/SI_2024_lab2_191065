# Втора лабораториска вежба по Софтверско инженерство

## Хасиб Ибрахими, бр. на индекс 191065

###  Control Flow Graph
     1. if (allItems == null) {
          } // 1 node, 1 edge
       
     2. float sum = 0; 
        // initialize sum.
        
     3. for (int i = 0; i < allItems.size(); i++) {
        } // 1 node, 2 edges
     
     4. if (item.getName() == null || item.getName().length() == 0) {
        } // 1 node, 2 edges
     
     5. if (item.getBarcode() != null) {
        } // 1 node, 2 edges
     
     6. for (int j = 0; j < item.getBarcode().length(); j++) {
        } // 1 node, 2 edges
     
     7. if (allowed.indexOf(c) == -1) {
        } // 1 node, 2 edges
     
     8. if (item.getDiscount() > 0) {
        } else {
        } // 1 node, 2 edges
     
     9. throw new RuntimeException("No barcode!");
        // throws exception for missing barcode.
     
     10. if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0') {
        } // 1 node, 2 edges
     
     11. if (sum <= payment) {
        } else {
        } // 1 node, 2 edges
     
     12. return true; 
         // Return true.
     
     13. return false; 
         // Return false. 

Фотографија од control flow graph-ot 
![image](https://github.com/HasibFinki/SI_2024_lab2_191065/assets/167031161/9e51e0b1-6850-4cae-a9d3-496e133a4364)
![image](https://github.com/HasibFinki/SI_2024_lab2_191065/assets/167031161/4b7845b1-d99d-4a00-a1fd-8ead40694eeb)


### Цикломатска комплексност

Цикломатската комплексност на овој код е **11**, пресметана со формулата каде што E е вкупниот **број на ребра (36)**, N е вкупниот** број на јазли (27)**, а P е **бројот на поврзаност (1)**. Во овој случај, цикломатската комплексност е 11.

### Тест случаи според критериумот  Every statement 
1. allItems == null - Тест случај 1 (точно), тест случај 2 (неточно)
2. item.getName() == null || item.getName().length() == 0 - Тест случај 2 (точно), тест случај 3 (точно), тест случај 4 (неточно)
3. item.getBarcode() != null - Тест случај 2 (точно), тест случај 4 (неточно)
3. allow.indexOf(c) == -1 - Тест случај 5 (точно), тест случај 2 (Неточно)
4. item.getDiscount() > 0 - Тест случај 6 (точно), тест случај 7 (Неточно)
5. item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0' - Тест случај 8 (точно), тест случај 9 (Неточно)
6. сума <= плаќање - Тест случај 10 (Неточно), Тест случај 2 (Точно)
   
За секој од тест случаите според критериумот** Every Statement **подетални објаснување:

Тест случај 1: Провери дали allItems е null (точно), Тест случај 2: Провери дали allItems е null (неточно)
Тест случај 2: Провери дали името на предметот е null или празно (точно), Тест случај 3: Провери дали името на предметот е null или празно (точно), Тест случај 4: Провери дали името на предметот е null или празно (неточно)
Тест случај 2: Провери дали баркодот на предметот не е null (точно), Тест случај 4: Провери дали баркодот на предметот не е null (неточно)
Тест случај 5: Провери дали баркодот на предметот содржи невалидни знаци (точно), Тест случај 2: Провери дали баркодот на предметот содржи невалидни знаци (неточно)
Тест случај 6: Провери дали попустот на предметот е поголем од 0 (точно), Тест случај 7: Провери дали попустот на предметот е поголем од 0 (неточно)
Тест случај 8: Провери дали цената на предметот е поголема од 300, попустот е поголем од 0 и првиот знак на баркодот е '0' (точно), Тест случај 9: Провери дали цената на предметот е поголема од 300, попустот е поголем од 0 и првиот знак на баркодот е '0' (неточно)
Тест случај 10: Провери дали збирот е помал од или еднаков на плаќањето (неточно), Тест случај 2: Провери дали збирот е помал од или еднаков на плаќањето (точно)

### Тест случаи според критериумот **Every path**
Тест Случај 1: Сите услови вистинити

Тест Случај 2: Првиот услов вистинит, другите неточни

Тест Случај 3: Вториот услов вистинит, другите неточни

Тест Случај 4: Првиот и третиот услови вистинити, вториот неточен

Тест Случај 5: Вториот и третиот услови вистинити, првиот неточен

Тест Случај 6: Вториот услов вистинит, другите неточни

Тест Случај 7: Третиот услов вистинит, другите неточни

Тест Случај 8: Сите услови неточни

Multiple Condition покритието бара да ги тестираме сите можно комбинации на условите во составената условна наредба. Во дадениот услов:
if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0') треба тестови за сите можно комбинации на трите услови:
item.getPrice() > 300
item.getDiscount() > 0
item.getBarcode().charAt(0) == '0'
Секој услов може да биде вистинит (T) или лажен (F). Следователно, имаме 2^3 = 8 можно комбинации.

**Тест Случај 1:** Сите Услови Точни
Влез: allItems = [new Item("Item1", "012345", 400, 0.1f)], payment = 370
Очекуван Излез: вистина
Објаснување: Секој од условите е вистинит.

**Тест Случај 2:** Цена > 300 (T), Попуст > 0 (T), Штрих-код не започнува со '0' (F)
Влез: allItems = [new Item("Item1", "112345", 400, 0.1f)], payment = 360
Очекуван Излез: вистина
Објаснување: Првите два услови се точно, но третиот е неточно.

**Тест Случај 3:** Цена > 300 (T), Попуст ≤ 0 (F), Штрих-код започнува со '0' (T)
Влез: allItems = [new Item("Item1", "012345", 400, 0.0f)], payment = 400
Очекуван Излез: вистина
Објаснување: Првиот и третиот услов се тоќно, но вториот е неточно.

**Тест Случај 4:** Цена > 300 (T), Попуст ≤ 0 (F), Штрих-код не започнува со '0' (F)
Влез: allItems = [new Item("Item1", "112345", 400, 0.0f)], payment = 400
Очекуван Излез: вистина
Објаснување: Првиот и вториот услов се тоќно, но третиот е неточно.

**Тест Случај 5**: Цена ≤ 300 (F), Попуст > 0 (T), Штрих-код започнува со '0' (T)
Влез: allItems = [new Item("Item1", "012345", 300, 0.1f)], payment = 270
Очекуван Излез: вистина
Објаснување: Вториот и третиот услов се точни, но првиот е неточно.

**Тест Случај 6:** Цена ≤ 300 (F), Попуст > 0 (T), Штрих-код не започнува со '0' (F)
Влез: allItems = [new Item("Item1", "112345", 300, 0.1f)], payment = 270
Очекуван Излез: вистина
Објаснување: Вториот услов е точно, но првиот и третиот се неточни.

**Тест Случај 7:** Цена ≤ 300 (F), Попуст ≤ 0 (F), Штрих-код започнува со '0' (T)
Влез: allItems = [new Item("Item1", "012345", 300, 0.0f)], payment = 300
Очекуван Излез: true
Објаснување: Само третиот услов е точно, додека првиот и вториот се неточни.

Тест Случај 8: Сите Услови False
Влез: allItems = [new Item("Item1", "112345", 300, 0.0f)], payment = 300
Очекуван Излез: точно
Објаснување: Сите услови се невистина.


### Објаснување на напишаните unit tests

     @Test
    public void testItemNameIsNull() { // Тест случај кога името на ставката е null.
        List<Item> items = new ArrayList<>();
        items.add(new Item(null, "123456", 100, 0.1f)); // Input: allItems = [new Item(null, "123456", 100, 0.1f)], payment = 100
        assertTrue(SILab2.checkCart(items, 100)); // Expected Output: true
    }

    @Test
    public void testItemNameIsEmpty() { // Тест случај за кога името на ставката е празно.
        List<Item> items = new ArrayList<>();
        items.add(new Item("", "123456", 100, 0.1f)); // Item name is null
        assertTrue(SILab2.checkCart(items, 100)); // Expected Output: true
    }

    @Test
    public void testAllItemsIsNull() { // Тест случај за кога сите ставки се null.
        RuntimeException ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 100)); // allItems = null, payment = 100
        assertEquals("allItems list can't be null!", ex.getMessage()); // Expected output: RuntimeException with message "allItems list can't be null!"
    }

    @Test
    public void testItemBarcodeContainsInvalidCharacter() { // Тест случај за кога баркодот на ставката содржи невалиден знак.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "12a456", 100, 0.1f)); // Input: allItems = [new Item("Item1", "12a456", 100, 0.1f)], payment = 100
        RuntimeException ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, 100));
        assertEquals("Invalid character in item barcode!", ex.getMessage()); // Expected Output: RuntimeException with a message "Invalid character in item barcode!"
    }

    @Test
    public void testItemWithDiscountValidBarcode() { // Тест случај за валидна ставка со попуст и валиден баркод.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "123456", 100, 0.1f)); // Input: allItems = [new Item("Item1", "123456", 100, 0.1f)], payment = 90
        assertTrue(SILab2.checkCart(items, 90)); // Expected Output: true
    }

    @Test
    public void testItemWithoutDiscountValidBarcode() { // Тест случај за валидна ставка без попуст и валиден баркод.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "123456", 100, 0.0f)); // Input: allItems = [new Item("Item1", "123456", 100, 0.0f)], payment = 100
        assertTrue(SILab2.checkCart(items, 100)); // Expected Output: true
    }

    @Test
    public void testItemBarcodeIsNull() { // Тест случај за кога баркодот на ставката е null.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", null, 100, 0.1f)); // Input: allItems = [new Item("Item1", null, 100, 0.1f)], payment = 100
        RuntimeException ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, 100));
        assertEquals("No barcode!", ex.getMessage()); // Expected Output: RuntimeException with the message "No barcode!"
    }

    @Test
    public void testItemPriceGreaterThan300DiscountGreaterThan0BarcodeStartsWith0() { // Тест случај за ставка со цена поголема од 300, попуст поголем од 0 и баркод кој почнува со 0.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 400, 0.1f)); // Input: allItems = [new Item("Item1", "012345", 400, 0.1f)], payment = 370
        assertTrue(SILab2.checkCart(items, 370)); // Expected Output: true
    }

    @Test
    public void testItemPriceGreaterThan300DiscountGreaterThan0BarcodeDoesNotStartWith0() { // Тест случај за ставка со цена поголема од 300, попуст поголем од 0 и баркод кој не почнува со 0.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "112345", 400, 0.1f)); // Input: allItems = [new Item("Item1", "112345", 400, 0.1f)], payment = 360
        assertTrue(SILab2.checkCart(items, 360)); // Expected Output: true
    }


    @Test
    public void testPriceGreaterThan300DiscountGreaterThan0BarcodeDoesNotStartWith0() { // Тест случај за цена поголема од 300, попуст поголем од 0 и баркод кој не почнува со 0.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "112345", 400, 0.1f));
        assertTrue(SILab2.checkCart(items, 360));
    }
    @Test
    public void testPriceNotGreaterThan300DiscountGreaterThan0BarcodeStartsWith0() { // Тест случај за цена која не е поголема од 300, попуст поголем од 0 и баркод кој почнува со 0.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 300, 0.1f)); // Input: allItems = [new Item("Item1", "012345", 300, 0.1f)], payment = 270
        assertTrue(SILab2.checkCart(items, 270)); // Expected Output: true
    }


    @Test
    public void testPriceGreaterThan300DiscountNotGreaterThan0BarcodeStartsWith0() {     // Тест случај за цена поголема од 300, попуст кој не е поголем од 0 и баркод кој почнува со 0.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 400, 0.0f));
        assertTrue(SILab2.checkCart(items, 400));
    }

    @Test
    public void testPriceGreaterThan300DiscountNotGreaterThan0BarcodeDoesNotStartWith0() {    // Тест случај за цена поголема од 300, попуст кој не е поголем од 0 и баркод кој не почнува со 0.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "112345", 400, 0.0f));
        assertTrue(SILab2.checkCart(items, 400));
    }

    @Test
    public void testPriceNotGreaterThan300DiscountNotGreaterThan0BarcodeStartsWith0() {     // Тест случај за цена која не е поголема од 300, попуст кој не е поголем од 0 и баркод кој почнува со 0.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 300, 0.0f));
        assertTrue(SILab2.checkCart(items, 300));
    }

    @Test
    public void testPriceNotGreaterThan300DiscountGreaterThan0BarcodeDoesNotStartWith0() {     // Тест случај за цена која не е поголема од 300, попуст поголем од 0 и баркод кој не почнува со 0.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "112345", 300, 0.1f)); //Input: allItems = [new Item("Item1", "112345", 300, 0.1f)], payment = 270
        assertTrue(SILab2.checkCart(items, 270)); // Expected Output: true.
    }


    @Test
    public void testPositiveCaseForAllConditions() { // Тест случај за позитивен за сите услови.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 500, 0.1f)); // Input: allItems = [new Item("Item1", "012345", 500, 0.1f)], payment = 370
        assertTrue(SILab2.checkCart(items, 470)); // Expected Output: true
    }

    @Test
    public void testNegativeCaseForAllConditions() {  // Тест случај за негативен за сите услови.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "122345", 400, 0.0f)); //
        assertTrue(SILab2.checkCart(items, 400));
    }

    @Test
    public void testSumOfPricesThatExceedsPayment() { // Тест случај за збирот на цените што го надминува плаќањето.
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", "123456", 100, 0.0f)); // Input: allItems = [new Item("Item1", "123456", 100, 0.0f)
        items.add(new Item("Item2", "789011", 200, 0.0f)); // new Item("Item2", "789012", 200, 0.0f)], payment = 250
        assertFalse(SILab2.checkCart(items, 250)); // Expected Output: false
    }
...
