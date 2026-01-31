package fr.spacefox.perftests.quarkus.rest.endpoint134;

import fr.spacefox.perftests.quarkus.core.service134.model.Model134;
import fr.spacefox.perftests.quarkus.rest.endpoint134.schema.Schema134;

final class Mapper {
    private Mapper() {}

    public static Schema134 of(Model134 model) {
        return new Schema134(model.id(), model.value());
    }
}
