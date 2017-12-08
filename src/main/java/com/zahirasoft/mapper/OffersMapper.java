package com.zahirasoft.mapper;

import com.zahirasoft.dto.OffersDto;
import com.zahirasoft.dto.UserDto;
import com.zahirasoft.model.Offers;
import com.zahirasoft.model.User;
import org.springframework.stereotype.Component;

@Component("offersConverter")
public class OffersMapper {

    public OffersDto convertOffers2OffersDto(Offers offers) {
        OffersDto offersDto = new OffersDto();
        offersDto.setIdOffers(offers.getIdOffers());
        offersDto.setDescription(offers.getDescription());
        return offersDto;
    }

    public Offers convertOffersDto2Offers(OffersDto offersDto) {
        Offers offers = new Offers();
        offers.setIdOffers(offersDto.getIdOffers());
        offers.setDescription(offersDto.getDescription());
        return offers;
    }

}
