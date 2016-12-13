/**
 * List implementation class.
 */
public interface List<T> {
    int size();
    T get(int index);
    void add(T t);
    void insertAt(int index, T data);
    void removeAt(int index);
    void remove(T data);
    boolean isEmpty();
    boolean contains(T t);
    T[] toArray();
    void clear();
    int lastIndexOf(T t);
}
