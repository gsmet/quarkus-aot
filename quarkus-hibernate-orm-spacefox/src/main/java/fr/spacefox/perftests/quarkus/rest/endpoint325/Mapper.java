package fr.spacefox.perftests.quarkus.rest.endpoint325;

import fr.spacefox.perftests.quarkus.core.service325.model.Model325;
import fr.spacefox.perftests.quarkus.rest.endpoint325.schema.Schema325;

final class Mapper {
    private Mapper() {}

    public static Schema325 of(Model325 model) {
        return new Schema325(model.id(), model.value());
    }
}
