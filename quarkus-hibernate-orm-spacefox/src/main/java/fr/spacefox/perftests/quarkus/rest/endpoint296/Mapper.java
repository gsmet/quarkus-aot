package fr.spacefox.perftests.quarkus.rest.endpoint296;

import fr.spacefox.perftests.quarkus.core.service296.model.Model296;
import fr.spacefox.perftests.quarkus.rest.endpoint296.schema.Schema296;

final class Mapper {
    private Mapper() {}

    public static Schema296 of(Model296 model) {
        return new Schema296(model.id(), model.value());
    }
}
