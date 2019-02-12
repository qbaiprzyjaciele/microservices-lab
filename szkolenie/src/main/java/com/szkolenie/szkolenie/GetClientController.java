package com.szkolenie.szkolenie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by B0638667_2 on 2019-02-07.
 */
@RestController
public class GetClientController {

    @Autowired
    private AntifraudClient antifraudClient;

    @GetMapping(value = "/test/{clientId}")
    public String getClientWithStatus(@PathVariable("clientId") String clientId) {
        return antifraudClient.checkFraudStatus(clientId);
    }

}
