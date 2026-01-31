package fr.spacefox.perftests.quarkus.rest.endpoint457;

import fr.spacefox.perftests.quarkus.core.service457.model.Model457;
import fr.spacefox.perftests.quarkus.rest.endpoint457.schema.Schema457;

final class Mapper {
    private Mapper() {}

    public static Schema457 of(Model457 model) {
        return new Schema457(model.id(), model.value());
    }
}
