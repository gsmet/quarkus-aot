package fr.spacefox.perftests.quarkus.rest.endpoint497;

import fr.spacefox.perftests.quarkus.core.service497.model.Model497;
import fr.spacefox.perftests.quarkus.rest.endpoint497.schema.Schema497;

final class Mapper {
    private Mapper() {}

    public static Schema497 of(Model497 model) {
        return new Schema497(model.id(), model.value());
    }
}
