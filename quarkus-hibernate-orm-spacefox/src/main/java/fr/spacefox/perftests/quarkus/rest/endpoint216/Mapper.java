package fr.spacefox.perftests.quarkus.rest.endpoint216;

import fr.spacefox.perftests.quarkus.core.service216.model.Model216;
import fr.spacefox.perftests.quarkus.rest.endpoint216.schema.Schema216;

final class Mapper {
    private Mapper() {}

    public static Schema216 of(Model216 model) {
        return new Schema216(model.id(), model.value());
    }
}
