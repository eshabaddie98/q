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

package com.blockchain.exchange.rest.model;

import com.blockchain.exchange.rest.model.OrdType;
import com.blockchain.exchange.rest.model.OrderStatus;
import com.blockchain.exchange.rest.model.Side;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrderSummary {
  
  @SerializedName("exOrdId")
  private Long exOrdId = null;
  @SerializedName("clOrdId")
  private String clOrdId = null;
  @SerializedName("ordType")
  private OrdType ordType = null;
  @SerializedName("ordStatus")
  private OrderStatus ordStatus = null;
  @SerializedName("side")
  private Side side = null;
  @SerializedName("price")
  private Double price = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("lastShares")
  private Double lastShares = null;
  @SerializedName("lastPx")
  private Double lastPx = null;
  @SerializedName("leavesQty")
  private Double leavesQty = null;
  @SerializedName("cumQty")
  private Double cumQty = null;
  @SerializedName("avgPx")
  private Double avgPx = null;
  @SerializedName("timestamp")
  private Long timestamp = null;

  /**
   * The unique order id assigned by the exchange
   **/
  @ApiModelProperty(value = "The unique order id assigned by the exchange")
  public Long getExOrdId() {
    return exOrdId;
  }
  public void setExOrdId(Long exOrdId) {
    this.exOrdId = exOrdId;
  }

  /**
   * Reference field provided by client. Cannot exceed 20 characters, only alphanumeric characters are allowed.
   **/
  @ApiModelProperty(required = true, value = "Reference field provided by client. Cannot exceed 20 characters, only alphanumeric characters are allowed.")
  public String getClOrdId() {
    return clOrdId;
  }
  public void setClOrdId(String clOrdId) {
    this.clOrdId = clOrdId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OrdType getOrdType() {
    return ordType;
  }
  public void setOrdType(OrdType ordType) {
    this.ordType = ordType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OrderStatus getOrdStatus() {
    return ordStatus;
  }
  public void setOrdStatus(OrderStatus ordStatus) {
    this.ordStatus = ordStatus;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Side getSide() {
    return side;
  }
  public void setSide(Side side) {
    this.side = side;
  }

  /**
   * The limit price for the order
   **/
  @ApiModelProperty(value = "The limit price for the order")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   * The reason for rejecting the order, if applicable
   **/
  @ApiModelProperty(value = "The reason for rejecting the order, if applicable")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Blockchain symbol identifier
   **/
  @ApiModelProperty(required = true, value = "Blockchain symbol identifier")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   * The executed quantity for the order's last fill
   **/
  @ApiModelProperty(value = "The executed quantity for the order's last fill")
  public Double getLastShares() {
    return lastShares;
  }
  public void setLastShares(Double lastShares) {
    this.lastShares = lastShares;
  }

  /**
   * The executed price for the last fill
   **/
  @ApiModelProperty(value = "The executed price for the last fill")
  public Double getLastPx() {
    return lastPx;
  }
  public void setLastPx(Double lastPx) {
    this.lastPx = lastPx;
  }

  /**
   * For Open and Partially Filled orders this is the remaining quantity open for execution. For Canceled and Expired orders this is the quantity than was still open before cancellation/expiration. For Rejected order this is equal to orderQty. For other states this is always zero.
   **/
  @ApiModelProperty(value = "For Open and Partially Filled orders this is the remaining quantity open for execution. For Canceled and Expired orders this is the quantity than was still open before cancellation/expiration. For Rejected order this is equal to orderQty. For other states this is always zero.")
  public Double getLeavesQty() {
    return leavesQty;
  }
  public void setLeavesQty(Double leavesQty) {
    this.leavesQty = leavesQty;
  }

  /**
   * The quantity of the order which has been filled
   **/
  @ApiModelProperty(value = "The quantity of the order which has been filled")
  public Double getCumQty() {
    return cumQty;
  }
  public void setCumQty(Double cumQty) {
    this.cumQty = cumQty;
  }

  /**
   * Calculated the Volume Weighted Average Price of all fills for this order
   **/
  @ApiModelProperty(value = "Calculated the Volume Weighted Average Price of all fills for this order")
  public Double getAvgPx() {
    return avgPx;
  }
  public void setAvgPx(Double avgPx) {
    this.avgPx = avgPx;
  }

  /**
   * Time in ms since 01/01/1970 (epoch)
   **/
  @ApiModelProperty(value = "Time in ms since 01/01/1970 (epoch)")
  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSummary orderSummary = (OrderSummary) o;
    return (this.exOrdId == null ? orderSummary.exOrdId == null : this.exOrdId.equals(orderSummary.exOrdId)) &&
        (this.clOrdId == null ? orderSummary.clOrdId == null : this.clOrdId.equals(orderSummary.clOrdId)) &&
        (this.ordType == null ? orderSummary.ordType == null : this.ordType.equals(orderSummary.ordType)) &&
        (this.ordStatus == null ? orderSummary.ordStatus == null : this.ordStatus.equals(orderSummary.ordStatus)) &&
        (this.side == null ? orderSummary.side == null : this.side.equals(orderSummary.side)) &&
        (this.price == null ? orderSummary.price == null : this.price.equals(orderSummary.price)) &&
        (this.text == null ? orderSummary.text == null : this.text.equals(orderSummary.text)) &&
        (this.symbol == null ? orderSummary.symbol == null : this.symbol.equals(orderSummary.symbol)) &&
        (this.lastShares == null ? orderSummary.lastShares == null : this.lastShares.equals(orderSummary.lastShares)) &&
        (this.lastPx == null ? orderSummary.lastPx == null : this.lastPx.equals(orderSummary.lastPx)) &&
        (this.leavesQty == null ? orderSummary.leavesQty == null : this.leavesQty.equals(orderSummary.leavesQty)) &&
        (this.cumQty == null ? orderSummary.cumQty == null : this.cumQty.equals(orderSummary.cumQty)) &&
        (this.avgPx == null ? orderSummary.avgPx == null : this.avgPx.equals(orderSummary.avgPx)) &&
        (this.timestamp == null ? orderSummary.timestamp == null : this.timestamp.equals(orderSummary.timestamp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.exOrdId == null ? 0: this.exOrdId.hashCode());
    result = 31 * result + (this.clOrdId == null ? 0: this.clOrdId.hashCode());
    result = 31 * result + (this.ordType == null ? 0: this.ordType.hashCode());
    result = 31 * result + (this.ordStatus == null ? 0: this.ordStatus.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.text == null ? 0: this.text.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.lastShares == null ? 0: this.lastShares.hashCode());
    result = 31 * result + (this.lastPx == null ? 0: this.lastPx.hashCode());
    result = 31 * result + (this.leavesQty == null ? 0: this.leavesQty.hashCode());
    result = 31 * result + (this.cumQty == null ? 0: this.cumQty.hashCode());
    result = 31 * result + (this.avgPx == null ? 0: this.avgPx.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSummary {\n");
    
    sb.append("  exOrdId: ").append(exOrdId).append("\n");
    sb.append("  clOrdId: ").append(clOrdId).append("\n");
    sb.append("  ordType: ").append(ordType).append("\n");
    sb.append("  ordStatus: ").append(ordStatus).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  lastShares: ").append(lastShares).append("\n");
    sb.append("  lastPx: ").append(lastPx).append("\n");
    sb.append("  leavesQty: ").append(leavesQty).append("\n");
    sb.append("  cumQty: ").append(cumQty).append("\n");
    sb.append("  avgPx: ").append(avgPx).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
