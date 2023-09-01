public class StockBuySell {
    public static void main(String args[])
    {
        int arr[] = {7,1,5,3,6,4};
        int maxpro = maxProfit(arr);
        System.out.println(maxpro);
    }

    static int maxProfit(int [] arr)
    {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }
        return maxPro;
    }
}