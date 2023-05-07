import java.util.*;

public class TrappingRainwater {
    public static int Rainwater(int[] height) {
        int n = height.length;
        
        // Calculate left max boundary -> array
        int[] LeftMAX = new int[n];
        LeftMAX[0] = height[0];
        for(int i = 1; i < n; i++){
            LeftMAX[i] = Math.max(LeftMAX[i - 1], height[i]);
        }


        // Calculate right max boundary -> array
        int[] RightMAX = new int[n];
        RightMAX[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            RightMAX[i] = Math.max(RightMAX[i + 1], height[i]);
        }


        int trappedWater = 0;
        //loop
        for(int i = 0; i < n; i++){
            // waterLevel = min(MaxLeft Boundary, MaxRight Boundary)
            int waterLevel = Math.min(LeftMAX[i], RightMAX[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped Water is " +Rainwater(height));
    }
}