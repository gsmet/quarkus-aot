package fr.spacefox.perftests.quarkus.rest.endpoint384;

import fr.spacefox.perftests.quarkus.core.service384.model.Model384;
import fr.spacefox.perftests.quarkus.rest.endpoint384.schema.Schema384;

final class Mapper {
    private Mapper() {}

    public static Schema384 of(Model384 model) {
        return new Schema384(model.id(), model.value());
    }
}
