package Sistema;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;

import Ventanas.Login;
import Ventanas.Menu;
import Ventanas.VentanaResumen;

public class SistemaMenu {
	
	//Ventanas.VentanaResumen resumen = new Ventanas.VentanaResumen();
	public int tiempoSabado=480;
	public int tiempoDomingo=360;
	
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
	
		public String[] mostrarPeliculasSabado(String genero) {
		 
		    //Creamos un array con las peliculas que vamos a mostrar
		    final String resultadoCombo[];
		    resultadoCombo = new String[5];
		    
		    if(genero.toUpperCase().equals("DRAMA")){
			    //PELICULAS DRAMA
		    	for(int i=0;i<tiempoPeliculasDrama.length;i++) {
			    	
			    	//Miramos que esa pelicula pueda entrar dentro del dia
			    	if(tiempoSabado>= tiempoPeliculasDrama[i]) {
			    		
			    		//añadimos esa pelicula a el array
			    		resultadoCombo[i]=peliculasDrama[i];
			    	
				    }
		    	
			    }    	
		    	return  resultadoCombo;
		   
		    //PELICULAS SCI-FI
		    }else if(genero.toUpperCase().equals("SCIFI")) {
		    	
		    	for(int i=0;i<tiempoPeliculasScifi.length;i++) {
			    	
			    	if(tiempoSabado>= tiempoPeliculasScifi[i]) {
			    		    		
			    		resultadoCombo[i]=peliculasScifi[i];
			    	
				    }
		    	
		    	}
		    	return  resultadoCombo;
		   
		    //PELICULAS COMEDIA
		    }else if(genero.toUpperCase().equals("COMEDIA")) {
		    	
		    	for(int i=0;i<tiempoPeliculasComedia.length;i++) {
			    	
			    	if(tiempoSabado>= tiempoPeliculasComedia[i]) {
			    		    		
			    		resultadoCombo[i]=peliculasComedia[i];
			    	
				    }
		    	
		    	}
		    	return  resultadoCombo;
		    //PELICULAS TERROR
		    }else if(genero.toUpperCase().equals("TERROR")) {
		    	
		    	for(int i=0;i<tiempoPeliculasTerror.length;i++) {
			    	
			    	if(tiempoSabado>= tiempoPeliculasTerror[i]) {
			    		    		
			    		resultadoCombo[i]=peliculasTerror[i];
			    	
				    }
		    	
		    	}
		    	return  resultadoCombo;
		    
		    }
		    
		    //En caso de que no encuentre nada, no se añadirá nada al array asique estará vacio
		    return resultadoCombo; 
		}
		
		public String[] mostrarPeliculasDomingo(String genero) {
			 
		    //Lo mismo para el domingo
		    String resultadoCombo[];
		    resultadoCombo = new String[5];
		    
		    if(genero.toUpperCase().equals("DRAMA")){
			    //PELICULAS DRAMA
		    	for(int i=0;i<tiempoPeliculasDrama.length;i++) {
			    	
			    	//Miramos que esa pelicula pueda entrar dentro del dia
			    	if(tiempoDomingo>= tiempoPeliculasDrama[i]) {
			    		
			    		//añadimos esa pelicula a el array
			    		resultadoCombo[i]=peliculasDrama[i];
			    	
				    }
		    	
			    }    	
		    	return  resultadoCombo;
		   
		    //PELICULAS SCI-FI
		    }else if(genero.toUpperCase().equals("SCIFI")) {
		    	
		    	for(int i=0;i<tiempoPeliculasScifi.length;i++) {
			    	
			    	if(tiempoDomingo>= tiempoPeliculasScifi[i]) {
			    		    		
			    		resultadoCombo[i]=peliculasScifi[i];
			    	
				    }
		    	
		    	}
		    	return  resultadoCombo;
		   
		    //PELICULAS COMEDIA
		    }else if(genero.toUpperCase().equals("COMEDIA")) {
		    	
		    	for(int i=0;i<tiempoPeliculasComedia.length;i++) {
			    	
			    	if(tiempoDomingo>= tiempoPeliculasComedia[i]) {
			    		    		
			    		resultadoCombo[i]=peliculasComedia[i];
			    	
				    }
		    	
		    	}
		    	return  resultadoCombo;
		    //PELICULAS TERROR
		    }else if(genero.toUpperCase().equals("TERROR")) {
		    	
		    	for(int i=0;i<tiempoPeliculasTerror.length;i++) {
			    	
			    	if(tiempoDomingo>= tiempoPeliculasTerror[i]) {
			    		    		
			    		resultadoCombo[i]=peliculasTerror[i];
			    	
				    }
		    	
		    	}
		    	return  resultadoCombo;
		    
		    }
		    
		    //En caso de que no encuentre nada, no se añadirá nada al array asique estará vacio
		    return resultadoCombo; 
		}
		
		
		
		public String calcularTiempoSabado() {
			
			String total;
			int horas;
			int minutos;
			
			horas=tiempoSabado/60;
			minutos=tiempoSabado%60;
			
			//Hacemos los calculos para calcularlo desde los minutos y lo mostramos como nos convenga
			if(minutos==0) {
				total=""+horas+" horas";
				
			}else {
				
				total=""+horas+" horas y "+minutos+"min";
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
	 
		public void dramaSabadoCambiado(int indexSeleccionado) {
			Ventanas.Menu ventanaMenu= new Ventanas.Menu();
			
			
			int tiempoSeleccionado=tiempoPeliculasDrama[indexSeleccionado];
        	tiempoSabado=tiempoSabado-tiempoSeleccionado;
        	
        	ventanaMenu.labelSabado.setText("S\u00E1bado: "+calcularTiempoSabado());
        	
        	        	
        	tiempoSabado=tiempoSabado+tiempoSeleccionado;
        	
		}
		

}
