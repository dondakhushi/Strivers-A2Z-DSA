import java.util.ArrayList;
public class Pascal_Triangle {
    public static ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        for (int i =0; i <numRows; i++)
        {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++)
            {
                if (j == 0 || j == i)
                {
                    row.add(1);
                }
                else{
                    row.add(triangle.get(i-1).get(j - 1) + triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
        
    }
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }
}
