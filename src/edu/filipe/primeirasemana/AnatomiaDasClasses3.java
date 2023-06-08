package edu.filipe.primeirasemana;

public class AnatomiaDasClasses3 {
    public static void main(String[] args) {
        String meuNome =  "Filipe";
        String sobreNome = "Reis";

        String nomeCompleto = nomeCompleto(meuNome, sobreNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
