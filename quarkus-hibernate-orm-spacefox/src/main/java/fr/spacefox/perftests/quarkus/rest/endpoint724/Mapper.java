package fr.spacefox.perftests.quarkus.rest.endpoint724;

import fr.spacefox.perftests.quarkus.core.service724.model.Model724;
import fr.spacefox.perftests.quarkus.rest.endpoint724.schema.Schema724;

final class Mapper {
    private Mapper() {}

    public static Schema724 of(Model724 model) {
        return new Schema724(model.id(), model.value());
    }
}
