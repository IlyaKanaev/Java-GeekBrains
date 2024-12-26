package main.java.vetclinic.factory;

import main.java.vetclinic.repository.Repository;
import main.java.vetclinic.repository.RepositoryImpl;
import main.java.vetclinic.vetservice.VeterinaryClinic;
import main.java.vetclinic.vetservice.impl.VeterinaryClinicImpl;

public class Factory {
    public static VeterinaryClinic getVetService() {
        return VeterinaryClinicImpl.getInstance();
    }

    public static Repository getRepository() {
        return RepositoryImpl.getInstance();
    }
}
