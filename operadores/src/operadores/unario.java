package operadores;

public class unario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int preIncrementoOriginal = 8, preIncrementoResultado;
		int posIncrementoOriginal = 8, posIncrementoResultado;
		
		System.out.printf("Pré Incremento: valor original =%d%n", preIncrementoOriginal);
		preIncrementoResultado = ++preIncrementoOriginal;
		System.out.printf("Após pré incrementar a variavel original: resultado %d, Valor atualizado, %d%n ",preIncrementoResultado,preIncrementoOriginal );

	
		System.out.printf("Pós Incremento: valor original =%d%n", posIncrementoOriginal);
		posIncrementoResultado = posIncrementoOriginal++;
		System.out.printf("Após pré incrementar a variavel original: resultado %d, Valor atualizado, %d%n ",posIncrementoResultado,posIncrementoOriginal );

	}

}
