package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableAuditLogChangeData.class)
public interface AuditLogChangeData {

    @JsonProperty("new_value")
    Possible<Object> newValue();

    @JsonProperty("old_value")
    Possible<Object> oldValue();

    String key();
}