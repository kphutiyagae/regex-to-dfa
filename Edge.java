public class Edge {
    Node startNode;
    Node endNode;
    String symbol;

    Edge(){
        startNode = null;
        endNode = null;
    }

    Edge(String symbol){
        startNode = null;
        endNode = null;
        this.symbol = symbol;
    }

    Edge(String symbol, Node startNode, Node endNode){
        this.startNode = startNode;
        this.endNode = endNode;
        this.symbol = symbol;    
    }

    public Node getStartNode() {
        return startNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setEndNode(Node endNode) {
        this.endNode = endNode;
    }

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
