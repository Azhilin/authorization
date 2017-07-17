package ua.infopulse.service;

import ua.infopulse.clientDTO.ClientDTO;
import ua.infopulse.dao.*;

/**
 * Created by dima on 16.02.17.
 */
public class RegistrationService {
    public boolean registrate(String name, String login, String password) {
        DAOFactory factory = DAOFactory.getInstance();
        ClientDAO clientDAO = factory.getClientDAO();
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setName(name);
        clientDTO.setLogin(login);
        clientDTO.setPassword(password);
        return clientDAO.insert(clientDTO);
    }
}
