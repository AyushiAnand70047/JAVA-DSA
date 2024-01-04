/* Trapping RainWater: Given a non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining */
// trapped water = (waterLevel - barLevel)*width
// waterLevel = min(maxLeftBoundary, maxRightBoundary)
public class trappingRainwater{
    public static int amountTrapped(int height[]){
        // maxLeftBoundary
        int maxLeft[] = new int[height.length];
        maxLeft[0] = height[0];
        for(int i=1;i<maxLeft.length;i++){
            maxLeft[i] = Math.max(height[i],maxLeft[i-1]);
        }
        //maxRightBoundary
        int maxRight[] = new int[height.length];
        maxRight[maxRight.length-1] = height[height.length-1];
        for(int i=maxLeft.length-2;i>=0;i--){
            maxRight[i] = Math.max(height[i],maxRight[i+1]);
        }
        // loop
        int trappedWater = 0;
        for(int i=0;i<height.length;i++){
            int waterLevel = Math.min(maxLeft[i],maxRight[i]);
            trappedWater+=waterLevel-height[i];
            // int trapped = waterLevel -height[i];
            // if(trapped > 0){
            //     trappedWater += trapped;
            // }
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,3,2,5};
        System.out.print(amountTrapped(height));
    }
}