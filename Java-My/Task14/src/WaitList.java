import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<T> implements IWaitList<T> {
  protected ConcurrentLinkedQueue<T> Content;

  public WaitList() {
    Content = new ConcurrentLinkedQueue<T>();
  }

  public WaitList(ConcurrentLinkedQueue<T> list) {
    Content = list;
  }

  @Override
  public void add(T element) {
    Content.add(element);
  }

  @Override
  public void remove(T element) {
    Content.remove(element);
  }

  @Override
  public boolean contains(T element) {
    return Content.contains(element);
  }

  @Override
  public boolean containsAll(Collection<T> elements) {
    for (T element : elements) {
      if (!Content.contains(element)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean isEmpty() {
    return Content.isEmpty();
  }

  public String toString() {
    StringBuilder str = new StringBuilder();
    for (T elemnt : Content) {
      str.append(elemnt.toString());
    }
    return str.toString();
  }
}
