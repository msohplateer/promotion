package com.plateer.promotion.service;

import org.springframework.stereotype.Service;

import com.plateer.promotion.data.PromotionType;
import com.plateer.promotion.factory.CalculationFactory;

@Service
public class PromotionCalculationService extends CalculationFactory {

	@Override
	public Object getCalculateCompleteData(PromotionType prmType) {
		Object retObj = null;
		switch(prmType) {
		case PRC_ADJ:
			PriceAdjAmtCalculationServiceImpl paac = new PriceAdjAmtCalculationServiceImpl();
			retObj = paac.getCalculationData();
			break;
		case PRD_CUP:
			FirstCouponCalculationServiceImpl fcc = new FirstCouponCalculationServiceImpl();
			retObj = fcc.getCalculationData();
			break;
		case DUP_CUP:
			SecondCouponCalculationServiceImpl scc = new SecondCouponCalculationServiceImpl();
			retObj = scc.getCalculationData();
			break;
		case BSK_CUP:
			ThirdCouponCalculationServiceImpl tcc = new ThirdCouponCalculationServiceImpl();
			retObj = tcc.getCalculationData();
			break;
		default:
			retObj = null;	
		}
		return retObj;
	}

}
