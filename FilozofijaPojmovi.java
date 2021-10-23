/*
 * Aplikacija daje korisniku 10 nasumicno izabranih pitanja, sa dva ponuđena odgovora između kojih korisnik treba da izabere tačan odgovor 
 * i unese broj koji se nalazi ispred odgovora. Nakon 10 odgovorenih pitanja korisnik dobija informaciju o ocjeni i broju tačnih odgovora. 
 */

package Practice;

import java.util.Scanner;

public class FilozofijaPojmovi {

	public static void ocjena (int bodovi) {

		if (bodovi >= 8) {
			System.out.println("Vasa ocjena je 5.");
		}
		else if (bodovi >= 7) {
			System.out.println("Vasa ocjena je 4.");
		}
		else if(bodovi >= 6) {
			System.out.println("Vasa ocjena je 3.");
		}
		else if(bodovi >= 5) {
			System.out.println("Vasa ocjena je 2.");
		}
		else {
			System.out.println("Vasa ocjena je 1.");
		}
	}
	
	public static boolean Username(String u_name) {
		
		int brojac=0;
		
		if(u_name.length()<8) {
			return false;
		}else
			
			for(int i=0;i<u_name.length();i++) {
				
				if(Character.isLetterOrDigit(u_name.charAt(i))) {
					
					if(Character.isDigit(u_name.charAt(i))) {
						brojac++;
					}
				}
			}if(u_name.length()>=8&&brojac>=2) {
				return true;
				
			}else return false;
	}

	public static void pojmovi (int pojam) {
		
		 System.out.println(pojam);
		
		 switch (pojam) {
		 
		 case 0: System.out.println("Agnosticizam?\n1.)filozofsko ucenje koji nijece"
		 		+ "mogucnost potpune spoznaje biti svijeta, onog apsolutnog"
				 +"\n2.)slicnost");
		 
		 break;
		 
		 case 1: System.out.println("Aksiologija?\n3.)negiranje svih nacela i ideala"
		 		+ "\n4.)filozofska disciplina o vrijednostima?");
		 
		 break;
		 
		 case 2 : System.out.println("Aksiom?\n5.)ucenje da je Bog u svijetu"
		 		+ "\n6.)nedokaziva istina toliko sigurna da ne treba dokaze");
		 
		 break;
		 
		 case 3: System.out.println("Alijenacija?\n7.)otudenje\n8.)isijavanje");
		 
		 break;
		 
		 case 4: System.out.println("Altruizam?\n9.)briga i pomaganje drugome"
		 		+ "\n10.)odbrana");
		 
		 break;
		 
		 case 5: System.out.println("Analogija?\n11.)slicnost\n)12.mudra izreka");
		 
		 break;
		 
		 case 6: System.out.println("Anarhizam?\n13.)svjesno opazanje\n14.)bezvlasce");
		 
		 break;
		 
		 case 7: System.out.println("Antinomija?\n15.)proturecje nekog stava sa samim sobom"
		 		+ "\n16.)samodovoljnost");
		 
		 break;
		 
		 case 8: System.out.println("Antripocentrizam?\n17.)stanje da je covjek "
		 		+ "srediste svega\n18.)oponasanje");
		 
		 break;
		 
		 case 9: System.out.println("Antropologija?\n19.)znanost koja proucava covjeka"
		 		+ "\n20.)bezuvjetna zapovijed");
		 
		 break;
		 
		 case 10: System.out.println("Antropomorfizam?n\21.)vjerovanje da je zbivanje u "
		 		+ "svijetu unaprijed odredeno\n)22.)pridavanje ljudskih osobina stvarima");
		 
		 break;
		 
		 case 11: System.out.println("Apercepcija?\n23.)svjesno opazanje"
				 +"\n24.)postupak gdje se iz razlicitih teorija uzima ono sto je"
				+ "najprikladnije u formiranju nove teorije");
		 
		 break;
		 
		 case 12: System.out.println("Apodiktican?\n25.)najblizi nadredeni rodni pojam"
		 		+ "\n26.)neoboriv");
		 
		 break;
		 
		 case 13: System.out.println("Apologija?\n27.)ucenje o sreci kao motivu i cilju"
		 		+ "ljudskog djelovanja\n28.)odbrana");
		 
		 break;
		 
		 case 14: System.out.println("Aporija?\n29.)nedoumica\n30.)priroda");
		 
		 break;
		 
		 case 15: System.out.println("A posteriori?\n31.)prije iskustva\n32.)poslije"
		 		+ "iskustva");
		 
		 break;
		 
		 case 16: System.out.println("A priori?\n33.)prije iskustva\n34.)poslije iskustva");
		 
		 break;
		 
		 case 17: System.out.println("Apstrahirati?\n35.)odvojiti nesto od necega"
		 		+ "\n36.)mislim dakle postojim");
		 
		 break;
		 
		 case 18: System.out.println("Argumentum ad hominem?\n37.)dokaz usmjeren "
		 		+ "protiv osobina neke licnosti\n38.)ucenje koje daje volji primat"
		 		+ " nad razumom");
		 
		 break;
		 
		 case 19: System.out.println("Askeza?\n39.)stav koji se usvaja bez provjeravanja"
		 		+ "\n40.)odricanje od materijalnog");
		 
		 break;
		 
		 case 20: System.out.println("Ataraskija?\n41.)nepomucenost razuma\n42.)samodovljnost");
		 
		 break;
		 
		 case 21: System.out.println("Autarkija?\n43.)nepomucenost razuma\n44.)samodovljnost");
		 
		 break;
		 
         case 22: System.out.println("Bice?\n45.)to sto jest, sto postoji\n46.)ono po cemu jest to "
         		+ "sto jest\n47.)ono po cemu nesto jest to sto jest");
		 
		 break;
		 
         case 23: System.out.println("Bit?\n48.)to sto jest,sto postoji"
         		+ "\n49.)ono po cemu nesto jest to sto jest\n50.)ono po cemu jest to"
         		+ "sto jest");
		 
		 break;
		 
         case 24: System.out.println("Bitak?\n51.)to sto jest,sto postoji" + 
         		"\n52.)ono po cemu nesto jest to sto jest\n53.)ono po cemu jest to sto jest"); 
       
      	 break;
      	 
         case 25: System.out.println("Bivanje?\n54.)ono po cemu jest to sto jest"
         		+ "\n55.)promjena");
         
		 break;
		 
         case 26: System.out.println("Circulus Vitiosus?\n56.)mislim dakle postojim"
          		+ "\n57.)pogresan krug");
          
 		 break;
 		 
         case 27: System.out.println("Cogito ergo sum?\n58.)neposredno motrenje osjetnih oblika"
          		+ "\n59.)mislim dakle postojim");
          
 		 break;
 		 
         case 28: System.out.println("Dedukcija?\n60.)ucenje o tome da je sve predodredeno"
          		+ "\n61.)zakljucivanje od opceg ka pojedinacnom");
          
 		 break;
 		 
         case 29: System.out.println("Definicija\n62.)sud kojim se nesto jednoznacno"
         		+ " i nedvosmisleno odreduje, sadrzaj nekog pojma tako da bude jasan i "
         		+ "razgovijetan\n63.)misaoni proces veoma udaljen od iskustva");
		 
		 break;
		 
         case 30: System.out.println("Deizam?\n64.)ucenje da je Bog umni tvorac svijeta"
          		+ "\n65.)promjena");
          
 		 break;
		 
         case 31: System.out.println("Determinizam?\n66.)ucenje o tome da je sve predodredeno;"
           		+ "\n67.)srednjovjekovna filozofija kao predmet skolskog proucavanja "
           		+ ", u nacelu je podredena teologiji");
           
  		 break;
  		 
         case 32: System.out.println("Dogma?\n68.)stav koji se usvaja bez provjeravanja"
           		+ "\n69.)stav koji se usvaja sa provjeravanjem");
           
  		 break;
  		 
         case 33: System.out.println("Egzaktan?\n70.precizan)"
           		+ "\n71.)tacan");
           
  		 break;
  		 
         case 34: System.out.println("Egzistencija?\n72.)covjekovo postojanje"
           		+ "\n73.)stanje ushicenja");
           
  		 break;
  		 
         case 35: System.out.println("Eklekticizam?\n74.)postupak gdje se iz razlicitih"
         		+ " teorija uzima ono sto je najprikladnije u formiranju nove teorije"
           		+ "\n75.)vjestina prepiranja");
           
  		 break;
 		 
         case 36: System.out.println("Eksplicite?\n76.)jasno, izricito"
           		+ "\n77.)precizan");
           
  		 break;
  		 
         case 37: System.out.println("Ekstaza?\n78.)covjekovo postojanje"
           		+ "\n79.)stanje ushicenja");
           
  		 break;
 		 
         case 38: System.out.println("Emanacija?\n80.)isijavanje"
           		+ "\n81.)stanje ushicenja");
           
  		 break;
 		 
         case 39: System.out.println("Encikolopedisti-grupa francuskih mislilaca"
         		+ " okupljenih oko \"Enciklopedije\" sto su krajem 18. stoljeca objavili"
         		+ " cjelokupno znanje covjeka o svijetu"
           		+ "\n82.)Tacno\n83.)Netacno");
           
  		 break;
 		 
         case 40: System.out.println("Eristika?\n84.)vjestina prepiranja"
           		+ "\n85.)ucenje o sreci kao motivu i cilju ljudskog djelovanja");
           
  		 break;
 		 
         case 41: System.out.println("Eudaimonizam?\n86.)vjestina prepiranja"
            		+ "\n87.)ucenje o sreci kao motivu i cilju ljudskog djelovanja");
            
   		 break;
   		 
         case 42: System.out.println("Fatalizam?\n88.vjerovanje da je zbivanje u svijetu"
         		+ " unaprijed  odredeno"
               + "\n89.)vjerovanje u carobnju moc nekih predmeta");
            
   		 break;
  		 
         case 43: System.out.println("Fetisizam\n90.)vjerovanje da je zbivanje u svijetu "
         		+ "unaprijed odredeno"
            		+ "\n91.)vjerovanje u carobnu moc nekih predmeta");
            
   		 break;
   		 
         case 44: System.out.println("Fizis?\n92.)vjestina prepiranja"
            		+ "\n93.)priroda");
            
   		 break;
   		 
         case 45: System.out.println("Genus  proximum?\n94.)najbilizi nadredeni rodni pojam"
            		+ "\n95.)najblizi podredeni rodni pojam");
            
   		 break;
  		 
         case 46: System.out.println("Hedonizam?\n96.)ucenje po kojem je trenutni tjelesni"
         		+ "uzitak najvise dobro"
                + "\n97.)kulturno-povijesno razdoblje mijesanja i isprepletanja grcke"
                + "grcke i istocnjacke kulture i dominacije grckog duha");
            
   		 break;
  		 
         case 47: System.out.println("Helenizam?\n98.)ucenje po kojem je trenutni tjelesni"
          		+ "uzitak najvise dobro"
                 + "\n99.)kulturno-povijesno razdoblje mijesanja i isprepletanja grcke"
                 + " i istocnjacke kulture i dominacije grckog duha");
             
        break;
 		 
        case 48: System.out.println("Hereza?\n100.)licemjerstvo"
                 + "\n101.)krivovjerje");
             
        break;
        
        case 49: System.out.println("Hermeneutika?\n102.)znanstvena pretostavka"
                + "\n103.)vjestina tumacenja znanstvenih djela");
            
   	    break;
        
        case 50: System.out.println("Hipokrizija?\n104.)licemjerstvo"
                + "\n105.)krivovjerje");
            
        break;
   		 
        case 51: System.out.println("Hipoteza?\n106.)znanstvena pretostavka"
                + "\n107.)vjestina tumacenja znanstvenih djela");
            
   	    break;
       
        case 52: System.out.println("Ideologija?\n108.)nauka o idejama"
                + "\n109.)slaganje predmeta sa samim sobom");
            
   	    break;
   	    
        case 53: System.out.println("Imanentan?\n110.)unutrasnji"
                + "\n111.)vanjski");
            
   	    break;
   	    
        case 54: System.out.println("Implicite?\n112.sto je vec obuhvaceno u necemu)"
                + "\n113.)sto nije obuhvaceno u necemu");
            
   	    break;
   	    
        case 55: System.out.println("Indikacija?\n114.)ukazivanje, nagovjestaj"
                + "\n115.)uvodenje na nekriticko prihvacanje neke doktrine");
            
   	    break;
   	    
        case 56: System.out.println("Indoktrinacija?\n116.)ukazivanje, nagovjestaj"
                + "\n117.)uvodenje na nekriticko prihvacanje neke doktrine");
            
   	    break;

        case 57: System.out.println("Inteligibilan?\n118.)nadosjetilan, samo razumom"
        		+ " shvatljiv"
                + "\n119.)nepovratan");
            
   	    break;
   	    
        case 58: System.out.println("Irevrzibilan?\n120.)nadosjetilan, samo razumom"
        		+ " shvatljiv"
                + "\n121.)nepovratan");
            
   	    break;
   	    
        case 59: System.out.println("Ironija?\n122.)prikriveno ismijavanje kazivanjem"
        		+ " suprotnog od onog sto se misli"
                + "\n123.)slaganje predmeta sa samim sobom");
            
   	    break;
   	    
        case 60: System.out.println("Istina?\n124.)prikriveno ismijavanje kazivanjem"
        		+ "suprotnog od onog sto se misli"
                + "\n125.)slaganje predmeta sa samim sobom");
            
   	    break;
   	    
        case 61: System.out.println("Katarza?\n126.)ociscenje, oplemenjivanje"
                + "\n127.)posljedica");
            
   	    break;
   	    
        case 62: System.out.println("Karma?\n128.)prikriveno ismijavanje kazivanjem"
        		+ " suprotnog od onog sto se misli"
                + "\n129.)budisticko ucenje da je nase djelovanje odredeno"
                + " djelovanjem u predasnjem zivotu");
            
   	    break;
   	    
        case 63: System.out.println("Kategoricki imperativ?\n130.)zakonitost"
                + "\n131.)bezuvjetna zapovijed");
            
   	    break;
   	    
        case 64: System.out.println("Koincidencija?\n132.)podudaranje"
                + "\n133.)proturjecnost");
            
   	    break;
   	    
        case 65: System.out.println("Kauzalitet?\n134.)uzrocno-posljedicna povezanost"
                + "\n135.)posljedica");
            
   	    break;
   	    
        case 66: System.out.println("Konsekvencija?\n136.)uzrocno-posljedicna povezanost"
                + "\n137.)posljedica");
            
   	    break;
   	    
   	    
        case 67: System.out.println("Kontradikcija?\n138.)podudaranje"
                + "\n139.)proturjecnost");
            
   	    break;
   	    
        case 68: System.out.println("Kozmopolitizam?\n140.)zakonitost"
                + "\n141.)ucenje da je covjek gradanin svijeta");
            
   	    break;
   	    
        case 69: System.out.println("Legalitet?\n142.)zakonitost"
                + "\n143.)govor, istina, sveopci zakon");
            
   	    break;
   	    
        case 70: System.out.println("Logos?\n144.)zakonitost"
                + "\n145.)govor, istina, sveopci zakon");
            
   	    break;
   	    
        case 71: System.out.println("Maksima?\n146.)mudra izreka"
                + "\n147.)besmislena izreka");
            
   	    break;
   	    
        case 72: System.out.println("Mehanicizam- ucenje koje sve pojave u prirodi"
        		+ " objasnjava iz: \n148.)hemijskih procesa\n149.)hemijsko-fizickih"
        		+ " procesa");
            
   	    break;
   	    
        case 73: System.out.println("Metafizika?\n150.)neprotezna jedinstvena cjelovita"
        		+ " individualna duhovna supstancija"
                + "\n151.)filozofska disciplina koja proucava prve izvore i uzroke bica");
            
   	    break;
   	    
   	    
   	    
        case 74: System.out.println("Mimezis?\n152.)oponasanje"
                + "\n153.)rezultat spoznaje");
            
   	    break;
   	    
        case 75: System.out.println("Monada?\n154.)neprotezna jedinstvena cjelovita"
        		+ "individualna duhovna supstancija"
                + "\n155.)ontolosko glediste da je bitak jedan");
            
   	    break;
   	    
        case 76: System.out.println("Monizam?\n156.)neprotezna jedinstvena cjelovita"
        		+ " individualna duhovna supstancija"
                + "\n157.)ontolosko glediste da je bitak jedan");
            
   	    break;
   	    
        case 77: System.out.println("Nihilizam?\n158.)negiranje svih nacela i ideala"
                + "\n159.)prihvatanje svih nacela i ideala");
            
   	    break;
   	    
        case 78: System.out.println("Nirvana?\n160.)utrnuce od bola"
                + "\n161.)kalup");
            
   	    break;
   	    
        case 79: System.out.println("Ontologija?\n162.)opca metafizika"
                + "\n163.)ontolosko glediste koje naucava da je bitak jedan");
            
   	    break;
   	    
        case 80: System.out.println("Ortodoksan?\n164.)pravovjeran"
                + "\n165.)tacan");
            
   	    break;
   	    
        case 81: System.out.println("Panlogizam?\n166.)filozofsko ucenje da je logos "
        		+ "osnova svijeta i dogadanja u njemu"
                + "\n167.)ucenje da je Bog u svijetu");
            
   	    break;
   	    
        case 82: System.out.println("Panteizam?\n168.)filozofsko ucenje da je logos "
        		+ "osnova svijeta i dogadanja u njemu"
                + "\n169.)ucenje da je Bog u svijetu");
            
   	    break;
   	    
        case 83: System.out.println("Paradigma?\n170.)mogucnost"
                + "\n171.)kalup");
            
   	    break;
   	    
        case 84: System.out.println("Patristika?\n172.)ucenje crkvenih otaca kojima"
        		+ " brane krscanstvo"
                + "\n173.)ucenje koje sve pojave u prirodi objasnjava iz fizikalno-"
                + "hemijskih procesa");
            
   	    break;
   	    
        case 85: System.out.println("Potencija?\n174.)mogucnost"
                + "\n175.)kalup");
            
   	    break;
   	    
        case 86: System.out.println("Politika?\n176.)skup svih metodicki stecenih"
        		+ "i uredenih znanja"
                + "\n177.)djelovanje usmjereno unapredivanju drzave kao zajednice"
                + " slobodnih gradana");
            
   	    break;
   	    
        case 87: System.out.println("Scijentizam?\n178.)nazor koji u prvi plan"
        		+ "stavlja osjetilnu spoznaju kao kriterij svega"
                + "\n179.)nazor koji u prvi plan postavlja znanstvenu spoznaju "
                + "kao kriterij svega");
            
   	    break;
   	    
        case 88: System.out.println("Semantika?\n180.)nauka o znakovima"
                + "\n181.)opca metafizika");
            
   	    break;
   	    
        case 89: System.out.println("Skepsa?\n182.)sigurnost"
                + "\n183.)sumnja");
            
   	    break;
   	    
        case 90: System.out.println("Skolastika?\n184.)ucenje crkvenih otaca kojima brane krscanstvo"
                + "\n185.)srednjovjekovna filozofija kao predmet skolskog proucavanja"
                + ", u nacelu je podredena teologiji");
            
   	    break;
   	    
        case 91: System.out.println("Solipsizam?\n186.)spoznajno teorijsko glediste"
        		+ "koje tvrdi da postoji samo Ja, svijest sa vlastitim dozivljajima"
        		+ "i nista izvan toga"
                + "\n187.)prelazanje granica iskustva");
            
   	    break;

        case 92: System.out.println("Spekulacija?\n188.misaoni proces veoma udaljen od iskustva"
                + "\n189)znanstvena pretopstavka.");
            
   	    break;
   	    
        case 93: System.out.println("Tabula rasa?\n190.)cista, neispisana prazna ploca"
                + "\n191.)slaganje predmeta sa samim sobom");
            
   	    break;
   	    
        case 94: System.out.println("Teleologija?\n192.)ucenje o svrhovitosti svijeta"
                + "\n193.)ucenje o tome da je sve predodredeno");
            
   	    break;
   	    
        case 95: System.out.println("Transcendencija?\n194.)prelazenje granica iskustva"
                + "\n195.)nepostojece mjesto");
            
   	    break;
   	    
        case 96: System.out.println("Utopija?\n196.)prelazenje granica iskustva"
                + "\n197.)nepostojece mjesto");
            
   	    break;
   	    
        case 97: System.out.println("Voluntarizam?\n198.)ucenje koje daje volji primat nad razumom"
                + "\n199.)ucenje koje razumu primat nad voljom");
            
   	    break;
   	    
        case 98: System.out.println("Zakon?\n200.)pravilan red, poredak stvari"
                + "\n201.)govor istina sveopci zakon");
            
   	    break;
   	    
        case 99: System.out.println("Zbilja?\n202.)cjelokupnost svega sto jest"
                + "\n203.)rezultat spoznaje");
            
   	    break;
   	    
        case 100: System.out.println("Znanost?\n204.)cjelokupnost svega sto jest"
                + "\n205.)skup svih metodicki stecenih i sistemski uredenih znanja");
            
   	    break;
   	    
        case 101: System.out.println("Znanje?\n206.)rezultat spoznaje"
                + "\n207.)prelazenje granica iskustva");
            
   	    break;
   	    
       
        case 102: System.out.println("Zor\n208.)opazaj"
                + "\n209.)neposredno motrenje osjetnih oblika");
            
   	    break;
   	    
        case 103: System.out.println("Zrenje\n210.)opazaj"
                + "\n211.)neposredno motrenje osjetnih oblika");
            
   	    break;
   	    
		 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner input = new Scanner (System.in);
		
		System.out.println("Unesite svoje ime kako biste zapoceli test."
				+ "\n(Ime mora sadrzavati najmanje 8 karaktera, veliko i malo slovo, i najmanje dva broja)");
		
		String sifra = input.next();
		
		int pitanje= (int)(Math.random() * 104);
		
		int brojacPitanja = 0;
		
		if(Username(sifra)) {
			pojmovi(pitanje);
			brojacPitanja++;
		}
		else {
			System.out.println("Vase ime nije validno.Unesite validnu sifru kako biste zapoceli test."
					+"\n(Ime mora sadrzavati najmanje 8 karaktera, veliko i malo slovo, i najmanje dva broja)");
			sifra= input.next();
		}
				
		int odgovor = input.nextInt();
		
		int brojacTacnih = 0;
		
		while(brojacPitanja < 10) {
			pitanje = (int)(Math.random()*104);
			pojmovi(pitanje);
			brojacPitanja++;
			odgovor = input.nextInt();
			
			if(odgovor == 1 || odgovor == 4 || odgovor == 6 || odgovor == 7 || odgovor == 9
					
					|| odgovor == 11 || odgovor == 14 || odgovor == 15 || odgovor == 17
					
					|| odgovor == 19 || odgovor == 22 || odgovor == 23 || odgovor == 25
					
					|| odgovor == 28 || odgovor == 29 || odgovor == 32 || odgovor == 34
					
					|| odgovor == 35 || odgovor == 37 || odgovor == 40 || odgovor == 41
					
					|| odgovor == 44 || odgovor == 45 || odgovor == 49 || odgovor == 53
					
					|| odgovor == 55 || odgovor == 57 || odgovor == 59 || odgovor == 61
					
					|| odgovor == 62 || odgovor == 64 || odgovor == 66 || odgovor == 68
					
					|| odgovor == 71 || odgovor == 72 || odgovor == 74 || odgovor == 76
					
					|| odgovor == 79 || odgovor == 80 || odgovor == 82 || odgovor == 84
					
					|| odgovor == 87 || odgovor == 88 || odgovor == 91 || odgovor == 93
					
					|| odgovor == 94 || odgovor == 96 || odgovor == 99 || odgovor == 101
					
					|| odgovor == 103 || odgovor == 104 || odgovor == 106 || odgovor == 108
					
					|| odgovor == 110 || odgovor == 112 || odgovor == 114 || odgovor == 117
					
					|| odgovor == 118 || odgovor == 121 || odgovor == 122 || odgovor == 125
					
					|| odgovor == 126 || odgovor == 129 || odgovor == 131 || odgovor == 133
					
					|| odgovor == 134 || odgovor == 137 || odgovor == 137 || odgovor == 138
					
					|| odgovor == 141 || odgovor == 142 || odgovor == 145 || odgovor == 146
					
					|| odgovor == 149 || odgovor == 151 || odgovor == 152 || odgovor == 154
					
					|| odgovor == 157 || odgovor == 158 || odgovor == 160 || odgovor == 162
					
					|| odgovor == 164 || odgovor == 166 || odgovor == 169 || odgovor == 171
					
					|| odgovor == 172 || odgovor == 174 || odgovor == 177 || odgovor == 179
					
					|| odgovor == 179 || odgovor == 180 || odgovor == 183 || odgovor == 185
					
					|| odgovor == 186 || odgovor == 188 || odgovor == 190 || odgovor == 192
					
					|| odgovor == 194 || odgovor == 197 || odgovor == 198 || odgovor == 200
					
					|| odgovor == 202 || odgovor == 205 || odgovor == 206 || odgovor == 208
					
					|| odgovor == 211) {
				brojacTacnih++;
			}
			if(brojacPitanja == 10 ) {
				System.out.println("Imali ste " + brojacTacnih + " tacnih odgovora.");
				ocjena(brojacTacnih);
			}
			
		}

		input.close();
		
	}

}
