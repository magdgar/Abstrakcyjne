/**
 * Created by Makda on 2015-12-29.
 */
public class Test {
    public static void main(String args[]){
        TripleList<Integer> list = new TripleList<Integer>();
        list.add(7);
        list.add(3);
        list.add(6);
        list.add(2);
        list.display();
        System.out.print(list.count());

        testEmptyListCreation();
        testAddingSingleElement();
        testAddingFiveElements();
        testListsEnumerator();
    }

    public static void testEmptyListCreation()
    {
        TripleList<Integer> tripleList = new TripleList<Integer>();
        assert 0 == tripleList.count();
        assert null == tripleList.getFirst();
        assert null == tripleList.getLast();
    }

    public static void testAddingSingleElement()
    {
        TripleList<Integer> tripleList = new TripleList<Integer>();
        int value = 4;
        tripleList.add(value);
        assert 1 == tripleList.count();
        assert value == (Integer) tripleList.getLast().getValue();

        assert null == tripleList.getLast().getOffspring();
        assert null == tripleList.getLast().getCoeval();
    }

    public static void testAddingFiveElements()
    {
        TripleList<Integer> tripleList = new TripleList<Integer>();
        int value1 = 1;
        int value2 = 2;
        int value3 = 3;
        int value4 = 4;
        int value5 = 5;
        tripleList.add(value1);
        tripleList.add(value2);
        tripleList.add(value3);
        tripleList.add(value4);
        tripleList.add(value5);
        assert 5 == tripleList.count();
        // checking values
        assert value1 == (Integer) tripleList.getFirst().getValue();
        assert value2 == (Integer) tripleList.getFirst().getCoeval().getValue();
        assert value3 == (Integer) tripleList.getFirst().getOffspring().getValue();
        assert value4 == (Integer) tripleList.getFirst().getOffspring().getCoeval().getValue();
        assert value5 == (Integer) tripleList.getLast().getValue();
    }

    public static void testListsEnumerator()
    {
        double[] values = { 1.1, 3.14, 6.13, 9.99999, 99.001 };
        TripleList tripleList = new TripleList<Double>();
        int i;
        for (i = 0; i < values.length; ++i)
        {
            tripleList.add(values[i]);
        }
        i = 0;
        for (Object d : tripleList)
        {
            assert values[i++] == (Integer)((Node)d).getValue();
        }
    }
}
