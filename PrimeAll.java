package janani;

public class PrimeAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
for(i=8;i<=17;i++){
	int count=0;
	for(j=1;j<=i;j++){
		if(i%j==0){
			count ++;
			}
	}
	if(count==2){
		System.out.print(i+" ");
	}
}

	}

}	
