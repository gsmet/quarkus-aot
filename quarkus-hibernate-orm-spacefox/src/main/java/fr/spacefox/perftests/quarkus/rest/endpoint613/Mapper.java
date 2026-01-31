package fr.spacefox.perftests.quarkus.rest.endpoint613;

import fr.spacefox.perftests.quarkus.core.service613.model.Model613;
import fr.spacefox.perftests.quarkus.rest.endpoint613.schema.Schema613;

final class Mapper {
    private Mapper() {}

    public static Schema613 of(Model613 model) {
        return new Schema613(model.id(), model.value());
    }
}
