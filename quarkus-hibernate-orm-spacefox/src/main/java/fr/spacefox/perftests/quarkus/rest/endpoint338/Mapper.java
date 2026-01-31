package fr.spacefox.perftests.quarkus.rest.endpoint338;

import fr.spacefox.perftests.quarkus.core.service338.model.Model338;
import fr.spacefox.perftests.quarkus.rest.endpoint338.schema.Schema338;

final class Mapper {
    private Mapper() {}

    public static Schema338 of(Model338 model) {
        return new Schema338(model.id(), model.value());
    }
}
