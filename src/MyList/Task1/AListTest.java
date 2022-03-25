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
}