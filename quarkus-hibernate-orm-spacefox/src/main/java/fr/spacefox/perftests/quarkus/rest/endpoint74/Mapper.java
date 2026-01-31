package fr.spacefox.perftests.quarkus.rest.endpoint74;

import fr.spacefox.perftests.quarkus.core.service74.model.Model74;
import fr.spacefox.perftests.quarkus.rest.endpoint74.schema.Schema74;

final class Mapper {
    private Mapper() {}

    public static Schema74 of(Model74 model) {
        return new Schema74(model.id(), model.value());
    }
}
