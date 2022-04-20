package misc;


import java.util.Map;

public class TrappingRainWater {

    public int trap(int[] height) {

        int totalWater = 0;
        int [] leftMax = new int[height.length];
        int [] rightMax = new int[height.length];

        leftMax[0] = height[0];
        //fill left array
        for(int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for(int i = 0; i < height.length; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return totalWater;

    }

    public static void main(String[] args) {

    }
}
