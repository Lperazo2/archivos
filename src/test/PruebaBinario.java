package test;

import dominio.ArchivoBinario;


public class PruebaBinario {
    public static void main(String[] args) {
        ArchivoBinario arch = new ArchivoBinario();
        arch.abrir();
        arch.aniadir();
        arch.cerrar();
    }
}
