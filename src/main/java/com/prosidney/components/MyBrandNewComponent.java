package com.prosidney.components;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by admin on 15/05/2017.
 */
public class MyBrandNewComponent {

    @Autowired
    private AcrComponent acrComponent;

    @Autowired
    private CcdComponent ccdComponent;


    public boolean isInterestRateMoreThanZero(String cardContractNumber) throws Exception {
        final Double interestRate = acrComponent.getInterestRate(cardContractNumber);

        if(interestRate >= 1.99){
            return true;
        }

        return false;
    }
}
