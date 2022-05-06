package MyList.Task2;

public class RList implements List {
    Object[] ringArray = new Object[10];
    int indexTail = 0;
    int indexHead = 0;

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if (index >= ringArray.length && index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return ringArray[index + 1];
    }

    public boolean isFull() {
        boolean full = true;
        for (Object element : ringArray) {
            if (element == null) {
                full = false;
            }
        }
        return full;
    }

    @Override
    public void moreLength() {
        Object[] changeArray = new Object[ringArray.length * 3 / 2 + 1];  // вынеси увеличение массива в одельный метод нафига ты в каждом методе его дублируешь
        for (int i = 0; i < ringArray.length; i++) {
            changeArray[i] = ringArray[i];
        }
        ringArray = changeArray;
    }

    @Override
    public boolean add(Object item) {
        for (int i = 1; i < ringArray.length; i++) {
            if (ringArray[i] == null) {
                ringArray[i] = item;
                break;
            }

            indexHead++;
        }
        return true;
    }

    @Override
    public boolean addFirst(Object item) {
        return false;
    }

    @Override
    public boolean add(int index, Object item) {
        return false;
    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object item) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void showArray() {
        for (Object ob : ringArray) {
            System.out.print(ob + " ");
        }
        System.out.println(ringArray.length);
    }
}
