/**
 * Created by ghassem on 2/8/2014.
 */
public class NumNode {
    private static NumNode Nodes = null;
    NumNode Next;
    int Value;

    //constructor
    public NumNode(int V)  {
        Value = V;
        Next = null;
    }

    public static NumNode Head()  {
        return Nodes;
    }

    public void Insert(){
        if (Nodes == null) {
            Nodes = this;
            return;
        }

        if(Value < Nodes.Value) {
            Next = Nodes;
            Nodes = this;
            return;
        } else if(Nodes.Next==null){
            Nodes.Next = this;
            return;
        }
         for (NumNode N=Nodes; N.Next!=null; N=N.Next ){

           if (Value< N.Next.Value){
               Next=N.Next;
               N.Next=this;
               return;
            } else if(N.Next.Next==null){
                 N.Next.Next=this;
                 return;
             }
        }


    }


    public static void PrintList(){
        if (Nodes == null) {
            System.out.println("Nothing in the list!");
            return;
        }
        for (NumNode N= Nodes;  N!=null;  N= N.Next ){
         System.out.println(N.Value);
        }
    }

}
