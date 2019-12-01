package Ihs.BreadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int data;
    private boolean visited;
    private List<Vertex> neightbourList;

    public Vertex(int data) {
        this.data = data;
        this.neightbourList = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeightbourList() {
        return neightbourList;
    }

    public void setNeightbourList(List<Vertex> neightbourList) {
        this.neightbourList = neightbourList;
    }

    public void addNeighbourVertex(Vertex vertex) {
        this.neightbourList.add(vertex);
    }

    @Override
    public String toString() {
        return " " + this.data;
    }
}
