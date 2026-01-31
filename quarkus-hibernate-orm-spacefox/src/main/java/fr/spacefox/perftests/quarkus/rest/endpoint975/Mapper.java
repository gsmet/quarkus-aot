package fr.spacefox.perftests.quarkus.rest.endpoint975;

import fr.spacefox.perftests.quarkus.core.service975.model.Model975;
import fr.spacefox.perftests.quarkus.rest.endpoint975.schema.Schema975;

final class Mapper {
    private Mapper() {}

    public static Schema975 of(Model975 model) {
        return new Schema975(model.id(), model.value());
    }
}
