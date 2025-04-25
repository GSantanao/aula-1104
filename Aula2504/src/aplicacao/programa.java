package aplicacao;

import entidades.ServidorPublico;
public class programa {
    public static void main(String[] args) {

        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("Anvisa");
        isabela.setLotacao("Brasília");
        isabela.setEmail("isabela@gmail.com");

        System.out.println("Servidor: "+ isabela.getNome());
        System.out.println("Servidor: "+ isabela.getCargo());


    }






}
