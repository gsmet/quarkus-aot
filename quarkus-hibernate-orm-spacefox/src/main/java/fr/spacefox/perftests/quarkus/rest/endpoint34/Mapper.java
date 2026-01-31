package fr.spacefox.perftests.quarkus.rest.endpoint34;

import fr.spacefox.perftests.quarkus.core.service34.model.Model34;
import fr.spacefox.perftests.quarkus.rest.endpoint34.schema.Schema34;

final class Mapper {
    private Mapper() {}

    public static Schema34 of(Model34 model) {
        return new Schema34(model.id(), model.value());
    }
}
