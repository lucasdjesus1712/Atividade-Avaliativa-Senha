import java.util.Scanner;

public class ValidaSenhaForte  {
    
    public static String avaliarSenha(String senha) {
        
        if (senha.length() < 8) {
            return "DICA: A senha deve ter no mínimo 8 caracteres.";
        }
      
        boolean temNumero = false;  
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit(senha.charAt(i))) {
                temNumero = true;
                break;
            }
        }

        if (!temNumero) {
            return "DICA: Adicione pelo menos um número à sua senha.";
        }

        String[] senhasObvias = {"123456", "senha", "qwerty", "abc123", "password"};
        for (int i= 0 ; i < senhasObvias.length; i++) {
            if (senha.equals(senhasObvias[i])) {
                return "ALERTA: Esta senha é muito comum ou óbvia.";
                
            }
        }

        boolean temLetraMaiuscula = false;  
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isUpperCase(senha.charAt(i))) {
                temLetraMaiuscula = true;
                break;
            }
        }
        
        if (!temLetraMaiuscula) {
            return "DICA: Adicione pelo menos uma letra maiúscula à sua senha.";
        }   

        return "SUCESSO: Sua senha passou nos critérios básicos!";
}

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mensagem; 

        do {
            System.out.print("Digite uma senha para avaliação");
            String senha = teclado.nextLine();
            mensagem = avaliarSenha(senha);
            System.out.println(mensagem);
        } while (!mensagem.startsWith("SUCESSO"));
    
        teclado.close();
    
    }
    }   




