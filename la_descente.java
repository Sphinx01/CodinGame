public class Player {
	public static void main(String [] args){
		int [] tab = new int [8];
		
		tab[0] = 5;
		tab[1] = -12;
		tab[2] = 2;
		tab[3] = 17;
		tab[4] = 17;
		tab[5] = 25;
		tab[6] = 0;
		tab[7] = 35;
		
		for(int i = 0; i < tab.length; i++){
			System.out.print("\t" + tab[i]);
		}
		
		int h;
		for(int i = 0; i < tab.length-1; i++){
			for(int j = i+1; j < tab.length; j++){
				if(tab[i] < tab[j]){
					h = tab[j];
					tab[j] = tab[i];
					tab[i] = h;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < tab.length; i++){
			System.out.print("\t" + tab[i]);
		}
	}
}
