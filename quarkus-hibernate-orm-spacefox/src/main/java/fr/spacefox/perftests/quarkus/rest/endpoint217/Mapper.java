package fr.spacefox.perftests.quarkus.rest.endpoint217;

import fr.spacefox.perftests.quarkus.core.service217.model.Model217;
import fr.spacefox.perftests.quarkus.rest.endpoint217.schema.Schema217;

final class Mapper {
    private Mapper() {}

    public static Schema217 of(Model217 model) {
        return new Schema217(model.id(), model.value());
    }
}
