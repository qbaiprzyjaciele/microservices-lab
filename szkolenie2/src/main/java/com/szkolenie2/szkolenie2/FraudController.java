package com.szkolenie2.szkolenie2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by B0638667_2 on 2019-02-07.
 */
@RestController
public class FraudController {
    @Autowired
    private FraudCheckService fraudCheckService;

    @GetMapping(value = "/status/{clientId}")
    public String satus(@PathVariable String clientId) {
        return fraudCheckService.checkClient(clientId);
    }
}
