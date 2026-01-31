package fr.spacefox.perftests.quarkus.rest.endpoint554;

import fr.spacefox.perftests.quarkus.core.service554.model.Model554;
import fr.spacefox.perftests.quarkus.rest.endpoint554.schema.Schema554;

final class Mapper {
    private Mapper() {}

    public static Schema554 of(Model554 model) {
        return new Schema554(model.id(), model.value());
    }
}
