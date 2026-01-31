package fr.spacefox.perftests.quarkus.rest.endpoint45;

import fr.spacefox.perftests.quarkus.core.service45.model.Model45;
import fr.spacefox.perftests.quarkus.rest.endpoint45.schema.Schema45;

final class Mapper {
    private Mapper() {}

    public static Schema45 of(Model45 model) {
        return new Schema45(model.id(), model.value());
    }
}
