package com.biz.client;

/**
 * Created by B0638667_2 on 2019-02-10.
 */
public interface ClientService {

    public Client findById(String clientId);

    public Client save(Client client);


}
