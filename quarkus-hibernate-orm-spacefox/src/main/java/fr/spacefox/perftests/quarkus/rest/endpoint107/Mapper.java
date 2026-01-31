package fr.spacefox.perftests.quarkus.rest.endpoint107;

import fr.spacefox.perftests.quarkus.core.service107.model.Model107;
import fr.spacefox.perftests.quarkus.rest.endpoint107.schema.Schema107;

final class Mapper {
    private Mapper() {}

    public static Schema107 of(Model107 model) {
        return new Schema107(model.id(), model.value());
    }
}
