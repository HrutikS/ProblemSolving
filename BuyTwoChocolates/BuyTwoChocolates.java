class Solution {
  public int buyChoco(int[] prices, int money) {

    //First Approach
    // Arrays.sort(prices);
    // int temp = prices[0]+prices[1];
    // if(temp > money){
    //     return money;
    // }else if(temp == money){
    //     return 0;
    // }else{
    //     return (money-temp);
    // }

    //Optimised
    // int minPrice = Integer.MAX_VALUE;
    // int secMinPrice = Integer.MAX_VALUE;

    // for(int price : prices){
    //   if(price < minPrice){
    //     secMinPrice = minPrice;
    //     minPrice = price;
    //   }else{
    //     secMinPrice = Math.min(secMinPrice, price);
    //   }
    // }

    // if(minPrice+secMinPrice > money){
    //   return money;
    // }

    // return money - (minPrice+secMinPrice);

    //More Optimised
    int min1 = Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE;

    for (final int price : prices){
      if (price <= min1) {
        min2 = min1;
        min1 = price;
      } else if (price < min2) {
        min2 = price;
      }
    }

    final int minCost = min1 + min2;
    return minCost > money ? money : money - minCost;
    
  }
  
}
