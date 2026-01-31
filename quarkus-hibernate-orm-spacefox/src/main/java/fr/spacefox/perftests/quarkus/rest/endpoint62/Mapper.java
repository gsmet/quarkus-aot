package fr.spacefox.perftests.quarkus.rest.endpoint62;

import fr.spacefox.perftests.quarkus.core.service62.model.Model62;
import fr.spacefox.perftests.quarkus.rest.endpoint62.schema.Schema62;

final class Mapper {
    private Mapper() {}

    public static Schema62 of(Model62 model) {
        return new Schema62(model.id(), model.value());
    }
}
