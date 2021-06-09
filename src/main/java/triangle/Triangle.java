package triangle;

import java.util.Arrays;

public class Triangle{
	
	private Triangle() {
		
	}
	
	public static String triangle(float[] arr) {
    	String result = "";
        Arrays.sort(arr);
        if (arr[0] <= 0) result = "不能成為三角形";
        else if (arr[0] + arr[1] <= arr[2]) result = "不能成為三角形";
        else if (arr[0] == arr[1] && arr[0] == arr[2]) result = "正三角形";
        else if (arr[0] == arr[1] || arr[1] == arr[2]) result = "等腰三角形";
        else if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) > Math.pow(arr[2], 2)) result = "銳角三角形";
        else if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) < Math.pow(arr[2], 2)) result = "鈍角三角形";
        else result = "直角三角形";
        
        return result;
    }
}