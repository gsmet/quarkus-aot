package fr.spacefox.perftests.quarkus.rest.endpoint512;

import fr.spacefox.perftests.quarkus.core.service512.model.Model512;
import fr.spacefox.perftests.quarkus.rest.endpoint512.schema.Schema512;

final class Mapper {
    private Mapper() {}

    public static Schema512 of(Model512 model) {
        return new Schema512(model.id(), model.value());
    }
}
