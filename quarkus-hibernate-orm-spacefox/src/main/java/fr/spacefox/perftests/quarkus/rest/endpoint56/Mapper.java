package fr.spacefox.perftests.quarkus.rest.endpoint56;

import fr.spacefox.perftests.quarkus.core.service56.model.Model56;
import fr.spacefox.perftests.quarkus.rest.endpoint56.schema.Schema56;

final class Mapper {
    private Mapper() {}

    public static Schema56 of(Model56 model) {
        return new Schema56(model.id(), model.value());
    }
}
