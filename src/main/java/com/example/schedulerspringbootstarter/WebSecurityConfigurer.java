package com.example.schedulerspringbootstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my-org.web.security")
public class WebSecurityConfigurer {

    void print(){
        System.out.println(adminEndpoints.toString());
    }

    //Endpoints that require the ADMIN role to access
    private String[] adminEndpoints = new String[] {};

    // Endpoints that have no security requirements.
    private String[] unsecuredEndpoints = new String[] {};


    public String[] getAdminEndpoints() {
        return adminEndpoints;
    }

    public void setAdminEndpoints(String[] adminEndpoints) {
        this.adminEndpoints = adminEndpoints;
    }

    public String[] getUnsecuredEndpoints() {
        return unsecuredEndpoints;
    }

    public void setUnsecuredEndpoints(String[] unsecuredEndpoints) {
        this.unsecuredEndpoints = unsecuredEndpoints;
    }

}