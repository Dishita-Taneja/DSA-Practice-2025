package advancearray;

public class beststock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update max profit
            }
        }

        return maxProfit;
    }
 public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);
    }
}
// usong kandane \\
// for(int i = 1 ; i < prices.length ; i++){
//     int profit = prices[i] - prices[i-1];
//     max = Math.max(0 , max + profit);
//     maxsofar = Math.max(maxsofar , max);
// }
// return maxsofar;