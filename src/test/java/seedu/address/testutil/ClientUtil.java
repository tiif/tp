package seedu.address.testutil;

import seedu.address.logic.commands.AddClientCommand;
import seedu.address.model.person.Client;

import static seedu.address.logic.parser.CliSyntax.*;

/**
 * A utility class for Client.
 */
public class ClientUtil {

    /**
     * Returns an AddClient command string for adding the {@code client}.
     */
    public static String getAddClientCommand(Client client) {
        return AddClientCommand.COMMAND_WORD + " " + getClientDetails(client);
    }

    /**
     * Returns the part of command string for the given {@code client}'s details.
     */
    private static String getClientDetails(Client client) {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX_NAME + client.getName().fullName + " ");
        sb.append(PREFIX_PHONE + client.getPhone().value + " ");
        sb.append(PREFIX_EMAIL + client.getEmail().value + " ");
        sb.append(PREFIX_ADDRESS + client.getAddress().value + " ");
        sb.append(PREFIX_MEETING_TIME + client.getMeetingTime().toString() + " ");
        client.getTags().stream().forEach(
                s -> sb.append(PREFIX_TAG + s.tagName + " ")
        );
        return sb.toString();
    }
}
