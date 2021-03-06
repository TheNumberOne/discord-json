package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.EmojiData;
import discord4j.discordjson.json.MemberData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageReactionAdd.class)
@JsonDeserialize(as = ImmutableMessageReactionAdd.class)
public interface MessageReactionAdd extends Dispatch {

    static ImmutableMessageReactionAdd.Builder builder() {
        return ImmutableMessageReactionAdd.builder();
    }

    @JsonProperty("user_id")
    String userId();
    @JsonProperty("channel_id")
    String channelId();
    @JsonProperty("message_id")
    String messageId();
    @JsonProperty("guild_id")
    Possible<String> guildId();
    Possible<MemberData> member();
    EmojiData emoji();
}
