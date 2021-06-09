package idv.biggraybao.JUnitTest_maven;

import binarySearch.*;
import triangle.*;

import java.util.Arrays;

import org.json.*;

public class App {
	public static void main(String[] args) {
		String jdata = "{\"Array\": [\"5.0\", \"4.0\", \"3.0\", \"2.0\", \"1.0\", \"6.0\", \"7.0\", \"9.0\", \"8.0\", \"0\", \"100.0\", \"1000.0\", \"10000.0\"]}";
		JSONObject jobj = new JSONObject(jdata);
		JSONArray jarr = jobj.getJSONArray("Array");
		float[] arr = new float[jarr.length()];
		for(int i = 0; i < jarr.length(); i++)
			arr[i] = Float.parseFloat(jarr.getString(i));
        Arrays.sort(arr);
		System.out.println("Index:" + BinarySearch.binarySearch(arr, 1000));
		
		float[] arr1 = {3, 4, 5};
		System.out.println(Triangle.triangle(arr1));
	}
}