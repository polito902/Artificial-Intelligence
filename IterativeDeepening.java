import java.util.scanner;
import java.util.InputMismatchException;
import java.util.Stack;
import java.io.File;
public class IterativeDeepening
{
    private Stack<Integer> stack;
    private int numberOfNodes;
    private int depth;
    private int maxDepth;
    private boolean goalFound = false;
    
    public IterativeDeepening()
    {
        stack=new Stack<Integer>();
    }
    
    private void depthLimitedSearch(int adjacencyMatrix[][], int source, int goal)
    {

        int element, destination = 1;
        int[] visited = new int[numberOfNodes + 1];
        stack.push(source);
        depth = 0;
        while (!stack.isEmpty())
        {
            element = stack.peek();
            while (destination <= numberOfNodes)
            {
                if (depth < maxDepth)
                {
                    if (adjacencyMatrix[element][destination] == 1)
                    {
                        stack.push(destination);
                        visited[destination] = 1;
                        System.out.print(destination + "\t");
                        depth++;
                        if (goal == destination)
                        { 
                            goalFound = true;
                            return;
                        }
                        element = destination;
                        destination = 1;
                        continue;
                    }
                } else 
                {
                    break;
                }
                destination++;
            }
            destination = stack.pop() + 1;
            depth--;
        }
    }