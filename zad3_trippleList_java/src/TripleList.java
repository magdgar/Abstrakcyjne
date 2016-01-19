import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by Makda on 2015-12-29.
 */
public class TripleList<T extends Comparable> extends List implements Iterable<T>{

    public void add(Node node){
        if(getFirst() == null) {
            setFirst(node);
            setLast(node);
        } else {
            if(getLast().getCoeval() != null) {
                super.add(node);
            }
            else{
                getLast().setCoeval(node);
                node.setAncestor(getLast());
            }
        }
    }

    public void display(){
        if(getFirst() != null){
            Node tmp = getFirst();
            while(tmp != getLast()){
                System.out.println(tmp.getValue() + " - " + tmp.getCoeval().getValue());
                tmp = tmp.getOffspring();
            }
            if(tmp.coeval != null)
                System.out.println(tmp.getValue() + " - " + tmp.getCoeval().getValue());
            else
                System.out.println(tmp.getValue());
        }
    }

    public int count(){
        if(getLast().getCoeval() == null)
            return super.count() * 2 - 1;
        return super.count() * 2;
    }

    @Override
    public Iterator iterator() {
        return new TripleListIterator(this);
    }

    @Override
    public void forEach(Consumer action) {
        Iterator i = iterator();
        while(i.hasNext()){
            action.accept(i.next());
        }
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
