package fr.spacefox.perftests.quarkus.rest.endpoint847;

import fr.spacefox.perftests.quarkus.core.service847.model.Model847;
import fr.spacefox.perftests.quarkus.rest.endpoint847.schema.Schema847;

final class Mapper {
    private Mapper() {}

    public static Schema847 of(Model847 model) {
        return new Schema847(model.id(), model.value());
    }
}
