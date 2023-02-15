
package libs;


public class Funciones {
	
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ((num1>=num2) && (num1<=num3) || (num1>=num3) && (num1<=num2)) {
			enMedio=num1;
		}  else if  ((num2>=num1) && (num2<=num3) || (num2>=num3) && (num2<=num1)) {
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	
	public int minutosEntre(int hora1, int min1, int hora2, int min2) {
		if (hora1<0 || hora1>23 
			|| hora2<0 || hora2>23) {
			throw new ArithmeticException("Las horas han de estar comprendidas entre 0 y 23, ambas inclusive.");
		}
		if (min1<0 || min1>59
			|| min2<0 || min2>59) {
				throw new ArithmeticException("Los minutos han de estar comprendidas entre 0 y 59, amb0s inclusive.");
		}
		min1 = min1 + (hora1*60);
		min2 = min2 + (hora2*60);
		if (min1>min2) {
			int aux = min1;
			min1=min2;
			min2=aux;
		}
		int resultado = min2-min1;
		return resultado;
	}
	
	
	public boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}

	public int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tama�o");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}	
	
}
