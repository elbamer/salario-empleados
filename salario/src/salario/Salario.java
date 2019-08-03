package salario;


public class Salario { 
				 
		    public static void main(String[] args) {		                                 
		                String SalarioNeto[][]= {{"1000","2000","3000","4000"},{"0","0","0","0"},{"Julio","Agustin","Ivan","Rosa"}};
		              
		                //double d = Double.parseDouble("1000"); Convertir String a double
		               // String totalString = String.valueOf(doble);//Convertit Double a String
		                for(int i=0;i<SalarioNeto[0].length;i++){
		                    double total=0;
		                    double sueldoNeto=0;                         
		                    double aux;
		                    aux=Double.parseDouble(SalarioNeto[0][i]);   
		                  // total=(Double.parseDouble(SalarioNeto[0][i])*.006);
		                    total=(aux*.006);		                    
		                    sueldoNeto=(aux-total);	              
		                         
		                    SalarioNeto[1][i] =String.valueOf(sueldoNeto);
		                    System.out.println( "El sueldo neto de   :"+ SalarioNeto[2][i]+"  es   "+SalarioNeto[1][i]);
			                          
		                }                           
		        }		        

	    }
