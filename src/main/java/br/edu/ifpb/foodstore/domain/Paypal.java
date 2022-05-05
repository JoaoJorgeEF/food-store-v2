package br.edu.ifpb.foodstore.domain;

import br.edu.ifpb.foodstore.service.log.LogService;

public class Paypal implements Payment {
    @Override
    public void doPay(LogService logService) {
        logService.info("Do paypal payment!");
    }
}