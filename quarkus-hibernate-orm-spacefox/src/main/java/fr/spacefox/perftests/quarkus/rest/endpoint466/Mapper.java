package fr.spacefox.perftests.quarkus.rest.endpoint466;

import fr.spacefox.perftests.quarkus.core.service466.model.Model466;
import fr.spacefox.perftests.quarkus.rest.endpoint466.schema.Schema466;

final class Mapper {
    private Mapper() {}

    public static Schema466 of(Model466 model) {
        return new Schema466(model.id(), model.value());
    }
}
