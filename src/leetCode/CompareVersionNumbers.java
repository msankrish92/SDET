package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class CompareVersionNumbers {

//	@Test
//	public void example1() {
//		String version1 = "1.0";
//		String version2 = "1.0.0";
//		System.out.println(method2(version1, version2));
//	}
//	
	@Test
	public void example2() {
		String version1 = "7.5.2.4";
		String version2 = "7.5.3";
		System.out.println(method2(version1, version2));
	}

	/*
	 * public int method1(String version1, String version2) { String[] v1 =
	 * version1.split("\\."); String[] v2 = version2.split("\\.");
	 * 
	 * 
	 * 
	 * int n = Math.max(v2.length,v1.length); System.out.println(n);
	 * 
	 * String[] dupv1 = new String[n]; String[] dupv2 = new String[n];
	 * 
	 * for (int i = 0; i < dupv1.length; i++) { if(v1.length>i) { dupv1[i] = v1[i];
	 * }else { dupv1[i] = "0"; } }
	 * 
	 * for (int i = 0; i < dupv2.length; i++) { if(v2.length>i) { dupv2[i] = v2[i];
	 * }else { dupv2[i] = "0"; } }
	 * 
	 * 
	 * System.out.println("dupv1"); for(int i = 0; i<dupv1.length; i++){
	 * System.out.println(dupv1[i]); } System.out.println("dupv2"); for(int i = 0;
	 * i<dupv2.length; i++){ System.out.println(dupv2[i]); }
	 * 
	 * for(int i = 0; i<n; i++){
	 * if(Integer.valueOf(dupv1[i])<Integer.valueOf(dupv2[i])){ return -1; }else
	 * if(Integer.valueOf(dupv1[i])>Integer.valueOf(dupv2[i])){ return 1; } }
	 * 
	 * return 0; }
	 */

	public int method2(String version1, String version2) {

//		String replaceV1 = version1.replaceFirst("\\.","");
//		String replaceV2 = version2.replaceFirst("\\.","");

		int v1Index = 0;
		int v2Index = 0;

		for (int i = 0; i < version1.length(); i++) {
			if (version1.charAt(i) == '.') {
				v1Index = i;
				break;
			}
		}
		for (int i = 0; i < version2.length(); i++) {
			if (version2.charAt(i) == '.') {
				v2Index = i;
				break;
			}
		}
//		String replaceV1 = version1.substring(v1Index+1,version1.length());

		String replaceV1 = version1.substring(0, v1Index + 1) + version1.substring(v1Index + 1).replaceAll("\\.", "");

		System.out.println(replaceV1);

		String replaceV2 = version2.substring(0, v2Index + 1) + version2.substring(v2Index + 1).replaceAll("\\.", "");

		System.out.println(replaceV2);

//		version1.re

		if(Double.valueOf(replaceV1)<Double.valueOf(replaceV2)) {
			return -1;
		}
		if(Double.valueOf(replaceV1)>Double.valueOf(replaceV2))
		return 1;
		return 0;
	}

}
