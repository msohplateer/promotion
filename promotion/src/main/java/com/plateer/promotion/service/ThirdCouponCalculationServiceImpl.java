package com.plateer.promotion.service;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThirdCouponCalculationServiceImpl implements CalculationService{

	@Override
	public List getPromotionData() {
		log.info("장바구니쿠폰 데이터 조회");
		return null;
	}

	@Override
	public Object getCalculationData() {
		log.info("장바구니쿠폰 계산 데이터 조회");
		getPromotionData();
		calculatePromotion();
		return null;
	}

	@Override
	public Object calculatePromotion() {
		log.info("장바구니쿠폰 계산");
		return null;
	}

}
