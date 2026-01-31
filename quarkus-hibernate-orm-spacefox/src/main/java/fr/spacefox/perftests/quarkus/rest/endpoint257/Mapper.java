package fr.spacefox.perftests.quarkus.rest.endpoint257;

import fr.spacefox.perftests.quarkus.core.service257.model.Model257;
import fr.spacefox.perftests.quarkus.rest.endpoint257.schema.Schema257;

final class Mapper {
    private Mapper() {}

    public static Schema257 of(Model257 model) {
        return new Schema257(model.id(), model.value());
    }
}
