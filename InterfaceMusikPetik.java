/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 19 April 2020
	Waktu	: 22.51 WITA
*/  

class InterfaceMusikPetik implements InterfaceMusik
{
protected String nama;

public void mainkan( ){
System.out.println(ambilNama( ) +" dimainkan dengan cara petik");
}

public void setelNada( ){
System.out.println("Setel nada pada " + ambilNama( ));
}

public String ambilNama( ){
return nama;
}
}