package Vodafone.utilities;

import Vodafone.pages.*;

public class Pages {
    Login login;
    GenericFunctions genericFunctions;


    public GenericFunctions genericFunctions() {
        if (genericFunctions == null) {
            genericFunctions = new GenericFunctions();
        }
        return genericFunctions;
    }
    public Login login() {
        if (login == null) {
            login = new Login();
        }
        return login;
    }

}
