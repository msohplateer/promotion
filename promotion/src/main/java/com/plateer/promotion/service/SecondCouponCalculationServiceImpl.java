package com.plateer.promotion.service;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SecondCouponCalculationServiceImpl implements CalculationService{

	@Override
	public List getPromotionData() {
		log.info("중복쿠폰 데이터 조회");
		return null;
	}

	@Override
	public Object getCalculationData() {
		log.info("중복쿠폰 계산 데이터 조회");
		getPromotionData();
		calculatePromotion();
		return null;
	}

	@Override
	public Object calculatePromotion() {
		log.info("중복쿠폰 계산");
		return null;
	}
}
