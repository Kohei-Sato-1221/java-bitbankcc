package cc.bitbank.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by kohei.sato on 2020/03/20.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trades extends Data {
    public Trade[] trades;

    public Trades() {}
    public Trades(Trade[] trades) {
        this.trades = trades;
    }
}
