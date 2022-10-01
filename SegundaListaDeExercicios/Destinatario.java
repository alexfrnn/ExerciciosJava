public class  Destinatario {
    private static int emailDestinatario;
    
    
    /* public Destinatario(int emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }*/


    public static int getEmailDestinatario() {
        return emailDestinatario;
    }


    public void setEmailDestinatario(int emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }  
    
    public String buscar(){
       return "metodo buscar da classe destinatário";
    }
}
