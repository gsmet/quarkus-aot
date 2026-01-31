package fr.spacefox.perftests.quarkus.rest.endpoint187;

import fr.spacefox.perftests.quarkus.core.service187.model.Model187;
import fr.spacefox.perftests.quarkus.rest.endpoint187.schema.Schema187;

final class Mapper {
    private Mapper() {}

    public static Schema187 of(Model187 model) {
        return new Schema187(model.id(), model.value());
    }
}
