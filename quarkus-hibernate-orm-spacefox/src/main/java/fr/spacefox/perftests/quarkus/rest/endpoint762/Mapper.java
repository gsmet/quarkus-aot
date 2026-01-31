package fr.spacefox.perftests.quarkus.rest.endpoint762;

import fr.spacefox.perftests.quarkus.core.service762.model.Model762;
import fr.spacefox.perftests.quarkus.rest.endpoint762.schema.Schema762;

final class Mapper {
    private Mapper() {}

    public static Schema762 of(Model762 model) {
        return new Schema762(model.id(), model.value());
    }
}
