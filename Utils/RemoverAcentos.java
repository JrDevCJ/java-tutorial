import java.text.Normalizer;

public class RemoverAcentos {

	public static void main(String args[]) {

		String frase = "Removendo acentuação[à, í, ê, ã, ç]";

		String fraseSemAcento = Normalizer
			.normalize(frase, Normalizer.Form.NFD)
			.replaceAll("[^\\p{ASCII}]", "");

			System.out.println("Frase com acento");
			System.out.println(frase);
			System.out.println("Frase sem acento");
			System.out.println(fraseSemAcento);

	}

}
