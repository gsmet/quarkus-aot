package fr.spacefox.perftests.quarkus.rest.endpoint748;

import fr.spacefox.perftests.quarkus.core.service748.model.Model748;
import fr.spacefox.perftests.quarkus.rest.endpoint748.schema.Schema748;

final class Mapper {
    private Mapper() {}

    public static Schema748 of(Model748 model) {
        return new Schema748(model.id(), model.value());
    }
}
