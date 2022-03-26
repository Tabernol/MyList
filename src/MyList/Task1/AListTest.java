package MyList.Task1;
import java.io.IOException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AListTest {
    private static AList a;
    private static int capacity = 10;
    private static int count = 0;

    @BeforeAll
    public static void creatAlist (){
         a = new AList();
    }

    @Test
    void moreLengh() {
        a.moreLengh();
        assertEquals(10,a.capacity);
    }


    @Test
    void testMoreLengh() {
        a.count = 10;
        a.moreLengh();
        assertEquals(16,a.capacity);

    }

    @Test
    void testMoreLengh1() {
        a.array[3] = 2;
        assertNotNull(a.array[3]);
    }

    @Test
    void testMoreLengh2() {
        assertEquals(a.capacity, a.array.length);
    }

    @Test
    void get() {
        a.add(0, 90);
        assertEquals(90, a.get(0));
    }
    @Test
    void getShouldExeption(){
        IndexOutOfBoundsException thrown = assertThrows(
                IndexOutOfBoundsException.class,
                () ->a.get(-1));
    }
    @Test
    void getShouldExeptionMore(){
        IndexOutOfBoundsException thrown = assertThrows(
                IndexOutOfBoundsException.class,
                () ->a.get(11));
    }

    @Test
    void getShoulsNullPointerExeption(){
        a.add(1, "vghj");
        assertEquals(null,a.get(0));
    }

    @Test
    void add() {
        a.add(-3);
        assertEquals(-3,a.get(0));
    }

    @Test
    void addCheckCount(){
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        assertEquals(4,a.count);
    }

    @Test
    void addCheckMoreLength(){
        a.count = 10;
        a.add(12);
        assertEquals(12,a.get(10));
    }
    @Test
    void addShouldReturnTrue(){
        assertTrue(a.add(12));
    }
    // method add with Object
    @Test
    void addShouldInsertInArray(){
        a.add(9);
        a.add(8);
        a.add(7);
        a.add(6);
        a.add(2,43);
        assertEquals(43,a.get(2));
    }
    @Test
    void addShouldExeptionIfIndexMinus(){
        IndexOutOfBoundsException thrown = assertThrows(IndexOutOfBoundsException.class,
                () ->a.add(-1,"ghj"));
    }
    @Test
    void addShouldExeptionIfIndexMoreLength (){
        IndexOutOfBoundsException thrown = assertThrows(IndexOutOfBoundsException.class,
                () ->a.add(12,"ryu"));
    }
    @Test
    void addShouldAfterAddObjectNoOrder (){
       a.add(1);
       a.add(2);
        a.add(8,8);
        a.add(9,9);
       a.add(3);
       a.add(4);
       assertEquals(2,a.get(1));
    }
    /// Method addFirst with Object
    @Test
    void addFirstShouldPutFirst() {
        a.add(0);
        a.add(1);
        a.add(2);
        a.addFirst(32);
        assertEquals(32,a.get(0));
    }
    @Test
    void addFirstCheckDataAfterMethod (){
        a.add(0);
        a.add(1);
        a.addFirst(32);
        assertEquals(0,a.get(1));
    }
    @Test
    void addFirstSholdCountMore(){
        a.add(0);
        a.add(1);
        a.addFirst(32);
        assertEquals(3, a.count);
    }
    @Test
    void addFirstShouldMoreLength (){
        a.count =10;
        a.addFirst(-1);
        assertEquals(16,a.capacity);
    }
    //Method remove delete object from array
    @Test
    void removeShouldObjectOneObject (){
        a.add(0);
        a.add(10);
        a.add(2);
        a.remove((Object) 10);
        assertEquals(null, a.get(1));
    }
    @Test
    void removeShouldTwoObject () {
        a.add(0);
        a.add(1);
        a.add(1);
        a.remove((Object) 1);
        assertEquals(null, a.get(2));
        assertEquals(null,a.get(1));
    }
    @Test
    void removeCheckCount1 (){
        a.add(0);
        a.add(1);
        a.add(2);
        a.remove(0);
        assertEquals(2,a.count);
    }
    @Test
    void removeShouldReturnTrue (){
        a.add("sdf");
        assertTrue(a.remove("sdf"));
    }
    //Method remove and return Object from array
    @Test
    void removeShouldThrownExeption (){
        IndexOutOfBoundsException thrown = assertThrows(IndexOutOfBoundsException.class, () -> a.remove(1));
    }
    @Test
    void removeShouldReturnObject (){
        a.add(3,"q");
        assertEquals("q",a.remove(3));
    }
    @Test
    void removeCheckCount2 () {
        a.add("q");
        a.remove(0);
        assertEquals(0,a.count);
    }
    @Test
    void removeShouldNegativeIndex (){
        IndexOutOfBoundsException thrown = assertThrows(IndexOutOfBoundsException.class, () -> a.remove(-1));
    }
    // Method clear
    @Test
    void clear (){
        a.add(1);
        a.clear();
        assertEquals(null,a.get(0));
    }
    //Method contains return true if array have Obejct
    @Test
    void contains () {
        a.add("q");
        AList e = new AList();

    }

   
}