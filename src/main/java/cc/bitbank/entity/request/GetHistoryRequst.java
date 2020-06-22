package cc.bitbank.entity.request;

import cc.bitbank.entity.enums.CurrencyPair;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by kohei.sato on 2020/03/20.
 */
public class GetHistoryRequst {
    public String pair;
    public long since;

    public GetHistoryRequst(CurrencyPair pair, long since) {
        this.pair = pair.getCode();
        this.since = since;
    }

    public String toJson() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "{}";
        }
    }
}
