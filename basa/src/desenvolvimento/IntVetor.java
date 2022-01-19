package desenvolvimento;

public class IntVetor {

	public static void main(String[] args) {
		
		int v[] = null;
		v[1] = 1;
		v[2] = 1;
		
		for(int i = 3; i < 13; i++) {
			
			v[i] = v[i - 1] + v[i - 2];
			
			System.out.println(v[i]);
		}

	}

}
