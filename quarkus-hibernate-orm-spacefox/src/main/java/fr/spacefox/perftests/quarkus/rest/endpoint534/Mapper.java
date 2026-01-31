package fr.spacefox.perftests.quarkus.rest.endpoint534;

import fr.spacefox.perftests.quarkus.core.service534.model.Model534;
import fr.spacefox.perftests.quarkus.rest.endpoint534.schema.Schema534;

final class Mapper {
    private Mapper() {}

    public static Schema534 of(Model534 model) {
        return new Schema534(model.id(), model.value());
    }
}
