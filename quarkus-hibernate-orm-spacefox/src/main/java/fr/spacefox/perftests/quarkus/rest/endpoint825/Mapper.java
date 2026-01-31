package fr.spacefox.perftests.quarkus.rest.endpoint825;

import fr.spacefox.perftests.quarkus.core.service825.model.Model825;
import fr.spacefox.perftests.quarkus.rest.endpoint825.schema.Schema825;

final class Mapper {
    private Mapper() {}

    public static Schema825 of(Model825 model) {
        return new Schema825(model.id(), model.value());
    }
}
