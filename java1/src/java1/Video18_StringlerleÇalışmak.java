package java1;

public class Video18_StringlerleÇalışmak {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";

		System.out.println(mesaj);
		
		String yeniMesaj = mesaj.replace("" ,"" );
		System.out.println(yeniMesaj.replace("","" ));
		System.out.println(mesaj.substring(2,4)); //ikinci karakterden dördüncü karaktere kadar kes
		
		for (String kelime : mesaj.split("")) {
			System.out.println(kelime); //mesajımızı dik bir şekilde yazar
			
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim()); //ifademizin başındaki ve sonunddaki boşlukları siler
		
		

	}

}
