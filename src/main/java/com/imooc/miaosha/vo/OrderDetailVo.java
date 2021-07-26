package com.imooc.miaosha.vo;

import com.imooc.miaosha.domain.MiaoshaUser;
import com.imooc.miaosha.domain.OrderInfo;

public class OrderDetailVo {
    private GoodsVo goodsVol;
    private OrderInfo orderInfo;

    public GoodsVo getGoodsVol() {
        return goodsVol;
    }

    public void setGoodsVol(GoodsVo goodsVol) {
        this.goodsVol = goodsVol;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }
}
