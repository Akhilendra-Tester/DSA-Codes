class SolutionU{
    public static double power(double x,int n)
    {
        double res=1;
        long nn = n;
        if(nn<0)
        {
            nn = -1*nn;
        }

        while(nn>0)
        {
            if(nn % 2 == 1)
            {
                res = res*x;
                nn = nn-1;
            }
            else
            {
                x = x*x;
                nn = nn/2;
            }
        }        

        if(n<0)
        {
            res = (double)(1.0)/(double)res;   
        }

        return res;
    }
}

public class Power {
    public static void main(String args[])
    {
        double res = SolutionU.power(2,10);

        System.out.println(res);
    }
}
