package useit;

import annotstuff.MyAnnot;

@MyAnnot(value="v", name="Alex", kids={})
public class UseIt {
	
//	@MyAnnot("v")
//	@MyAnnot(value="v", kids= {"Freda", "Sue"})
	@MyAnnot(value="v", kids="Sue")
	private int x;
	
//	@MyAnnot("v")
	public void doStuff() {}

}
