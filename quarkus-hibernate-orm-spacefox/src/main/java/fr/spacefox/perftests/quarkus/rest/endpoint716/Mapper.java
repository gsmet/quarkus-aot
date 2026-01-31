package fr.spacefox.perftests.quarkus.rest.endpoint716;

import fr.spacefox.perftests.quarkus.core.service716.model.Model716;
import fr.spacefox.perftests.quarkus.rest.endpoint716.schema.Schema716;

final class Mapper {
    private Mapper() {}

    public static Schema716 of(Model716 model) {
        return new Schema716(model.id(), model.value());
    }
}
