package company.Ajacs;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("siri");
		s.concat("Sailu");
		//s=s.concat("jyothi");
		
		System.out.println(s);
		
		String s2=s.concat("winter");
		s2.concat("sailu");
		System.out.println(s2);
		String s4="siri";
		String s5="siri";
		System.out.println(s4==s2);
		StringBuffer s1=new StringBuffer("Sailu");
		StringBuffer s3=new StringBuffer("Sailu");
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		//s1.append("sailu");
		//s.concat("sha");
//		s[0]="mani";
//		s[1]="siri";
//		s[2]="jyothi";
		//System.out.println(s+"\n"+s1);
	}

}
