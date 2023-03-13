import java.util.ArrayList;

public class Node {
    
    private Node next;
    private Node prev;
    private ArrayList<Edge> nodeTransitions = new ArrayList<Edge>();


    Node(){
        this.next = null;
        this.prev = null;
    }

    Node(Node prev){
        this.next = null;
        this.prev = null;
    }

    void addTransition(Edge transition){
        nodeTransitions.add(transition);
    }

    void removeTransition(Edge transition){
        nodeTransitions.remove(transition);
    }

    void listTransitionsFromNode(){
        System.out.println("Outgoing transitions: [");
        nodeTransitions.forEach( (state) -> System.out.println( state.toString() ));
        System.out.println("]");
    }

    void listTransitionsToNode(){
        System.out.println("Incoming transitions: [");
        nodeTransitions.forEach( (state) -> System.out.println( state.toString() ));
        System.out.println("]");
    }
}
