/**
 * Created by Makda on 2015-12-29.
 */
public class Node <T> {
    T value;
    Node ancestor;
    Node offspring;
    Node coeval;

    public Node(T value){
        this.value = value;
        this.offspring = null;
        this.ancestor = null;
        this.coeval = null;
    }

    public Node(T value, Node ancestor){
        this.value = value;
        this.offspring = null;
        this.ancestor = ancestor;
        this.coeval = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getAncestor() {
        return ancestor;
    }

    public void setAncestor(Node ancestor) {
        this.ancestor = ancestor;
    }

    public Node getOffspring() {
        return offspring;
    }

    public void setOffspring(Node offspring) {
        this.offspring = offspring;
    }

    public Node getCoeval() {
        return coeval;
    }

    public void setCoeval(Node coeval) {
        this.coeval = coeval;
    }
}
