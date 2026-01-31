package fr.spacefox.perftests.quarkus.rest.endpoint889;

import fr.spacefox.perftests.quarkus.core.service889.model.Model889;
import fr.spacefox.perftests.quarkus.rest.endpoint889.schema.Schema889;

final class Mapper {
    private Mapper() {}

    public static Schema889 of(Model889 model) {
        return new Schema889(model.id(), model.value());
    }
}
