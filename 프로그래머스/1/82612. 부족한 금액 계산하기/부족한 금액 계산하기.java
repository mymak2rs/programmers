class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        long sumPrice = price;
        for(int i = 0; i <count; i++) {
        	totalPrice += sumPrice;
        	sumPrice += price;
        }
        System.out.println(totalPrice);
        if(totalPrice <= money) {
        	return 0;
        }else {
        	return totalPrice - money;
        }
    }
}