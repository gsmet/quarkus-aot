package fr.spacefox.perftests.quarkus.rest.endpoint619;

import fr.spacefox.perftests.quarkus.core.service619.model.Model619;
import fr.spacefox.perftests.quarkus.rest.endpoint619.schema.Schema619;

final class Mapper {
    private Mapper() {}

    public static Schema619 of(Model619 model) {
        return new Schema619(model.id(), model.value());
    }
}
