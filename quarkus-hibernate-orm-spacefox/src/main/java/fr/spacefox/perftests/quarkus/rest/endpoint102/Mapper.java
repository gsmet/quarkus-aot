package fr.spacefox.perftests.quarkus.rest.endpoint102;

import fr.spacefox.perftests.quarkus.core.service102.model.Model102;
import fr.spacefox.perftests.quarkus.rest.endpoint102.schema.Schema102;

final class Mapper {
    private Mapper() {}

    public static Schema102 of(Model102 model) {
        return new Schema102(model.id(), model.value());
    }
}
