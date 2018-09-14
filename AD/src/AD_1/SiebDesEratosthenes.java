package AD_1;

public class SiebDesEratosthenes {
	public static void main(String args[]) {
		primZahl(25);
	}
	
	public static void primZahl(int n) {
		int[] a = new int[n+1];
		for (int i=2; i<=n; i++) {
			for (int j=2; j<=n/i; j++) a[i*j]=1;	
			if (a[i]!=1) System.out.print(i + " ");
		}
	}
}

//cach 2
//int i=0;

//while (a[i]<=Math.sqrt(n)) {
//	if (a[i]!=0) {
//		for (int j=i+1; j<n-1; j++) 
//			if (a[j]%a[i]==0) a[j]=0;
//		i++;
//	} else i++;
// ___________________________________________________________________

/* cach 3
			int[] a = new int[n-1];
		
		for (int k=0; k<n-1; k++) {
			a[k] = k+2;
		}
		
		for (int i=0; i<n-1; i++) 
			if (a[i]!=0) && a[i]<=Math.sqrt(n))
				for (int j=i+1; j<n-1; j++)
					if (a[j]%a[i]==0) a[j]=0;
		
		for (int k=0; k<n-1; k++) {
			if (a[k]!=0) System.out.print(a[k] + " ");
		}
*/