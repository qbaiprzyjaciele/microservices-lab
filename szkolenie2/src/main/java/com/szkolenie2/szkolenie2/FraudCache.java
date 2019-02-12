package com.szkolenie2.szkolenie2;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by B0638667_2 on 2019-02-07.
 */
@Repository
public class FraudCache {

    private Map<String,String> statusByClient =  new HashMap<>();

    public FraudCache() {
        this.statusByClient.put("00001","OK");
        this.statusByClient.put("00002","DENIED");
    }

    public String findStatusByClient(String clientId) {
        return this.statusByClient.get(clientId);
    }
}
