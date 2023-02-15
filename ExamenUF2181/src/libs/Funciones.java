package libs;

/**
 * Librería de funciones útiles para un proyecto.
 * Ejercicio para examen en el que, con las funciones a continuación, se debía testear la clase Funciones.java. También se requirió la realización de la documentación de dicho proyecto.
 * @author Barbara Ruiz
 *
 */
public class Funciones {
	/**
	 * Procedimiento por el que el usuario introduce tres números enteros. El algoritmo determina cuál de ellos es el que ocupa la posición central.
	 * @param num1 int primer número aportado por el usuario.
	 * @param num2 int segundo número aportado por el usuario.
	 * @param num3 int tercer número aportado por el usuario.
	 * @return int Devuelve un valor int, que ha de ser el que ocupe la posición central de los tres aportados por el usuario.
	 */
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
	/**
	 * Procedimiento por el cual se hace una comparación entre dos horas:minutos. 
	 * El usuario introduce dos horas a comparar, con sus respectivos minutos.
	 * Las horas han de estar comprendidas entre 0 y 23, ambos inclusive.
	 * Los minutos han de estar comprendidos entre 0 y 59, ambos inclusive.
	 * El algoritmo devuelve siempre la diferencia menor entre las horas (hora2 -hora1). En el caso que hora2 sea menor que hora1, el algoritmo realizará la diferencia entre hora1-hora.
	 * @param hora1 int formato de horas, primera hora a comparar.
	 * @param min1 int formato de minutos, primera hora a comparar.
	 * @param hora2 int formato de horas, segunda hora a comparar.
	 * @param min2 int formato de minutos, segunda hora a comparar.
	 * @return int Devuelve el número de minutos totales que diferencian las dos horas:minutos proporcionadas por el usuario.
	 * @throws ArithmeticException cuando las horas no están comprendidas entre 0 y 23 ambos inclusive y/o los minutos no están comprendidos entre 0 y 59 ambos inclusive.
	 */
	public int minutosEntre(int hora1, int min1, int hora2, int min2) {
		if (hora1<0 || hora1>23 
			|| hora2<0 || hora2>23) {
			throw new ArithmeticException("Las horas han de estar comprendidas entre 0 y 23, ambas inclusive.");
		}
		if (min1<0 || min1>59
			|| min2<0 || min2>59) {
				throw new ArithmeticException("Los minutos han de estar comprendidos entre 0 y 59, ambos inclusive.");
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
	
	/**
	 * Procedimiento por el cual el usuario indica un vector. El algoritmo determinará si éste es capicúa o no lo es.
	 * @param v int Vector de enteros a comprobar.
	 * @return boolean Devuelve true (verdadero) cuando el vector es capicúa. Devuelve false (falso) si el vector no es capicúa.
	 */
	public boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}

	/**
	 * Procedimiento por el cual el algoritmo realiza la suma de dos vectores de enteros indicados por el usuario. 
	 * @param v int Vector1 de enteros introducido por el usuario.
	 * @param v2 int Vector2 de enteros introducido por el usuario.
	 * @return int [] Devuelve un vector de enteros con el resultado de la suma de los vectores aportados por el usuario.
	 * @throws ArithmeticException cuando los vectores no son del mismo tamaño (tienen la diferente longitud).
	 */
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
