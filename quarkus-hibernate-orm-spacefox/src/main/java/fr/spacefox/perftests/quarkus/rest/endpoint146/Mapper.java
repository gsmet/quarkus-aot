package fr.spacefox.perftests.quarkus.rest.endpoint146;

import fr.spacefox.perftests.quarkus.core.service146.model.Model146;
import fr.spacefox.perftests.quarkus.rest.endpoint146.schema.Schema146;

final class Mapper {
    private Mapper() {}

    public static Schema146 of(Model146 model) {
        return new Schema146(model.id(), model.value());
    }
}
