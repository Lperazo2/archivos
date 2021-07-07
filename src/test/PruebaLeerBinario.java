package test;

import dominio.LeerArchivoBinario;


public class PruebaLeerBinario {
    public static void main(String[] args) {
        LeerArchivoBinario leer = new LeerArchivoBinario();
        leer.abrir();
        leer.leer();
        leer.cerrar();
    }
}