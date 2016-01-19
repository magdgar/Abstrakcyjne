import java.util.Iterator;

/**
 * Created by Makda on 2015-12-29.
 */
public class TripleListIterator implements Iterator{
    TripleList tripleList;
    Node act;

    public TripleListIterator(TripleList trippleList){
        this.tripleList = trippleList;
        act = trippleList.getFirst();
    }

    @Override
    public boolean hasNext() {
        if(act == null)
            return false;
        if(act.getCoeval() != null || act.getOffspring() != null){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(act.getCoeval() != null){
            act = act.getCoeval();
        }
        else {
            if(act.getOffspring() != null)
                act = act.offspring;
            else
                act = act.getAncestor().getOffspring();
        }
        act = act.offspring;
        return act;
    }
}
