package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// POJO : Plain Old Java Object
@WebService(serviceName = "BankWs")
public class BanKService {
    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name = "montant") double montant) {
        return Math.round(montant * 10.54 * 100.0) / 100.0; // Example conversion rate from EUR to DH
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random()*9888, new Date());
    }

    @WebMethod
    public List<Compte> listComptes() {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1, Math.random()*9888, new Date()));
        comptes.add(new Compte(2, Math.random()*9888, new Date()));
        comptes.add(new Compte(3, Math.random()*9888, new Date()));
        return comptes;
    }

    @WebMethod
    public List<Compte> listComptes2() {
        return List.of(
                new Compte(1, Math.random()*9888, new Date()),
                new Compte(2, Math.random()*9888, new Date()),
                new Compte(3, Math.random()*9888, new Date())
        );
    }

}
