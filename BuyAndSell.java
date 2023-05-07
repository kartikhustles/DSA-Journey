public class BuyAndSell {
    public static int Stocks(int[] price) {
        int Buy = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int i = 0; i < price.length; i++){
            if(Buy < price[i]){
                int Profit = price[i] - Buy;
                MaxProfit = Math.max(MaxProfit, Profit);
            }
            else{
                Buy = price[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        System.out.println(Stocks(price));
    }
}
