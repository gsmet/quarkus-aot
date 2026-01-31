package fr.spacefox.perftests.quarkus.rest.endpoint994;

import fr.spacefox.perftests.quarkus.core.service994.model.Model994;
import fr.spacefox.perftests.quarkus.rest.endpoint994.schema.Schema994;

final class Mapper {
    private Mapper() {}

    public static Schema994 of(Model994 model) {
        return new Schema994(model.id(), model.value());
    }
}
