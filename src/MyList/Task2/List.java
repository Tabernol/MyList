package MyList.Task2;

public interface List {
    public Object get(int index);

    public void moreLength();

    public boolean add(Object item);

    public boolean addFirst(Object item);

    public boolean add(int index, Object item);

    public boolean remove(Object item);

    public Object remove(int index);

    public void clear();

    public boolean contains(Object item);

    public int size();

    public boolean isEmpty();

}
