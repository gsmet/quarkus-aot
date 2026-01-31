package fr.spacefox.perftests.quarkus.rest.endpoint431;

import fr.spacefox.perftests.quarkus.core.service431.model.Model431;
import fr.spacefox.perftests.quarkus.rest.endpoint431.schema.Schema431;

final class Mapper {
    private Mapper() {}

    public static Schema431 of(Model431 model) {
        return new Schema431(model.id(), model.value());
    }
}
