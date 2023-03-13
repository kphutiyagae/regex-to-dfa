import java.util.ArrayList;

public class Graph {
    ArrayList<Edge> transitions;
    ArrayList<Node> states;
    Node startNode;
    ArrayList<Node> finalStates;

    public void addTransition(Edge edge){
        transitions.add(edge);
    }

    public void addState(Node state){
        states.add(state);
    }
    
    public ArrayList<Node> getFinalStates() {
        return finalStates;
    }
    
    public Node getStartNode() {
        return startNode;
    }
    
    public ArrayList<Edge> getTransitions() {
        return transitions;
    }
    
    public ArrayList<Node> getStates() {
        return states;
    }

}
