package fr.spacefox.perftests.quarkus.rest.endpoint233;

import fr.spacefox.perftests.quarkus.core.service233.model.Model233;
import fr.spacefox.perftests.quarkus.rest.endpoint233.schema.Schema233;

final class Mapper {
    private Mapper() {}

    public static Schema233 of(Model233 model) {
        return new Schema233(model.id(), model.value());
    }
}
