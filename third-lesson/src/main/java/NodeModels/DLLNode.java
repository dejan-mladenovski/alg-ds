package NodeModels;

/**
 * Doubly linked list.
 */
public class DLLNode<T> {

  private DLLNode<T> prev;
  private DLLNode<T> next;
  private T data;

  public DLLNode(T data, DLLNode<T> prev, DLLNode<T> next) {
    this.data = data;
    this.prev = prev;
    this.next = next;
  }
}
