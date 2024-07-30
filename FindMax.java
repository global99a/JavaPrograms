class FindMax{
	public static void main(String[] args){
	int n=109;
	int rem,fmax=0,smax=0;

	while(n>0){
	rem=n%10;//7,5,6
	n=n/10;//65
	if(rem>fmax)//
         {
	 smax=fmax;//0
	 fmax=rem;//7

	}
        else if ((rem>smax) && (rem!=fmax)){
	smax=rem;//5,6
	}

      }
System.out.println("fmax is:"+fmax);

System.out.println("smax is:"+ smax);

}
}


	
        
	
