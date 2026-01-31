package fr.spacefox.perftests.quarkus.rest.endpoint279;

import fr.spacefox.perftests.quarkus.core.service279.model.Model279;
import fr.spacefox.perftests.quarkus.rest.endpoint279.schema.Schema279;

final class Mapper {
    private Mapper() {}

    public static Schema279 of(Model279 model) {
        return new Schema279(model.id(), model.value());
    }
}
