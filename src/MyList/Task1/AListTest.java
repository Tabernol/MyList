package MyList.Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AListTest {


    @Test
    void moreLengh() {
        AList a = new AList();
        a.moreLengh();
        assertEquals(10,a.capacity);
    }


    @Test
    void testMoreLengh() {
        AList a = new AList();
        a.count = 10;
        a.moreLengh();
        assertEquals(16,a.capacity);

    }

    @Test
    void testMoreLengh1() {
        AList a = new AList();
        a.array[3] = 2;
        assertNotNull(a.array[3]);
    }

    @Test
    void testMoreLengh2() {
        AList a = new AList();
        assertEquals(a.capacity, a.array.length);
    }
}