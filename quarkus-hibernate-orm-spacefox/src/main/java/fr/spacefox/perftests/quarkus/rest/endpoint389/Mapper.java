package fr.spacefox.perftests.quarkus.rest.endpoint389;

import fr.spacefox.perftests.quarkus.core.service389.model.Model389;
import fr.spacefox.perftests.quarkus.rest.endpoint389.schema.Schema389;

final class Mapper {
    private Mapper() {}

    public static Schema389 of(Model389 model) {
        return new Schema389(model.id(), model.value());
    }
}
