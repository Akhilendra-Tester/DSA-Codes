public class UniquePaths {

    public static int CountPaths(int i,int j,int m,int n)
    {
        if(i == (m-1) && j== (n-1))
        return 1;
        if(i>=m || j>=n)
        return 0;
        else
        return CountPaths(i+1,j,m,n)+CountPaths(i,j+1,m,n);
    }

    public static int uniquePaths1(int m, int n)
    {
        return CountPaths(0,0,m,n);
    }

    public static int uniquePaths2(int m,int n)
    {
        int N = m+n-2;
        int r = n-1;
        double res = 1;

        for(int i=1;i<=r;i++)
        {
            res = res * (N-r+i)/i;
        }

        return (int)res;
    }
    public static void main(String args[])
    {
        int m=3,n=7;
        int ans = uniquePaths2(m, n);
        System.out.println(ans);
    }
}