package fr.spacefox.perftests.quarkus.rest.endpoint413;

import fr.spacefox.perftests.quarkus.core.service413.model.Model413;
import fr.spacefox.perftests.quarkus.rest.endpoint413.schema.Schema413;

final class Mapper {
    private Mapper() {}

    public static Schema413 of(Model413 model) {
        return new Schema413(model.id(), model.value());
    }
}
