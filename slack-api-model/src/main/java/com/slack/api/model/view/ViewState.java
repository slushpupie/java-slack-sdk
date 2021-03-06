package com.slack.api.model.view;

import com.slack.api.model.block.composition.PlainTextObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ViewState {
    // block_id, action_id
    private Map<String, Map<String, Value>> values;

    @Data
    public static class Value {
        private String type;
        private String value;
        private String selectedDate;
        private String selectedConversation;
        private String selectedChannel;
        private String selectedUser;
        private SelectedOption selectedOption;
        private List<String> selectedConversations;
        private List<String> selectedChannels;
        private List<String> selectedUsers;
        private List<SelectedOption> selectedOptions;
    }

    @Data
    public static class SelectedOption {
        private PlainTextObject text;
        private String value;
    }
}
