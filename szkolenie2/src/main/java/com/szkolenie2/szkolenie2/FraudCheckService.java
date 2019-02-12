package com.szkolenie2.szkolenie2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by B0638667_2 on 2019-02-07.
 */
@Service
public class FraudCheckService {

    @Autowired
    private FraudCache fraudCache;

    public String checkClient(String clientId) {
        return fraudCache.findStatusByClient(clientId);
    }

}
