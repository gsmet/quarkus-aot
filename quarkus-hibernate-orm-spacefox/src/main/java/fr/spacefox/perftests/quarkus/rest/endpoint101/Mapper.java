package fr.spacefox.perftests.quarkus.rest.endpoint101;

import fr.spacefox.perftests.quarkus.core.service101.model.Model101;
import fr.spacefox.perftests.quarkus.rest.endpoint101.schema.Schema101;

final class Mapper {
    private Mapper() {}

    public static Schema101 of(Model101 model) {
        return new Schema101(model.id(), model.value());
    }
}
