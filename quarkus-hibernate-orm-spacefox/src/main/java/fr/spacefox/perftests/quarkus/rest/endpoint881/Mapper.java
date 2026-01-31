package fr.spacefox.perftests.quarkus.rest.endpoint881;

import fr.spacefox.perftests.quarkus.core.service881.model.Model881;
import fr.spacefox.perftests.quarkus.rest.endpoint881.schema.Schema881;

final class Mapper {
    private Mapper() {}

    public static Schema881 of(Model881 model) {
        return new Schema881(model.id(), model.value());
    }
}
