package fr.spacefox.perftests.quarkus.rest.endpoint114;

import fr.spacefox.perftests.quarkus.core.service114.model.Model114;
import fr.spacefox.perftests.quarkus.rest.endpoint114.schema.Schema114;

final class Mapper {
    private Mapper() {}

    public static Schema114 of(Model114 model) {
        return new Schema114(model.id(), model.value());
    }
}
