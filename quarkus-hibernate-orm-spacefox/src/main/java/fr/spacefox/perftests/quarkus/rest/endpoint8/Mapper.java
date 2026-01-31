package fr.spacefox.perftests.quarkus.rest.endpoint8;

import fr.spacefox.perftests.quarkus.core.service8.model.Model8;
import fr.spacefox.perftests.quarkus.rest.endpoint8.schema.Schema8;

final class Mapper {
    private Mapper() {}

    public static Schema8 of(Model8 model) {
        return new Schema8(model.id(), model.value());
    }
}
