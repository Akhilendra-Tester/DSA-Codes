class SolutionSM{

    //O(m*n)
    public static boolean Search1(int matrix[][],int target)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    //O(logm * logn)
    public static boolean Search2(int matrix[][],int target)
    {
        int m = matrix.length;
        int n = matrix[0].length;
        int i=0,j=n-1;

        while(i<m && j>=0)
        {
            if(matrix[i][j] == target)
            {
                return true;
            }
            else if(matrix[i][j] < target)
            {
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }

    //O(log(m*n))
    public static boolean Search3(int matrix[][],int target)
    {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m*n-1;
        
        while(low <= high)
        {
            int mid = (high + low)/2;
            if(matrix[mid/n][mid%n] == target)
            {
                return true;
            }
            if(matrix[mid/n][mid%n] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return false;
    }
}

public class SearchMatrix {
    public static void main(String args[])
    {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        boolean ans = SolutionSM.Search3(matrix,16);

        System.out.println(ans);
    }
}
