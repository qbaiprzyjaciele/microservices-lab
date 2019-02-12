package com.szkolenie.szkolenie;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by B0638667_2 on 2019-02-07.
 */
@FeignClient("antifraud")
interface AntifraudClient {

    @GetMapping("/status/{clientId}")
    String checkFraudStatus(@PathVariable("clientId") String clientId);

}
