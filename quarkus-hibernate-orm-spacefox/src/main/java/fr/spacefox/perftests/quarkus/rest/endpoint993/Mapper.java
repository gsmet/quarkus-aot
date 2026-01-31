package fr.spacefox.perftests.quarkus.rest.endpoint993;

import fr.spacefox.perftests.quarkus.core.service993.model.Model993;
import fr.spacefox.perftests.quarkus.rest.endpoint993.schema.Schema993;

final class Mapper {
    private Mapper() {}

    public static Schema993 of(Model993 model) {
        return new Schema993(model.id(), model.value());
    }
}
