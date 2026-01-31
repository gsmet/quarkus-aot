package fr.spacefox.perftests.quarkus.rest.endpoint227;

import fr.spacefox.perftests.quarkus.core.service227.model.Model227;
import fr.spacefox.perftests.quarkus.rest.endpoint227.schema.Schema227;

final class Mapper {
    private Mapper() {}

    public static Schema227 of(Model227 model) {
        return new Schema227(model.id(), model.value());
    }
}
