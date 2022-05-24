package com.plateer.promotion.factory;

import com.plateer.promotion.data.PromotionType;

public abstract class CalculationFactory {
	abstract public Object getCalculateCompleteData(PromotionType prmType);
}
