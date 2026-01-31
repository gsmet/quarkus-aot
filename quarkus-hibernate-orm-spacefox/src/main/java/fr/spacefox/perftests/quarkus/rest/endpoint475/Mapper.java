package fr.spacefox.perftests.quarkus.rest.endpoint475;

import fr.spacefox.perftests.quarkus.core.service475.model.Model475;
import fr.spacefox.perftests.quarkus.rest.endpoint475.schema.Schema475;

final class Mapper {
    private Mapper() {}

    public static Schema475 of(Model475 model) {
        return new Schema475(model.id(), model.value());
    }
}
