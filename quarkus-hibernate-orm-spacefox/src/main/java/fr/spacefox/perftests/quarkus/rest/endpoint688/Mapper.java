package fr.spacefox.perftests.quarkus.rest.endpoint688;

import fr.spacefox.perftests.quarkus.core.service688.model.Model688;
import fr.spacefox.perftests.quarkus.rest.endpoint688.schema.Schema688;

final class Mapper {
    private Mapper() {}

    public static Schema688 of(Model688 model) {
        return new Schema688(model.id(), model.value());
    }
}
