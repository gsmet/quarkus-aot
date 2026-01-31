package fr.spacefox.perftests.quarkus.rest.endpoint959;

import fr.spacefox.perftests.quarkus.core.service959.model.Model959;
import fr.spacefox.perftests.quarkus.rest.endpoint959.schema.Schema959;

final class Mapper {
    private Mapper() {}

    public static Schema959 of(Model959 model) {
        return new Schema959(model.id(), model.value());
    }
}
