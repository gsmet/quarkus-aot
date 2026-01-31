package fr.spacefox.perftests.quarkus.rest.endpoint359;

import fr.spacefox.perftests.quarkus.core.service359.model.Model359;
import fr.spacefox.perftests.quarkus.rest.endpoint359.schema.Schema359;

final class Mapper {
    private Mapper() {}

    public static Schema359 of(Model359 model) {
        return new Schema359(model.id(), model.value());
    }
}
