package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableReadyData.class)
public interface ReadyData {

    int v();
    UserData user();
    List<UnavailableGuildData> guilds();
    @JsonProperty("session_id")
    String sessionId();
    Possible<List<Integer>> shard();
}