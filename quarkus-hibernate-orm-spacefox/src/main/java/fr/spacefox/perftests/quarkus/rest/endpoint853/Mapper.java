package fr.spacefox.perftests.quarkus.rest.endpoint853;

import fr.spacefox.perftests.quarkus.core.service853.model.Model853;
import fr.spacefox.perftests.quarkus.rest.endpoint853.schema.Schema853;

final class Mapper {
    private Mapper() {}

    public static Schema853 of(Model853 model) {
        return new Schema853(model.id(), model.value());
    }
}
