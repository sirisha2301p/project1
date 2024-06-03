package string;

public class StringClassLikeFramed {
	private int i;

	public StringClassLikeFramed(int i) {
		this.i = i;
	}

	public StringClassLikeFramed modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new StringClassLikeFramed(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringClassLikeFramed s = new StringClassLikeFramed(10);
		System.out.println(s.modify(100));
		System.out.println(s.modify(10)==s);
		
	}

}
