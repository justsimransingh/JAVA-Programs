import java.util.Scanner;
import java.util.Random;
class bollywooddialouge
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		String a[]=new String[25];
		a[0]="Don ko pakadna mushkil hi nahin...namumkin hai";
		a[1]="Kitne aadmi the?";
		a[2]="Bade bade deshon mein aaisi choti choti baatein....hoti rehti hai";
		a[3]="Tarikh par tarikh, tarikh par tarikh, tarikh par tarikh, tarikh par tarikh milti rahi hai...lekin insaaf nahi mila my lord...mili hai toh sirf yeh tarikh";
		a[4]="Sara shehar mujhe lion ke naam se jaanta hai";
		a[5]="Mogambo khush hua";
		a[6]="Joh main bolta hoon woh main karta hoon...joh main nahi bolta woh main definitely karta hoon";
		a[7]="Kuttey kaminey, tu mujhse bachkar nahi ja sakta. Main tera khoon pee jaoonga";
		a[8]="Ek bar joh maiKabhi kabhi kuch jeetne ke liye kuch harna bhi padta hai, aur haar kar jeetnay wale ko baazigar kehte hain";
		a[11]="Picture abhi baaki hain mere dost";
		a[12]="Pushpa, I hate tears...inhe ponch dalo";
		a[13]="Jali ko aag kehte hain, bhuji ko raakh kehte hain....jis raakh se barood bane, usse Vishwanath kehte hain";
		a[14]="Babu Moshai Zindagi badi honi chahiye lambi nahi";
		a[15]="Aaj mere paas gaadi hai, bungla hai, paisa hai...tumhare paas kya hai?";
		a[16]="Gold toh gold hota hai.....chhora lave ya chhori";
		a[17]="Saari shikayatein ek saath likhva dijiye ... mooch, shirt, tie, pant, underwear, banyan, kuch mat chhodiye ... dhajjiyan udha dijiye...lekin pyar nahi karta, yeh mat likhvaiye";
		a[18]="Ek chutki sindoor ki keemat tum kya jaano Ramesh Babu";
		a[19]="Thappad se darr nahi lagta sahab … pyar se lagta hai";
		a[20]="Koi dhanda chota nahi hota aur dhande se bada koi dharm nahi hota";
		a[21]="My name is Khan and I am not a terrorist";
		a[22]="Kahin par pahunchne ke liye kahin se nikalna zaroori hai";
		a[23]="Aadmi tabhi bada banta hai jab bade log usse milne ka intezaar kare";
		a[24]="Rahul, Naam toh suna hoga";
		Random ran=new Random();
		int zap=ran.nextInt(25);
		System.out.println("Bollywood Dialouge which suits you is--");
		System.out.println(a[zap]);
		
		
	}
}