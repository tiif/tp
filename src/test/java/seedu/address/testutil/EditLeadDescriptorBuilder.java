package seedu.address.testutil;

import seedu.address.logic.commands.EditCommand;
import seedu.address.logic.commands.EditCommand.EditLeadDescriptor;

import seedu.address.model.person.*;
import seedu.address.model.tag.Tag;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EditLeadDescriptorBuilder {

    private EditLeadDescriptor leadDescriptor;

    public EditLeadDescriptorBuilder() {
        this.leadDescriptor = new EditLeadDescriptor();
    }


    public EditLeadDescriptorBuilder(EditLeadDescriptor descriptor) {
        this.leadDescriptor = new EditLeadDescriptor(descriptor);
    }

    public EditLeadDescriptorBuilder(Lead lead) {
        leadDescriptor = new EditLeadDescriptor();
        leadDescriptor.setName(lead.getName());
        leadDescriptor.setPhone(lead.getPhone());
        leadDescriptor.setEmail(lead.getEmail());
        leadDescriptor.setAddress(lead.getAddress());
        leadDescriptor.setKeyMilestone(lead.getKeyMilestone());
        leadDescriptor.setTags(lead.getTags());
    }


    public EditLeadDescriptorBuilder withName(String name) {
        leadDescriptor.setName(new Name(name));
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditLeadDescriptorBuilder withPhone(String phone) {
        leadDescriptor.setPhone(new Phone(phone));
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditLeadDescriptorBuilder withEmail(String email) {
        leadDescriptor.setEmail(new Email(email));
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditLeadDescriptorBuilder withAddress(String address) {
        leadDescriptor.setAddress(new Address(address));
        return this;
    }

    public EditLeadDescriptorBuilder withKeyMilestone(String keyMilestone) {
        leadDescriptor.setKeyMilestone(new KeyMilestone(keyMilestone));
        return this;
    }


    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code EditPersonDescriptor}
     * that we are building.
     */
    public EditLeadDescriptorBuilder withTags(String... tags) {
        Set<Tag> tagSet = Stream.of(tags).map(Tag::new).collect(Collectors.toSet());
        leadDescriptor.setTags(tagSet);
        return this;
    }

    public EditLeadDescriptor build() {
        return leadDescriptor;
    }
}
