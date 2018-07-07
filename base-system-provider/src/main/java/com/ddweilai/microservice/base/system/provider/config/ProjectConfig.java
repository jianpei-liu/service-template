package com.ddweilai.microservice.base.system.provider.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by chenll on 2017/12/8.
 */
@Component
@ConfigurationProperties(prefix = "frog")//接收application.yml中的frog下面的属性
public class ProjectConfig {
    private String appkey;

    //shopify

    private String shopifyAppKey;

    private String shopifyPassword;

    private String shopifyBaseUrl;

    //TradeGecko

    private String tradeAuthKey;
    private String tradeBaseUrl;

    public String getAppkey() {
        return appkey;
    }
    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getShopifyAppKey() {
        return shopifyAppKey;
    }

    public void setShopifyAppKey(String shopifyAppKey) {
        this.shopifyAppKey = shopifyAppKey;
    }

    public String getShopifyPassword() {
        return shopifyPassword;
    }

    public void setShopifyPassword(String shopifyPassword) {
        this.shopifyPassword = shopifyPassword;
    }

    public String getShopifyBaseUrl() {
        return shopifyBaseUrl;
    }

    public void setShopifyBaseUrl(String shopifyBaseUrl) {
        this.shopifyBaseUrl = shopifyBaseUrl;
    }

    public String getTradeAuthKey() {
        return tradeAuthKey;
    }

    public void setTradeAuthKey(String tradeAuthKey) {
        this.tradeAuthKey = tradeAuthKey;
    }

    public String getTradeBaseUrl() {
        return tradeBaseUrl;
    }

    public void setTradeBaseUrl(String tradeBaseUrl) {
        this.tradeBaseUrl = tradeBaseUrl;
    }
}
