package fr.spacefox.perftests.quarkus.rest.endpoint849;

import fr.spacefox.perftests.quarkus.core.service849.model.Model849;
import fr.spacefox.perftests.quarkus.rest.endpoint849.schema.Schema849;

final class Mapper {
    private Mapper() {}

    public static Schema849 of(Model849 model) {
        return new Schema849(model.id(), model.value());
    }
}
