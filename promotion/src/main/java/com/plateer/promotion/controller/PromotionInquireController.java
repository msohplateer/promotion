package com.plateer.promotion.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plateer.promotion.data.PromotionType;
import com.plateer.promotion.service.PromotionCalculationService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("prmotion")
@Slf4j
public class PromotionInquireController {

	@Autowired
	PromotionCalculationService service;
	
	@GetMapping("/getpriceadjamtdata")
	public String getPriceAdjAmtData(HttpServletRequest request) {
		log.info("가격조정 controller call");
		service.getCalculateCompleteData(PromotionType.PRC_ADJ);
		return "test success";
	}
	
	@GetMapping("/getprdcoupondata")
	public String getPrdCupData(HttpServletRequest request) {
		log.info("가격조정 controller call");
		service.getCalculateCompleteData(PromotionType.PRD_CUP);
		return "test success";
	}
	
	@GetMapping("/getdupcoupondata")
	public String getDupCupData(HttpServletRequest request) {
		log.info("가격조정 controller call");
		service.getCalculateCompleteData(PromotionType.DUP_CUP);
		return "test success";
	}
	
	@GetMapping("/getbskcoupondata")
	public String getBskCupData(HttpServletRequest request) {
		log.info("가격조정 controller call");
		service.getCalculateCompleteData(PromotionType.BSK_CUP);
		return "test success";
	}
}
