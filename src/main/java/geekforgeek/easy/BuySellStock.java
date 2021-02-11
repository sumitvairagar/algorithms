package geekforgeek.easy;

public class BuySellStock {
    // [1, 2, 3, 4, 5]
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int boughtStock = -1;
        for(int i = 0; i < prices.length; i++){
            if(prices.length > i + 1 && prices[i] < prices[i + 1]){
                // Buy the stock
                if(boughtStock == -1 )
                    boughtStock = prices[i];
            }else{
                if(boughtStock != -1){
                    profit += prices[i] - boughtStock;
                    boughtStock = -1;
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = new int[] {7,1,5,3,6,4};
        //System.out.println("Max Profit for [7,1,5,3,6,4] : " + maxProfit(prices));
        prices = new int[] {1, 2, 3, 4, 5};
        //System.out.println("Max Profit for [1, 2, 3, 4, 5] : " + maxProfit(prices));
        prices = new int[] {7,1,5,3,6,4};
        System.out.println("Max Profit for [7,1,5,3,6,4] : " + maxProfit(prices));
    }
}
