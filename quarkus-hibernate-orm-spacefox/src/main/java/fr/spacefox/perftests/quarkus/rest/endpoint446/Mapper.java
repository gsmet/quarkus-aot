package fr.spacefox.perftests.quarkus.rest.endpoint446;

import fr.spacefox.perftests.quarkus.core.service446.model.Model446;
import fr.spacefox.perftests.quarkus.rest.endpoint446.schema.Schema446;

final class Mapper {
    private Mapper() {}

    public static Schema446 of(Model446 model) {
        return new Schema446(model.id(), model.value());
    }
}
