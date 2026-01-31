package fr.spacefox.perftests.quarkus.rest.endpoint626;

import fr.spacefox.perftests.quarkus.core.service626.model.Model626;
import fr.spacefox.perftests.quarkus.rest.endpoint626.schema.Schema626;

final class Mapper {
    private Mapper() {}

    public static Schema626 of(Model626 model) {
        return new Schema626(model.id(), model.value());
    }
}
