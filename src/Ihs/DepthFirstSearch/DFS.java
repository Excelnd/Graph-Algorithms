package Ihs.DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {

    private Stack<Vertex> stack;

    public DFS() {

    }

    public void dfs(List<Vertex> vertexList) {

        for(Vertex v: vertexList) {
            if(!v.isVisited()) {
                v.setVisited(true);
                dfsWithStack(v);
            }
        }
    }

    private void dfsWithStack(Vertex v) {

    }


}
