public class Main {
    public static void main(String[] args) {

        Usuario usuario = Usuario.obterUsuario();
        Usuario usuario1 = Usuario.obterUsuario();

        System.out.println();
        System.out.println(usuario);
        System.out.println();
        System.out.println(usuario1);
        System.out.println();
        System.out.println(Usuario.obterUsuario());


//        void enviarEmail(final String email){
//            System.out.println("Olá, "+nome+"! Este é um e-mail.");

    }
}