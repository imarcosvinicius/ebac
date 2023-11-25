public class Main {
    public static void main(String[] args) {
        Pessoajuridica pj = new Pessoajuridica();
        PessoaFisica pf = new PessoaFisica();

        pj.setNome("Jim Carrey LTDA");
        pj.setEndereco("Av. Brasil");
        pj.setCnpj("59357675000135");

        pf.setNome("Eddie Murphy");
        pf.setEndereco("Av. Paraiso");
        pf.setCpf("75600763000");

        System.out.println("Pessoa Jurídica");
        pj.imprimirPessoa(pj.getCnpj());

        System.out.println("\n ****** \n");

        System.out.println("Pessoa Física");
        pf.imprimirPessoa(pf.getCpf());

        /*
            Dados impressos:

            Pessoa Jurídica
            Jim Carrey LTDA, Av. Brasil, 59357675000135

             ******

            Pessoa Física
            Eddie Murphy, Av. Paraiso, 75600763000

         */

    }
}