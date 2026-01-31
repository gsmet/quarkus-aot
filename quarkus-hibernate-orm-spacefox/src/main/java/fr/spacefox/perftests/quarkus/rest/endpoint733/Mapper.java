package fr.spacefox.perftests.quarkus.rest.endpoint733;

import fr.spacefox.perftests.quarkus.core.service733.model.Model733;
import fr.spacefox.perftests.quarkus.rest.endpoint733.schema.Schema733;

final class Mapper {
    private Mapper() {}

    public static Schema733 of(Model733 model) {
        return new Schema733(model.id(), model.value());
    }
}
