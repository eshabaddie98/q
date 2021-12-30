/**
* Blockchain.com Exchange REST API
* ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. \\ These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account \\ Select API from the drop down menu \\ Fill out form and click “Create New API Key Now” \\ Once generated you can view your keys under API Settings. \\ Please be aware that the API key can only be used once it was verified via email.  The API key must be set via the \\ `X-API-Token`\\ header.  The base URL to be used for all calls is \\ `https://api.blockchain.com/v3/exchange`  Autogenerated clients for this API can be found [here](https://github.com/blockchain/lib-exchange-client). 
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.blockchain.exchange.rest.model


import com.squareup.moshi.Json
/**
 * 
 * @param symbol Blockchain symbol identifier
 * @param price24h 
 * @param volume24h 
 * @param lastTradePrice 
 */

data class PriceEvent (
    /* Blockchain symbol identifier */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null,
    @Json(name = "price_24h")
    val price24h: kotlin.Double? = null,
    @Json(name = "volume_24h")
    val volume24h: kotlin.Double? = null,
    @Json(name = "last_trade_price")
    val lastTradePrice: kotlin.Double? = null
)

