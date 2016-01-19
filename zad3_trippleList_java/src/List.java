/**
 * Created by Makda on 2015-12-29.
 */
public class List <T extends Comparable> {
    Node first;
    Node last;

    public void add(T val){
        add(new Node(val));
    }

    public void add(Node node){
        if(this.first == null){
            setFirst(node);
            setLast(node);
        }
        else {
            node.setAncestor(getLast());
            getLast().setOffspring(node);
            setLast(node);
        }
    }

    public Node get(T val){
        Node tmp = getFirst();
        while(tmp != getLast()){
            if(tmp.getValue() == val)
                return tmp;
            tmp = tmp.ancestor;
        }
        if(tmp.getValue() == val)
            return tmp;
        return null;
    }

    public void display(){
        if(getFirst() != null) {
            Node tmp = getFirst();
            while (tmp != getLast()) {
                System.out.print(tmp.getValue() + ", ");
                tmp = tmp.offspring;
            }
            System.out.println(tmp.getValue());
        }
    }

    public int count(){
        if(getFirst() == null)
            return 0;
        int count = 0;
        Node tmp = getFirst();
        while(tmp != getLast()) {
            count++;
            tmp = tmp.offspring;
        }
        return count +1;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node node) {
        this.last = node;
    }
}
