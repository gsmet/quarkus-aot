package fr.spacefox.perftests.quarkus.rest.endpoint299;

import fr.spacefox.perftests.quarkus.core.service299.model.Model299;
import fr.spacefox.perftests.quarkus.rest.endpoint299.schema.Schema299;

final class Mapper {
    private Mapper() {}

    public static Schema299 of(Model299 model) {
        return new Schema299(model.id(), model.value());
    }
}
