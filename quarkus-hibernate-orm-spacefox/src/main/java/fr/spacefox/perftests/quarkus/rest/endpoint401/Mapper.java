package fr.spacefox.perftests.quarkus.rest.endpoint401;

import fr.spacefox.perftests.quarkus.core.service401.model.Model401;
import fr.spacefox.perftests.quarkus.rest.endpoint401.schema.Schema401;

final class Mapper {
    private Mapper() {}

    public static Schema401 of(Model401 model) {
        return new Schema401(model.id(), model.value());
    }
}
