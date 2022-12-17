package io.github.s7i.pgf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Status {

    public static Status ok(String msg) {
        return Status.builder().ok(msg).build();
    }

    public static Status ok(String msg, Object context) {
        return Status.builder()
              .ok(msg)
              .context(context)
              .build();
    }

    String ok;
    @JsonInclude(Include.NON_NULL)
    String error;
    @JsonInclude(Include.NON_NULL)
    Object context;

}
