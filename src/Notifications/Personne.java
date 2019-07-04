package Notifications;

/**
 *
 * @author FKC-Standard
 */
public class Personne {
    private String names;
    private String email;
    private String tels;

    public Personne(String names, String email, String tels) {
        this.names = names;
        this.email = email;
        this.tels = tels;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTels() {
        return tels;
    }

    public void setTels(String tels) {
        this.tels = tels;
    }

}
