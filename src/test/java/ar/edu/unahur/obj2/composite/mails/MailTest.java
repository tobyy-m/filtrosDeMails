package ar.edu.unahur.obj2.composite.mails;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.composite.agrupables.Agrupable;
import ar.edu.unahur.obj2.composite.filtros.*;

public class MailTest {
    @Test
    void dadoUnMailConAsuntoMuyImportanteYTamanio250ConAdjuntoCumpleFiltroConContieneAdjuntoYTamanioMayoA230YAsuntoMuyImportante() {
        Mail mail = new Mail("Java", "Test", "Muy importante", 250, true, "Reunion de consorcio para tratar problema con ascensor 1");
        Agrupable tam = new Tamanio(mail, 230);
        Agrupable adj = new Adjunto(mail);
        Agrupable contiene = new AsuntoContiene(mail, "importante");
        Agrupable compuesto = new FiltroCompuesto(
            Arrays.asList(tam, adj, contiene)
        );
        mail.setFiltro(compuesto);
        assertTrue(mail.filtrate());

    }
}
