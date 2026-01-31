package fr.spacefox.perftests.quarkus.rest.endpoint579;

import fr.spacefox.perftests.quarkus.core.service579.model.Model579;
import fr.spacefox.perftests.quarkus.rest.endpoint579.schema.Schema579;

final class Mapper {
    private Mapper() {}

    public static Schema579 of(Model579 model) {
        return new Schema579(model.id(), model.value());
    }
}
