package Resursion;

public class TowerOfHanoi {
	public static int step = 1;
	
	//from apna college resursion  series Q1
	public static void TowerOfHan(int disc, String source, String helper, String destination) {
		if(disc==1) {
			System.out.println("Step "+step+")"  +" Transfer disc "+disc+" from "+source+" to "+destination);
			return;
		}
		TowerOfHan(disc-1,source,destination,helper);
		step++;
		System.out.println("Step "+step+")"+" Transfer disc "+disc+" from "+source+" to "+destination);
		step++;
		TowerOfHan(disc-1,helper,source,destination);
	}

	public static void main(String[] args) {
		int disc=3;
		TowerOfHan(disc,"Source(tower1)","Helper(tower2)","Destination(tower3)");

	}

}
