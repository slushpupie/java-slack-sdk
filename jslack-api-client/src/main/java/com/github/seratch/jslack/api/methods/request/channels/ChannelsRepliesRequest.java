package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Data;

@Deprecated // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
@Data
@Builder
public class ChannelsRepliesRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:history`
     */
    private String token;

    /**
     * Channel to fetch thread from
     */
    private String channel;

    /**
     * Unique identifier of a thread's parent message
     */
    private String threadTs;

}