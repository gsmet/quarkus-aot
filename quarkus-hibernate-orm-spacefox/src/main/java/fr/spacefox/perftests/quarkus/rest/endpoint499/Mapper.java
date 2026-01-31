package fr.spacefox.perftests.quarkus.rest.endpoint499;

import fr.spacefox.perftests.quarkus.core.service499.model.Model499;
import fr.spacefox.perftests.quarkus.rest.endpoint499.schema.Schema499;

final class Mapper {
    private Mapper() {}

    public static Schema499 of(Model499 model) {
        return new Schema499(model.id(), model.value());
    }
}
