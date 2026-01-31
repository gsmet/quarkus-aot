package fr.spacefox.perftests.quarkus.rest.endpoint916;

import fr.spacefox.perftests.quarkus.core.service916.model.Model916;
import fr.spacefox.perftests.quarkus.rest.endpoint916.schema.Schema916;

final class Mapper {
    private Mapper() {}

    public static Schema916 of(Model916 model) {
        return new Schema916(model.id(), model.value());
    }
}
