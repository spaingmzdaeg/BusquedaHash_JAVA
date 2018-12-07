
public class PruebaHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashCero hash=new hashCero(8);
	    String[] elementos={ "20","33","21","10","12","14","56","100"};
	    hash.funcionhash(elementos, hash.arreglo);
	    hash.mostar();
	    String buscado=hash.buscarclave("33");
	    if( buscado==null){
	    	System.out.println(" el elemento 33 no se encuentra en la tabla" );
	        }
	    }
	}


