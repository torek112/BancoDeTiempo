package com.zahirasoft.service.impl;

import com.zahirasoft.dto.OffersDto;
import com.zahirasoft.mapper.OffersMapper;
import com.zahirasoft.model.Offers;
import com.zahirasoft.repository.OffersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OffersServiceImpl {

    @Autowired
    OffersRepository offersRepository;

    @Autowired
    OffersMapper offersMapper;

    public OffersDto saveOffers(OffersDto offersDto){
        offersRepository.save(offersMapper.convertOffersDto2Offers(offersDto));
        return offersDto;
    }
}
