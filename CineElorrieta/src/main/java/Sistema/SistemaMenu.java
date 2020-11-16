package Sistema;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import Ventanas.Login;
import Ventanas.Menu;

public class SistemaMenu {
	
	
	public int tiempoSabado=400;
	public int tiempoDomingo=124;
	
	//lista de peliculas con su tiempo por genero
	public String peliculasDrama[]= {"","Handia: 1 h 56 min", "La lista de Schindler: 3 h 17 min", "Cadena Perpetua: 2 h 22 min", "Million Dollar Baby: 2 h 13 min"};
	public int tiempoPeliculasDrama[]= {0,116,197,143,133};
   
    String peliculasScifi[]= {"","2001:Odisea en el espacio: 2 h 22 min","La novia de Frankestein: 1 h 15 min",
    						  "El planeta de los simios: 1 h 55 min","Alien, el octavo pasajero: 1 h 57 min"};
    int tiempoPeliculasScifi[]= {0,142,75,115,117};
    
    String peliculasComedia[]= {"","Scary Movie: 1 h 30 min","El gran Lebowsky: 1 h 59 min","La vida de Brian: 1 h 34 min","Aterriza como puedas:  1 h 28 min"};
    int tiempoPeliculasComedia[]= {0,90,199,94,88};
    
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
				total=""+horas+"h";
				
			}else {
				
				total=""+horas+"h y "+minutos+"m";
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
				total=""+horas+"h";
				
			}else {
				
				total=""+horas+"h y "+minutos+"m";
			}
			
			return total;
		}
	 
		public String generoCambio(int indexSeleccionado,String genero) {
			String resultado="";
			
			if(genero.toUpperCase().equals("DRAMA")) {
				
				int tiempoSeleccionado=tiempoPeliculasDrama[indexSeleccionado];	
				
				
				if(tiempoSabado-tiempoSeleccionado>0){
				tiempoSabado=tiempoSabado-tiempoSeleccionado;
				resultado="S\u00E1bado: "+calcularTiempoSabado();  	
	        	
	        	return resultado;
	        	
				}else {
					resultado="S\u00E1bado: "+calcularTiempoSabado();
					return resultado;
				}
	        	
			}else if(genero.toUpperCase().equals("COMEDIA")){
				
				int tiempoSeleccionado=tiempoPeliculasComedia[indexSeleccionado];	
				
	
				if(tiempoSabado-tiempoSeleccionado>0){
					tiempoSabado=tiempoSabado-tiempoSeleccionado;
					resultado="S\u00E1bado: "+calcularTiempoSabado();  	
		        	
		        	return resultado;
		        	
					}else {
						resultado="S\u00E1bado: "+calcularTiempoSabado();
						return resultado;
					}
	        	
			}else if(genero.toUpperCase().equals("TERROR")){
				
				int tiempoSeleccionado=tiempoPeliculasTerror[indexSeleccionado];	
				
				if(tiempoSabado-tiempoSeleccionado>0){
					tiempoSabado=tiempoSabado-tiempoSeleccionado;
					resultado="S\u00E1bado: "+calcularTiempoSabado();  	
		        	
		        	return resultado;
		        	
					}else {
						resultado="S\u00E1bado: "+calcularTiempoSabado();
						return resultado;
					}
				
			}else if(genero.toUpperCase().equals("SCIFI")){
				
				int tiempoSeleccionado=tiempoPeliculasScifi[indexSeleccionado];	
				
				if(tiempoSabado-tiempoSeleccionado>0){
					tiempoSabado=tiempoSabado-tiempoSeleccionado;
					resultado="S\u00E1bado: "+calcularTiempoSabado();  	
		        	
		        	return resultado;
		        	
					}else {
						resultado="S\u00E1bado: "+calcularTiempoSabado();
						return resultado;
					}
				
			}else {
				return resultado;
			}
	
        	
		}
		
}
