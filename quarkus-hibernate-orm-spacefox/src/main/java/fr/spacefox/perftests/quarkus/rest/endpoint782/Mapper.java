package fr.spacefox.perftests.quarkus.rest.endpoint782;

import fr.spacefox.perftests.quarkus.core.service782.model.Model782;
import fr.spacefox.perftests.quarkus.rest.endpoint782.schema.Schema782;

final class Mapper {
    private Mapper() {}

    public static Schema782 of(Model782 model) {
        return new Schema782(model.id(), model.value());
    }
}
