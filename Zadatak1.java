package domaci;

import java.util.*;

public class Zadatak1 {

	static void inflacija(){
		Scanner unos=new Scanner(System.in);
		int a, i, b;
		System.out.println("Ulog");
		a=unos.nextInt();
		b=a;
		for(i=0;i<10;i++){
			b*=1.07;
		}
		System.out.println("Godisnja stopa inflacije za 7% je "+((b-a)/10));
		b=a;
		for(i=0;i<10;i++){
			b*=1.08;
		}
		System.out.println("Godisnja stopa inflacije za 8% je "+((b-a)/10));
	}
	
	static void obim(){
		Scanner unos=new Scanner(System.in);
	    int[][] mat=new int[2][3];
	    int i, j;
	    for(i=0;i<2;i++){
	    	for(j=0;j<3;j++){
	    		System.out.println("Stranica "+j+" trougla "+i);
	    	    mat[i][j]=unos.nextInt();
		    }
	    }
	    if(mat[0][0]+mat[0][1]+mat[0][2]-(mat[1][0]+mat[1][1]+mat[1][2]) > 0){
			System.out.println("Veci je prvi trougao");
	    }else if(mat[0][0]+mat[0][1]+mat[0][2]-(mat[1][0]+mat[1][1]+mat[1][2]) < 0){
	    	System.out.println("Veci je drugi trougao");
	    }else{
	    	System.out.println("Jednaki su");
	    }
	}
	
	static void tacke(){
		Scanner unos=new Scanner(System.in);
		float[][] mat=new float[2][2];
		int i, j;
	    for(i=0;i<2;i++){
	    	for(j=0;j<2;j++){
	    		System.out.println("Koordinata "+j+" tacke "+i);
	    	    mat[i][j]=unos.nextFloat();
		    }
	    }
	    System.out.println("Rastojanje tacke A od koordinatnog pocetka je "+Math.sqrt(Math.pow(mat[0][0],2)+Math.pow(mat[0][1],2)));
	    System.out.println("Rastojanje tacke A od tacke B je "+Math.sqrt(Math.pow(mat[0][0]-mat[1][0],2)+Math.pow(mat[0][1]-mat[1][1],2)));
	    System.out.println("Koordinate tacke C su "+(mat[0][0]+mat[1][0])/2+","+(mat[0][1]+mat[1][1])/2);
	}
	
	static void informatika(){
		Scanner unos=new Scanner(System.in);
		int a;
		do{
			System.out.println("informatika");
			a=unos.nextInt();
		}while(a!=1);
		
	}
	
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		int a;
		System.out.println("Unesite 1,2,3 ili 4");
		System.out.println("1. Inflacija");
		System.out.println("2. Obim");
		System.out.println("3. Tacke");
		System.out.println("4. Informatika");
		a=unos.nextInt();
		if(a==1){
			inflacija();
		}else if (a==2) {
			obim();
		}else if (a==3) {
			tacke();
		}else if (a==4) {
			informatika();
		}else{
			System.out.println("POGRESAN BROJ REKOH 1,2,3 ILI 4");
		}
	}
}
