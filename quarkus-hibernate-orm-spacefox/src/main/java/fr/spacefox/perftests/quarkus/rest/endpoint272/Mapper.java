package fr.spacefox.perftests.quarkus.rest.endpoint272;

import fr.spacefox.perftests.quarkus.core.service272.model.Model272;
import fr.spacefox.perftests.quarkus.rest.endpoint272.schema.Schema272;

final class Mapper {
    private Mapper() {}

    public static Schema272 of(Model272 model) {
        return new Schema272(model.id(), model.value());
    }
}
