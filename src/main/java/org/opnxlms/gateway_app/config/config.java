//package org.opnxlms.gateway_app.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientManager;
//import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
//import org.springframework.security.oauth2.client.web.DefaultReactiveOAuth2AuthorizedClientManager;
//import org.springframework.security.oauth2.client.web.server.ServerOAuth2AuthorizedClientRepository;
//import org.springframework.security.oauth2.client.web.server.WebSessionServerOAuth2AuthorizedClientRepository;
//
//public class config {
//
//
//    private ReactiveClientRegistrationRepository clientRegistrationRepository;
//    public config(ReactiveClientRegistrationRepository clientRegistrationRepository) {
//        this.clientRegistrationRepository = clientRegistrationRepository;
//    }
//
//
//
//    @Bean
//    public ServerOAuth2AuthorizedClientRepository authorizedClientRepository() {
//        return new WebSessionServerOAuth2AuthorizedClientRepository();
//    }
//
//    @Bean
//    public ReactiveOAuth2AuthorizedClientManager authorizedClientManager() {
//        DefaultReactiveOAuth2AuthorizedClientManager authorizedClientManager = new DefaultReactiveOAuth2AuthorizedClientManager(
//                clientRegistrationRepository, authorizedClientRepository());
//        return authorizedClientManager;
//}}
