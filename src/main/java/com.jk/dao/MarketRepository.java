package com.jk.dao;

import com.jk.model.Market;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/11/16.
 */
public interface MarketRepository extends JpaRepository<Market, Long> {
    Market findById(long id);
    Long deleteById(Long id);
}
