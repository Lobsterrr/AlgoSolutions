/*
 * Given a directed graph, design an algorithm to find out whether there is a route between two nodes.

Example
Given graph:

A----->B----->C
 \     |
  \    |
   \   |
    \  v
     ->D----->E
for s = B and t = E, return true

for s = D and t = C, return false
 */
/**
 * Definition for Directed graph.
 * class DirectedGraphNode {
 *     int label;
 *     ArrayList<DirectedGraphNode> neighbors;
 *     DirectedGraphNode(int x) {
 *         label = x;
 *         neighbors = new ArrayList<DirectedGraphNode>();
 *     }
 * };
 */
public class RouteBetweenTwoNodesInGraph {

    /**
     * @param graph: A list of Directed graph node
     * @param s: the starting Directed graph node
     * @param t: the terminal Directed graph node
     * @return: a boolean value
     */
    public boolean hasRoute(ArrayList<DirectedGraphNode> graph, DirectedGraphNode s, DirectedGraphNode t) {
        Set<DirectedGraphNode> set = new HashSet<DirectedGraphNode>();

    }

    public boolean bfs() {
        for (DirectedGraphNode neighbor : s.neighbors) {
            if (set.contains(neighbor)) {
                continue;
            }
            set.add(neighbor);
            if (neighbor == t) {
                return true;
            }
        }
    }

}
