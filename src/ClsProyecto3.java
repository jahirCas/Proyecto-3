import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ClsProyecto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 //Declaracion de variables
		int opcion=0,i2=0,i=1;
		//Variables del menu
		long n=0;
		long r=0;
		long fact=1;
		long cr, cr2,cr3,factorialpermutacionR;
		
		//Creacion de llamados
		 UIManager UI=new UIManager();
		 ImageIcon csr = new ImageIcon("src/img/csr.png");
		 ImageIcon ccr = new ImageIcon("src/img/ccr.png");
		 ImageIcon vsr = new ImageIcon("src/img/vsr.png");
		 ImageIcon vcr = new ImageIcon("src/img/vcr.png");
		 ImageIcon pcr = new ImageIcon("src/img/pcr.png");
		 ImageIcon psr = new ImageIcon("src/img/psr.png");
		//Construccion del menu
				do {
			UI.put("OptionPane.background",new Color (152, 203, 220 ));UI.put("Panel.background", new Color(106, 194, 222));
			opcion = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "--------------------Menu Pricipal-----------------------\n"
					+ "1.Combinacion sin repeticion\n"
					+ "2.Combinacion con repeticion\n"
					+ "3.Variacion sin repeticion\n"
					+ "4.Variacion con repeticion\n"
					+ "5.Permutacion sin repeticion\n"
					+ "6.Permutacion con repeticion\n"
					+ "7.Salir\n"
					+ "Selecciona una opcion\n"));
			switch(opcion) {
			case 1:
				//caso 1 combinacion sin repeticion
				//Creaccion de la pregunta de ingreso
				 int question = JOptionPane.showConfirmDialog(null,"En la opcion seleccionada:\n1.No importa el orden\n2.Es irrelevante si se usan todas las combinaciones\n3.No se pueden repetir la combinaciones\n\nDeseas continuar?","Alerta!",JOptionPane.YES_NO_OPTION);
				 if(question == JOptionPane.YES_OPTION){
					 	n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu 'N' que corresponde al valor total de combinaciones"));
						r = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu 'R' que corresponde al numero de repeticiones"));
						long factorialN=MtdCalc_Factorial(n);
						long factorialR=MtdCalc_Factorial(r);
						long factorialResta=MtdCalc_Factorial(n-r);
						long resulcsr=factorialN/(factorialR*factorialResta);
						JOptionPane.showMessageDialog(null, "El resultado es: "+resulcsr,"Respuesta",2,csr);
						//creacion de la salida o el retorno
						int salida = JOptionPane.showConfirmDialog(null,"Deseas volver al menu principal y realizar otro calculo","Alerta!",JOptionPane.YES_NO_OPTION);
						 if(salida == JOptionPane.YES_OPTION){
							 continue;	 
						 }
					        else {
					        	 System.exit(0);   	
					        }
						//continue; 
			        }
			        else {
			            continue;
			        }
			case 2:
				//caso 2 combinacion con repeticion
				//Creaccion de la pregunta de ingreso
				int question1 = JOptionPane.showConfirmDialog(null,"En la opcion seleccionada:\n1.No importa el orden\n2.Es irrelevante si se usan todas las combinaciones\n3.Se pueden repetir la combinaciones\n\nDeseas continuar?","Alerta!",JOptionPane.YES_NO_OPTION);
				if(question1 == JOptionPane.YES_OPTION){
				n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu 'N' que corresponde al valor total de combinaciones"));
				r = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu 'R' que corresponde al numero de repeticiones"));
				cr=MtdCalc_Factorial(n+r-1);
				cr2=MtdCalc_Factorial(r);
				cr3=MtdCalc_Factorial(n-1);
				long result = cr/(cr2*cr3);
				JOptionPane.showMessageDialog(null, "El resultado es: "+result,"Respuesta",2, ccr);
				//creacion de la salida o el retorno
				int salida = JOptionPane.showConfirmDialog(null,"Deseas volver al menu principal y realizar otro calculo","Alerta!",JOptionPane.YES_NO_OPTION);
				 if(salida == JOptionPane.YES_OPTION){
					 continue;	 
				 }
			        else {
			        	 System.exit(0);   	
			        }
				//continue;
				}
				else {
		            continue;
		        }
				//creacion de la salida o el retorno

			case 3:
				//caso 3 variacion sin repeticion
				//Creaccion de la pregunta de ingreso
				int question2 = JOptionPane.showConfirmDialog(null,"En la opcion seleccionada:\n1.Importa el orden\n2.No se usan todas las combinaciones\n3.No se pueden repetir la combinacionesn\n\nDeseas continuar?","Alerta!",JOptionPane.YES_NO_OPTION);
				if(question2 == JOptionPane.YES_OPTION){
				n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu 'N' que corresponde al valor total de combinaciones"));
				r = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu 'R' que corresponde al numero de repeticiones"));
				long vr=MtdCalc_Factorial(n);
				long vr2=MtdCalc_Factorial(n-r);
				long resultvr=vr/vr2;
				JOptionPane.showMessageDialog(null, "El resultado es: "+resultvr,"Respuesta",2,vsr);
				//creacion de la salida o el retorno
				int salida = JOptionPane.showConfirmDialog(null,"Deseas volver al menu principal y realizar otro calculo","Alerta!",JOptionPane.YES_NO_OPTION);
				 if(salida == JOptionPane.YES_OPTION){
					 continue;	 
				 }
			        else {
			        	 System.exit(0);   	
			        }
				//continue;
				}
				else {
		            continue;
		        }
				//creacion de la salida o el retorno
			case 4:
				//caso 4 variacion con repeticion
				//Creaccion de la pregunta de ingreso
				int question3 = JOptionPane.showConfirmDialog(null,"En la opcion seleccionada:\n1.Importa el orden\n2.No se usan todas las combinaciones\n3.Se pueden pueden repetir la combinaciones\n\nDeseas continuar?","Alerta!",JOptionPane.YES_NO_OPTION);
				if(question3 == JOptionPane.YES_OPTION){
				n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu 'N' que corresponde al valor total de combinaciones"));
				r = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu 'R' que corresponde al numero de repeticiones"));
				long resultvr2=(long) Math.pow(n, r);
				JOptionPane.showMessageDialog(null, "El resultado es: "+resultvr2,"Respuesta",2,vcr);
				//creacion de la salida o el retorno
				int salida = JOptionPane.showConfirmDialog(null,"Deseas volver al menu principal y realizar otro calculo","Alerta!",JOptionPane.YES_NO_OPTION);
				 if(salida == JOptionPane.YES_OPTION){
					 continue;	 
				 }
			        else {
			        	 System.exit(0);   	
			        }
				//continue;
				}
				else {
		            continue;
		        }
				//creacion de la salida o el retorno

			case 5:
				//caso 5 permutacion sin repeticion
				//Creaccion de la pregunta de ingreso
				int question4 = JOptionPane.showConfirmDialog(null,"En la opcion seleccionada:\n1.Importa el orden\n2.Se usan todas las combinaciones\n3.No se pueden repetir la combinaciones\n\nDeseas continuar?","Alerta!",JOptionPane.YES_NO_OPTION);
				if(question4 == JOptionPane.YES_OPTION){
				n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu 'N' que corresponde al valor total de combinaciones"));
				r = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu 'R' que corresponde al numero de repeticiones"));
				long pr=MtdCalc_Factorial(n);
				JOptionPane.showMessageDialog(null, "El resultado es: "+pr,"Respuesta",2,psr);
				//creacion de la salida o el retorno
				int salida = JOptionPane.showConfirmDialog(null,"Deseas volver al menu principal y realizar otro calculo","Alerta!",JOptionPane.YES_NO_OPTION);
				 if(salida == JOptionPane.YES_OPTION){
					 continue;	 
				 }
			        else {
			        	 System.exit(0);   	
			        }
				//continue;
				}
				else {
		            continue;
		        }
				//creacion de la salida o el retorno

			case 6:
				//caso 6 permutacion con repeticion
				//Creaccion de la pregunta de ingreso
				int question5 = JOptionPane.showConfirmDialog(null,"En la opcion seleccionada:\n1.Importa el orden\n2.Se usan todas las combinaciones\n3.Se pueden repetir la combinaciones\n\nDeseas continuar?","Alerta!", JOptionPane.YES_NO_OPTION);
				if(question5 == JOptionPane.YES_OPTION){
				n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu 'N' que corresponde al valor total de combinaciones"));
				r = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu 'R' o la cantidad de elementos los elementos"));
				do {
					int mult2= Integer.parseInt(JOptionPane.showInputDialog("Ingresa cuantas veces se repite el elemento "+i));
					factorialpermutacionR=MtdCalc_Factorial(mult2); 
					fact=factorialpermutacionR*fact;
					i++;
					i2++;
				}while(i2 < r);
				i=1;i2=0;
				long calculo2 = MtdCalc_Factorial(n);
				long calculofinal=calculo2/fact;
				JOptionPane.showMessageDialog(null, "El resultado es: "+calculofinal,"Respuesta",2,pcr);
				fact=1;
				//creacion de la salida o el retorno
				int salida = JOptionPane.showConfirmDialog(null,"Deseas volver al menu principal y realizar otro calculo","Alerta!",JOptionPane.YES_NO_OPTION);
				 if(salida == JOptionPane.YES_OPTION){
					 continue;	 
				 }
			        else {
			        	 System.exit(0);   	
			        }
				//continue;
				}
				else {
		            continue;
		        }
				//creacion de la salida o el retorno

			case 7:
				UI.put("OptionPane.background",new Color(145, 176, 152));UI.put("Panel.background",new Color(98, 226, 127));
				JOptionPane.showMessageDialog(null, "Hasta la proxima!","Salida",0);
				break;
			default:
				UI.put("OptionPane.background",new Color(216, 79, 79));UI.put("Panel.background", new Color(216, 79, 79));
				JOptionPane.showMessageDialog(null,"Opcion Incorrecta,Intenta ingresar otro numero","Error", 0);
				continue;
			}
		}while(opcion!=7);

	}
	//Metodo para calcular el factorial
	public static long MtdCalc_Factorial   (long l) {   
		 int i;
	     long nFactorial=1;
	        for (i=1; i<=l; i++)
	        {
	        	nFactorial=nFactorial*i;
	        }
	        return nFactorial;
	}

}
