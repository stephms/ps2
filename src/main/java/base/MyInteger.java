package base;

public class MyInteger {

		private int iValue;

		public MyInteger(int iValue) {
			super();
			setiValue(iValue);
		}

		public int getiValue() {
			return iValue;
		}

		public void setiValue(int iValue) {
			this.iValue = iValue;
		}
		
		public boolean isEven()
		{
			if ((getiValue()%2)==0)
				return true; //even
			else
				return false; //odd
		}
		
		public boolean isOdd()
		{
			if ((getiValue()%2)==0)
				return false; //even
			else
				return true; //odd
		}
		
		public boolean isPrime()
		{
			//check if iValue is a multiple of 2
		    if (getiValue()%2==0)
		    	return false;
		    //if not, then just check the odds
		    for(int i=3;i*i<=getiValue();i+=2) {
		        if(getiValue()%i==0)
		            return false;
		    }
		    return true;
		}
		
		public static boolean isEven(int n)
		{
			if ((n%2)==0)
				return true; //even
			else
				return false; //odd
		}
		
		public static boolean isOdd(int n)
		{
			if ((n%2)==0)
				return false; //even
			else
				return true; //odd
		}
		
		public static boolean isPrime(int n)
		{
			//check if n is a multiple of 2
		    if (n%2==0)
		    	return false;
		    //if not, then just check the odds
		    for(int i=3;i*i<=n;i+=2) {
		        if(n%i==0)
		            return false;
		    }
		    return true;
		}
		
		public static boolean isEven(MyInteger n)
		{
			return MyInteger.isEven(n);
		}
		
		public static boolean isOdd(MyInteger n)
		{
			return MyInteger.isOdd(n);
		}
		
		public static boolean isPrime(MyInteger n)
		{
			return MyInteger.isPrime(n);
		}
		
		public boolean equals(int n)
		{
			if (n==(getiValue()))
				return true;
			else
				return false;
		}
		
		public boolean equals(MyInteger n)
		{
			if (n.getiValue() == this.getiValue())
				return true;
			else
				return false;
}
}