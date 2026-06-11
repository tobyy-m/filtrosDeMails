package ar.edu.unahur.obj2.composite.filtros;

import ar.edu.unahur.obj2.composite.mails.Mail;

public class DefaultFiltroSimple extends FiltroSimple{

    public DefaultFiltroSimple(Mail mail) {
        super(mail);
    }

    @Override
    protected Boolean doAplicar() {
        return Boolean.TRUE;
    }

    

}
