package com.app.service;

public class APIUntil {
    private static String baseURL = "https://tygia.com/app/covid-19/api.json?";

    public static APIService getServer() {
        return APIClient.getApiClientLSP(baseURL).create(APIService.class);
    }
}
