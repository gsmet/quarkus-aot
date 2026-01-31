package fr.spacefox.perftests.quarkus.rest.endpoint865;

import fr.spacefox.perftests.quarkus.core.service865.model.Model865;
import fr.spacefox.perftests.quarkus.rest.endpoint865.schema.Schema865;

final class Mapper {
    private Mapper() {}

    public static Schema865 of(Model865 model) {
        return new Schema865(model.id(), model.value());
    }
}
