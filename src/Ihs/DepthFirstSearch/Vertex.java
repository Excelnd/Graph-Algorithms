package Ihs.DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean visited;
    private List<Vertex> neigbhourList;

    public Vertex(String name) {
        this.name = name;
        this.neigbhourList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        this.neigbhourList.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeigbhourList() {
        return neigbhourList;
    }

    public void setNeigbhourList(List<Vertex> neigbhourList) {
        this.neigbhourList = neigbhourList;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
