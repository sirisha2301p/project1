package Pack;

class Main
{
  public static void main(String args[])
  {
	sum (new int[]{34,556,33});
  }
  public static void sum (int[] x)
  {
	int total = 0;
  for (int x1:x)
	  {
		total += x1;
}

System.out.println (total);
}}