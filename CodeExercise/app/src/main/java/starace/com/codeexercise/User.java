package starace.com.codeexercise;

import java.util.List;

/**
 * Created by mstarace on 8/29/17.
 */

public class User {

    private String name;

    private String email;

    private List<ContactMethod> contact_methods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ContactMethod> getContact_methods() {
        return contact_methods;
    }

    public void setContact_methods(List<ContactMethod> contact_methods) {
        this.contact_methods = contact_methods;
    }
}
