package fr.spacefox.perftests.quarkus.rest.endpoint247;

import fr.spacefox.perftests.quarkus.core.service247.model.Model247;
import fr.spacefox.perftests.quarkus.rest.endpoint247.schema.Schema247;

final class Mapper {
    private Mapper() {}

    public static Schema247 of(Model247 model) {
        return new Schema247(model.id(), model.value());
    }
}
