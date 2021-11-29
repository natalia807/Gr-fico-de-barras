//programa de impressão de gráfico de barras.

public class GraficodeBarras {
	public static void main(String[] args) {
		
		int array[] =  { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
		
		// para cada elemento de array, gera saída de uma barra do gráfico
		for(int c = 0; c < array.length; c++) {
			// gera saída do rótulo de barra ( "00-09: ", ..., "90-99: ", "100: ")
			if(c == 10) {
				System.out.printf("%5d: ", 100);

			}else {
				System.out.printf("%02d-%02d: ",c * 10, c * 10 + 9); 
			}
			// imprime a barra de asteriscos
			for (int stars = 0; stars < array[c]; stars++) {
				System.out.print("*");
			}
			
		}
	}

}
