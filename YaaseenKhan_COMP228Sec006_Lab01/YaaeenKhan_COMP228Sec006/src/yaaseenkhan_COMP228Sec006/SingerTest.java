package yaaseenkhan_COMP228Sec006;

public class SingerTest {

	public static void main(String[] args) {
		Singer singer01 = new Singer();
		singer01.setSingerId(301164475);
		singer01.setName("Yaaseen_Khan");
		singer01.setAddress("Toronto");
		singer01.setDateofBirth(02,18,1998);
		singer01.setNumberOfAlbums(12);
		
		System.out.println("Singer 1 data");
		System.out.println("-------------");
		System.out.println(singer01.getSingerId());
		System.out.println(singer01.getName());
		System.out.println(singer01.getAddress());
		System.out.println(singer01.getDateofBirth());
		System.out.println(singer01.getnumberOfAlbums());
		
		System.out.println("\n==============");
		
		Singer singer02 = new Singer();
		singer02.setSinger(23, "Piage", "Texas" , 9, 02 , 2002 , 10);
		
		
		System.out.println("\nSinger 2 data");
		System.out.println("-------------");
		System.out.println(singer02.getSingerId());
		System.out.println(singer02.getName());
		System.out.println(singer02.getAddress());
		System.out.println(singer02.getDateofBirth());
		System.out.println(singer02.getnumberOfAlbums());
		
	
		
	}

}
