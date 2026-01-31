package fr.spacefox.perftests.quarkus.rest.endpoint679;

import fr.spacefox.perftests.quarkus.core.service679.model.Model679;
import fr.spacefox.perftests.quarkus.rest.endpoint679.schema.Schema679;

final class Mapper {
    private Mapper() {}

    public static Schema679 of(Model679 model) {
        return new Schema679(model.id(), model.value());
    }
}
