
public class App {

	public static void main(String[] args) {
		LinkedList playList=new LinkedList();
		Song song1 = new Song("1. Permission to Dance", "BTS", 3.7f);
		Song song2 = new Song("2. Bimariyan", "Preetinder", 3.19f);
		Song song3 = new Song("3. Sach Keh Raha Hai", "B Praak", 3.44f);
		
		playList.add(song1);
		playList.add(song2);
		playList.add(song3);
		
		System.out.println("Is playList Empty: "+playList.isEmpty());
		System.out.println("Length of playList: "+playList.length());
		
		playList.iterate(true);
		System.out.println("~~~~~~~~~~~~~~~~");
		playList.iterate(false);

	}

}
