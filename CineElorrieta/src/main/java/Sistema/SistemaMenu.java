package Sistema;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Ventanas.Login;
import Ventanas.Menu;
import Ventanas.Resumen;

public class SistemaMenu {
	
	public static int tiempoSabado=480;
	public static int tiempoDomingo=360;
	public int tiempoEscogidoSabado=0;
	public int tiempoEscogidoDomingo=0;
	public static int tiempoFinalSabado=0;
	public static int tiempoFinalDomingo=0;
	public static boolean peliDramaSabBloqueado,peliComeSabBloqueado, peliCienciaSabBloqueado, peliTerrorSabBloqueado=false;	
	public static boolean peliDramaDominBloqueado,peliComeDominBloqueado, peliCienciaDominBloqueado, peliTerrorDominBloqueado=false;	
	//lista de peliculas con su tiempo por genero
	public static String peliculasDrama[]= {"","Handia: 1 h 56 min", "La lista de Schindler: 3 h 17 min", "Cadena Perpetua: 2 h 22 min", "Million Dollar Baby: 2 h 13 min"};
	public int tiempoPeliculasDrama[]= {0,116,197,144,133};
   
    String peliculasScifi[]= {"","2001:Odisea en el espacio: 2 h 22 min","La novia de Frankestein: 1 h 15 min",
    						  "El planeta de los simios: 1 h 55 min","Alien, el octavo pasajero: 1 h 57 min"};
    int tiempoPeliculasScifi[]= {0,142,75,115,117};
    
    String peliculasComedia[]= {"","Scary Movie: 1 h 30 min","El gran Lebowsky: 1 h 59 min","La vida de Brian: 1 h 34 min","Aterriza como puedas:  1 h 28 min"};
    int tiempoPeliculasComedia[]= {0,90,119,94,88};
    
    String peliculasTerror[]= {"","Psicosis: 1 h 49 min","El resplandor: 2 h 26 min","Dracula: 2 h 35 min","Cisne negro: 1 h 50 min"};
    int tiempoPeliculasTerror[]= {0,109,146,155,110};
	
	public String[] mostrarPeliculas(String genero,String dia) {
		 
		    //Creamos un ArrayList con las peliculas que vamos a mostrar
			ArrayList<String> peliculasPorGenero = new ArrayList<String>();
			String[] resultadoCombo= {};

		    
		    if(genero.equalsIgnoreCase("drama")){
			    //PELICULAS DRAMA
		    	for(int i=0;i<tiempoPeliculasDrama.length;i++) {
			    	
			    	//Miramos que esa pelicula pueda entrar dentro del dia
		    		//SABADO 
		    		if(dia.equalsIgnoreCase("sabado")) {
				    	
		    			if(tiempoSabado>= tiempoPeliculasDrama[i]) {
				    		//añadimos esa pelicula a el array
				    		peliculasPorGenero.add(peliculasDrama[i]);  	
					    }
		    		//DOMINGO	
		    		}else if(dia.equalsIgnoreCase("domingo")) {
		    			if(tiempoDomingo>= tiempoPeliculasDrama[i]) {
				    		//añadimos esa pelicula a el array
				    		peliculasPorGenero.add(peliculasDrama[i]);  	
					    }
		    			
		    		}
		    	
			    }  
		    	 		
		    	//Eliminamos si hay espacios en blanco
		    	for(int i=0;i<peliculasPorGenero.size();i++) {
		    		      
		    		    if(peliculasPorGenero.get(i).equals("") && i!=0){
		    		    	peliculasPorGenero.remove(i);
		    		    }
		    	}
		    	
		    	//Creamos el array donde vamos a mostrar en el comboBox
		    	resultadoCombo = new String[peliculasPorGenero.size()];
		    	
		    	//Y le añadimos los elementos
		    	for(int i=0;i<peliculasPorGenero.size();i++) {
		    		resultadoCombo[i]=peliculasPorGenero.get(i);
		    	}
		    	
		    	return resultadoCombo;
		    	
		    	
		    }else if(genero.equalsIgnoreCase("comedia")){
		    	
		    	 //PELICULAS COMEDIA
		    	for(int i=0;i<tiempoPeliculasComedia.length;i++) {
			    
		    		//SABADO
		    		if(dia.equalsIgnoreCase("sabado")) {
				    	
		    			if(tiempoSabado>= tiempoPeliculasComedia[i]) {
				    		//añadimos esa pelicula a el array
				    		peliculasPorGenero.add(peliculasComedia[i]);  	
					    }
		    		//DOMINGO	
		    		}else if(dia.equalsIgnoreCase("domingo")) {
		    			if(tiempoDomingo>= tiempoPeliculasComedia[i]) {
				    		//añadimos esa pelicula a el array
				    		peliculasPorGenero.add(peliculasComedia[i]);  	
					    }
		    			
		    		}
		    	
			    }  
		    	 		
		    	for(int i=0;i<peliculasPorGenero.size();i++) {      
		    		    if(peliculasPorGenero.get(i).equals("") && i!=0){
		    		    	peliculasPorGenero.remove(i);
		    		    }
		    	}
		    	 	
		    	resultadoCombo = new String[peliculasPorGenero.size()];
		    	
		    	for(int i=0;i<peliculasPorGenero.size();i++) {
		    		resultadoCombo[i]=peliculasPorGenero.get(i);
		    	}
		    	
		    	return resultadoCombo;
		    	  
			}else if(genero.equalsIgnoreCase("terror")){
		    	
		    	 //PELICULAS TERROR
		    	for(int i=0;i<tiempoPeliculasTerror.length;i++) {
			    
		    		//SABADO
		    		if(dia.equalsIgnoreCase("sabado")) {
				    	
		    			if(tiempoSabado>= tiempoPeliculasTerror[i]) {
				    		//añadimos esa pelicula a el array
				    		peliculasPorGenero.add(peliculasTerror[i]);  	
					    }
		    		//DOMINGO	
		    		}else if(dia.equalsIgnoreCase("domingo")) {
		    			if(tiempoDomingo>= tiempoPeliculasTerror[i]) {
				    		//añadimos esa pelicula a el array
				    		peliculasPorGenero.add(peliculasTerror[i]);  	
					    }
		    			
		    		}
		    	
			    }  
		    	 		
		    	
		    	for(int i=0;i<peliculasPorGenero.size();i++) {
		    		      
		    		    if(peliculasPorGenero.get(i).equals("") && i!=0){
		    		    	peliculasPorGenero.remove(i);
		    		    }
		    	}
		    	
		    	
		    	resultadoCombo = new String[peliculasPorGenero.size()];
		    	
		    	
		    	for(int i=0;i<peliculasPorGenero.size();i++) {
		    		resultadoCombo[i]=peliculasPorGenero.get(i);
		    	}
		    	
		    	return resultadoCombo;
		    
		    
		    
			}else if(genero.equalsIgnoreCase("scifi")){
		    	
		    	 //PELICULAS SCIFI
		    	for(int i=0;i<tiempoPeliculasScifi.length;i++) {
			   
		    		//SABADO
		    		if(dia.equalsIgnoreCase("sabado")) {
				    	
		    			if(tiempoSabado>= tiempoPeliculasScifi[i]) {
				    		//añadimos esa pelicula a el array
				    		peliculasPorGenero.add(peliculasScifi[i]);  	
					    }
		    		//DOMINGO	
		    		}else if(dia.equalsIgnoreCase("domingo")) {
		    			if(tiempoDomingo>= tiempoPeliculasScifi[i]) {
				    		//añadimos esa pelicula a el array
				    		peliculasPorGenero.add(peliculasScifi[i]);  	
					    }
		    			
		    		}
		    	
			    }  
		    	 			
		    	for(int i=0;i<peliculasPorGenero.size();i++) {
		    		      
		    		    if(peliculasPorGenero.get(i).equals("") && i!=0){
		    		    	peliculasPorGenero.remove(i);
		    		    }
		    	}
		    	
		    	resultadoCombo = new String[peliculasPorGenero.size()];
		    		
		    	for(int i=0;i<peliculasPorGenero.size();i++) {
		    		resultadoCombo[i]=peliculasPorGenero.get(i);
		    	}
		    	
		    	return resultadoCombo;
		    		
			}else {

		    //En caso de que no encuentre nada, no se añadirá nada al array asique estará vacio
		    return resultadoCombo; 
		    }
		}
		
	
		
		
		public String calcularTiempoSabado() {
			
			String total;
			int horas;
			int minutos;
			
			horas=tiempoSabado/60;
			minutos=tiempoSabado%60;
			
			//Hacemos los calculos para calcularlo desde los minutos y lo mostramos como nos convenga
			if(minutos==0) {
				total=""+horas+" h";
				
			}else {
				
				total=""+horas+" h y "+minutos+"m";
			}
			
			return total;
		}
		
		public String calcularTiempoDomingo() {
			
			String total;
			int horas;
			int minutos;
			
			horas=tiempoDomingo/60;
			minutos=tiempoDomingo%60;
			
			if(minutos==0) {
				total=""+horas+" h";
				
			}else {
				
				total=""+horas+" h y "+minutos+"m";
			}
			
			return total;
		}
		
		public void tiempoPeliculas() {
			Menu ventanaMenu = new Menu();
			tiempoEscogidoSabado=0;
			tiempoEscogidoDomingo=0;
			
			//DRAMA SABADO
			for(int i=0;i<peliculasDrama.length;i++) {
				if(ventanaMenu.pelidramaSabFinal==peliculasDrama[i]){
					tiempoEscogidoSabado=tiempoEscogidoSabado+tiempoPeliculasDrama[i];
				}
			}
			
			//COMEDIA SABADO
			for(int i=0;i<peliculasComedia.length;i++) {
				if(ventanaMenu.peliComeSabFinal==peliculasComedia[i]){
					tiempoEscogidoSabado=tiempoEscogidoSabado+tiempoPeliculasComedia[i];
				}
			}
			
			//SCIFI SABADO
			for(int i=0;i<peliculasScifi.length;i++) {
				if(ventanaMenu.peliCienciaSabFinal==peliculasScifi[i]){
					tiempoEscogidoSabado=tiempoEscogidoSabado+tiempoPeliculasScifi[i];
				}
			}
			
			//TERROR SABADO
			for(int i=0;i<peliculasTerror.length;i++) {
				if(ventanaMenu.peliTerrorSabFinal==peliculasTerror[i]){
					tiempoEscogidoSabado=tiempoEscogidoSabado+tiempoPeliculasTerror[i];
				}
			}
			
			//DRAMA DOMINGO
			for(int i=0;i<peliculasDrama.length;i++) {
				if(ventanaMenu.pelidramaDominFinal==peliculasDrama[i]){
					tiempoEscogidoDomingo=tiempoEscogidoDomingo+tiempoPeliculasDrama[i];
				}
			}
			
			//COMEDIA DOMINGO
			for(int i=0;i<peliculasComedia.length;i++) {
				if(ventanaMenu.peliComeDominFinal==peliculasComedia[i]){
					tiempoEscogidoDomingo=tiempoEscogidoDomingo+tiempoPeliculasComedia[i];
				}
			}
			
			//SCIFI DOMINGO
			for(int i=0;i<peliculasScifi.length;i++) {
				if(ventanaMenu.peliCienciaDominFinal==peliculasScifi[i]){
					tiempoEscogidoDomingo=tiempoEscogidoDomingo+tiempoPeliculasScifi[i];
				}
			}
			
			//TERROR DOMINGO
			for(int i=0;i<peliculasTerror.length;i++) {
				if(ventanaMenu.peliTerrorDominFinal==peliculasTerror[i]){
					tiempoEscogidoDomingo=tiempoEscogidoDomingo+tiempoPeliculasTerror[i];
				}
			}
				
			
					
		}
		
		public void continuarResumen() {
					
			if(tiempoEscogidoSabado>tiempoSabado || tiempoEscogidoDomingo>tiempoDomingo) {
				//No continuamos
				JOptionPane.showMessageDialog(null, "HAS SUPERADO EL TIEMPO DISPONIBLE");
				
			}else {
				//Continuamos
					tiempoSabado=tiempoSabado-tiempoEscogidoSabado;
					tiempoDomingo=tiempoDomingo-tiempoEscogidoDomingo;
					tiempoFinalSabado=tiempoFinalSabado+tiempoEscogidoSabado;
					tiempoFinalDomingo=tiempoFinalDomingo+tiempoEscogidoDomingo;
					Resumen resumen =new Resumen();
				 	resumen.setBounds(0,0,1024,768);
				 	resumen.setLocationRelativeTo(null);
				 	resumen.setVisible(true);
				 	resumen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
			System.out.println(tiempoFinalSabado);
			System.out.println(tiempoFinalDomingo);
		}
		
		public boolean domingoBloqueado() {
			boolean bloqueado=true;
			int cont=0;
			
			//DRAMA 
			int contadorDrama=0;
			for(int i=0;i<peliculasDrama.length;i++) {
				
				if(tiempoPeliculasDrama[i]>tiempoSabado) {
					contadorDrama++;
				}
				
				if(contadorDrama>3) {
					cont++;
				}
			}
			
			//COMEDIA 
			int contadorComedia=0;
			for(int i=0;i<peliculasComedia.length;i++) {
				
				if(tiempoPeliculasComedia[i]>tiempoSabado) {
					contadorComedia++;
				}
				
				if(contadorComedia>3) {
					cont++;
				}
			}
			
			//SCIFI 
			int contadorCiencia=0;
			for(int i=0;i<peliculasScifi.length;i++) {
				if(tiempoPeliculasScifi[i]>tiempoSabado) {
					contadorCiencia++;
				}
				
				if(contadorCiencia>3) {
					cont++;
				}
			}
			
			//TERROR 
			int contadorTerror=0;
			for(int i=0;i<peliculasTerror.length;i++) {
				if(tiempoPeliculasTerror[i]>tiempoSabado) {
					contadorTerror++;
				}
				
				if(contadorTerror>3) {
					cont++;
				}
			}
			
			if(cont>3) {
				bloqueado=false;
			}
			
			return bloqueado;
		}
		
	
		public boolean domingoCompleto() {
			boolean completo=false;
			int cont=0;
			
			//DRAMA 
			int contadorDrama=0;
			for(int i=0;i<peliculasDrama.length;i++) {
				if(tiempoPeliculasDrama[i]>tiempoDomingo) {
					contadorDrama++;
				}
				
				if(contadorDrama>3) {
					cont++;
				}	
			}
			
			//COMEDIA 
			int contadorComedia=0;
			for(int i=0;i<peliculasComedia.length;i++) {
				if(tiempoPeliculasComedia[i]>tiempoDomingo) {
					contadorComedia++;
				}
				
				if(contadorComedia>3) {
					cont++;
				}
			}
			
			//SCIFI 
			int contadorCiencia=0;
			for(int i=0;i<peliculasScifi.length;i++) {
				if(tiempoPeliculasScifi[i]>tiempoDomingo) {
					contadorCiencia++;
				}
				
				if(contadorCiencia>3) {
					cont++;
				}
			}
			
			//TERROR 
			int contadorTerror=0;
			for(int i=0;i<peliculasTerror.length;i++) {
				if(tiempoPeliculasTerror[i]>tiempoDomingo) {
					contadorTerror++;
				}
				
				if(contadorTerror>3) {
					cont++;
				}
			}
			
			if(cont>3) {
				completo=true;
			}
			
			
			return completo;
		}
		
		public void bloquearGenero() {
			Menu ventanaMenu = new Menu();
			
			//SABADO
			if(ventanaMenu.pelidramaSabFinal!="") {
				peliDramaSabBloqueado=true;
			}
			
			if(ventanaMenu.peliComeSabFinal!="") {
				peliComeSabBloqueado=true;
			}
			
			if(ventanaMenu.peliCienciaSabFinal!="") {
				peliCienciaSabBloqueado=true;
			}
			
			if(ventanaMenu.peliTerrorSabFinal!="") {
				peliTerrorSabBloqueado=true;
			}
			
			//DOMINGO
			if(ventanaMenu.pelidramaDominFinal!="") {
				peliDramaDominBloqueado=true;
			}
			
			if(ventanaMenu.peliComeDominFinal!="") {
				peliComeDominBloqueado=true;
			}
			
			if(ventanaMenu.peliCienciaDominFinal!="") {
				peliCienciaDominBloqueado=true;
			}
			
			if(ventanaMenu.peliTerrorDominFinal!="") {
				peliTerrorDominBloqueado=true;
			}
		}
		
		public String calcularTiempoFinalSabado() {
			
			String total;
			int horas;
			int minutos;
			
			horas=tiempoFinalSabado/60;
			minutos=tiempoFinalSabado%60;
			
			if(minutos==0) {
				total=""+horas+" h";
				
			}else {
				
				total=""+horas+" h y "+minutos+"m";
			}
			
			return total;
		}
		
		public String calcularTiempoFinalDomingo() {
			
			String total;
			int horas;
			int minutos;
			
			horas=tiempoFinalDomingo/60;
			minutos=tiempoFinalDomingo%60;
			
			if(minutos==0) {
				total=""+horas+" h";
				
			}else {
				
				total=""+horas+" h y "+minutos+"m";
			}
			
			return total;
		}
		
		
		
}
