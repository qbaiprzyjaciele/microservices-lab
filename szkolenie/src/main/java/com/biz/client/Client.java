package com.biz.client;

/**
 * Created by B0638667_2 on 2019-02-10.
 */
public class Client {
    private final String clientId;
    private final String name;
    private final ClientType clientType;

    public Client(String clientId, String name, ClientType clientType) {
        this.clientId = clientId;
        this.name = name;
        this.clientType = clientType;
    }

    public String getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public ClientType getClientType() {
        return clientType;
    }
}
