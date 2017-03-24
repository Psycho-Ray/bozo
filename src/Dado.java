public class Dado {
	private int n, last = 1;
	private Random d = new Random();

	public Dado() {
		this.n = 6;
	}

	public Dado(int n) {
		this.n = n;
	}

	public int getLado() {
		return this.last;
	}

	public int rolar() {
		/* If n == 6, then getIntRand will 
		return a number between 0 and 5. Thus the +1 */
		this.last =  d.getIntRand(n - 1) + 1;

		return last;
	}

	@Override
	public String toString() {
		if (this.last == 1) 
			return "+-----+\n|     |\n|  *  |\n|     |\n+-----+";
		
		if (this.last == 2) 
			return "+-----+\n|*    |\n|     |\n|    *|\n+-----+";

		if (this.last == 3)
			return "+-----+\n|*    |\n|  *  |\n|    *|\n+-----+";
		
		if (this.last == 4) 
			return "+-----+\n|*   *|\n|     |\n|*   *|\n+-----+";
		
		if (this.last == 5) 
			return "+-----+\n|*   *|\n|  *  |\n|*   *|\n+-----+";
		
		if (this.last == 6)
			return "+-----+\n|* * *|\n|     |\n|* * *|\n+-----+";

		return "" + this.last;	
	}
}

/*

 1          2          3          4          5			6
+-----+    +-----+    +-----+    +-----+    +-----+		+-----+
|     |    |*    |    |*    |    |*   *|    |*   *|		|* * *|
|  *  |    |     |    |  *  |    |     |    |  *  |		|     |
|     |    |    *|    |    *|    |*   *|    |*   *|		|* * *|
+-----+    +-----+    +-----+    +-----+	+-----+		+-----+

*/