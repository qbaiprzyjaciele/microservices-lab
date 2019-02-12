package com.biz.fastcredit;

import com.biz.client.Client;
import com.biz.client.ClientService;

/**
 * Created by B0638667_2 on 2019-02-10.
 */
public class FascreditService {

    private ClientService clientService;

    public Fastcredit createFastcredit(String clientId) {
        Client client = clientService.findById(clientId);
        new Fastcredit()
    }
}
