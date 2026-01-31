package fr.spacefox.perftests.quarkus.rest.endpoint691;

import fr.spacefox.perftests.quarkus.core.service691.model.Model691;
import fr.spacefox.perftests.quarkus.rest.endpoint691.schema.Schema691;

final class Mapper {
    private Mapper() {}

    public static Schema691 of(Model691 model) {
        return new Schema691(model.id(), model.value());
    }
}
