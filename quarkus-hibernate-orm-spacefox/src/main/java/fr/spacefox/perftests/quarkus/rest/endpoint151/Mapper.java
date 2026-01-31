package fr.spacefox.perftests.quarkus.rest.endpoint151;

import fr.spacefox.perftests.quarkus.core.service151.model.Model151;
import fr.spacefox.perftests.quarkus.rest.endpoint151.schema.Schema151;

final class Mapper {
    private Mapper() {}

    public static Schema151 of(Model151 model) {
        return new Schema151(model.id(), model.value());
    }
}
