package cc.bitbank.entity;

import cc.bitbank.entity.enums.OrderSide;
import cc.bitbank.entity.enums.OrderType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by kohei.sato on 2022/03/20.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trade extends Data implements Comparable<Trade>{
	@JsonProperty("trade_id")
	public long tradeId;
    @JsonProperty("order_id")
    public long orderId;
    public String pair;
    public OrderSide side;
    public OrderType type;
    public BigDecimal amount;
    public BigDecimal price;
    @JsonProperty("maker_taker")
    public String makerTaker;
    @JsonProperty("fee_amount_base")
    public String feeAmountBase;
    @JsonProperty("fee_amount_quote")
    public String feeAmountQuote;
    @JsonProperty("executed_at")
    public Date executedAt;
    

    public String toString() {
    	return "[Order] trade_id " + tradeId 
    			+ ", order_id " + orderId
    			+ ", side " + side.getCode()
    			+ ", type " + type.getCode() 
    			+ ", amount " + amount.toString()
    			+ ", price " + price.toString()
    			+ ", makerTaker " + makerTaker
    			+ ", feeAmountBase " + feeAmountBase
    			+ ", feeAmountQuote " + feeAmountQuote
    			+ ", executedAt " + executedAt.toString();    	
    }


    public int compareTo(Trade trade) {
    	if(this.executedAt.before(trade.executedAt)) {
    		return -1;
    	}else if(this.executedAt.after(trade.executedAt)){
    		return 1;
    	}
		return 0;
	}
    
}
