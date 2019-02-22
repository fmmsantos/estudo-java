package DataNumeroMoeda;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Data {
	// a classe DateFormat retorna uma String

	public static void main(String[] args) {
		// CLASSE DATA NAO instancia;
		String d= "06/01/2019";
		// classe Date (depressiada)
		Date data = new Date();
	//	System.out.println(data.clone());
		
		// Classe Calendar = nao instancia a classe Calendar
		Calendar calendar = Calendar.getInstance(); 
		
	//	System.out.println(calendar.toInstant());
		//System.out.println(calendar);//
		int dia = calendar.get(Calendar.DAY_OF_MONTH);
		int mes = calendar.get(Calendar.MONTH);
		int ano = calendar.get(Calendar.YEAR);
		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		int min = calendar.get(Calendar.MINUTE);
		//System.out.printf("Hje é:  %02d/%02d/%d:%d:%d:00",dia,(mes+1),ano,hora,min);
		
		// Classe DateFormat
		
		Date da = new Date();
	//	System.out.println(da);
	//	Locale.setDefault(new Locale("pt", "Brazil"));
	//	Locale.setDefault(new Locale("en", "US"));
		String dataFormatado = DateFormat.getInstance().format(da);// Data e hora
	//	System.out.println(dataFormatado);
		
		dataFormatado = DateFormat.getDateInstance().format(da);
	//	System.out.println(dataFormatado);
		dataFormatado = DateFormat.getTimeInstance().format(da);
	//	System.out.println("hora: " + dataFormatado);
		dataFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG).format(da);
	//	System.out.println(dataFormatado);
	
		Locale italia = new Locale("it","IT");
		String localizacao = DateFormat.getDateInstance().format(da);
	//	System.out.println("italia: " + localizacao);
		
		Locale portugal = new Locale("pt");
		localizacao = DateFormat.getDateInstance().format(da);
	//	System.out.println("portugal: " + localizacao);
	
		Locale brasil = new Locale("it","BR");
		localizacao = DateFormat.getDateInstance().format(da);
	///	System.out.println("Brasil: " + localizacao);
		
	//	Locale india = new Localebr
		localizacao = DateFormat.getDateInstance().format(da);
	//	System.out.println("India: " + localizacao);
	
		Locale japao = new Locale("ja");
		
		//System.out.println("Japão: " + localizacao);
	
		
		Calendar f = Calendar.getInstance();
		f.set(2019, 01, 07);
		Date g = f.getTime();
		Locale loBr = new Locale("pt","BR");
		Locale loDk = new Locale("da","DK");
		Locale loIt = new Locale("it","IT");
	//   System.out.println(loBr.getDisplayCountry());
	//   System.out.println(loDk.getDisplayCountry());
	 //  System.out.println(loIt.getDisplayCountry());
	   
	 //  System.out.println(loDk.getDisplayLanguage());
	//   System.out.println(loBr.getDisplayLanguage());
	//   System.out.println(loIt.getDisplayLanguage());
	   
	   NumberFormat formato = NumberFormat.getInstance();
	   
	   DateFormat df = DateFormat.getDateInstance (DateFormat.LONG, Locale.FRANCE);
	   System.out.println(df);
	   
	   Locale local = Locale.getDefault();
	   System.out.println(local);
	   
	   Locale[] loc = Locale.getAvailableLocales();// metodo p arrays p/ saber locale de cada pais
	//   for(int i=0;i<loc.length;i++) {
		//   System.out.println(loc[i]);
		   for(Locale l : loc) {
		//	   System.out.println("local: "+l.getDisplayName() + " lingua: "+ l.getLanguage()+" "+l.getCountry() +" Lingua: "+ l.getDisplayLanguage() );// nome dos paises
		//	System.out.println("------------------------------------------");
		   
		   
	   }
		   Locale loc1 = Locale.getDefault();
		 float valor = 12.43F;
		   NumberFormat numero = NumberFormat.getCurrencyInstance(loBr);
		System.out.println( numero.format(valor));
		 
		  NumberFormat n= NumberFormat.getNumberInstance(loc1);
		  
		System.out.println(n.format(valor));
	}

}
