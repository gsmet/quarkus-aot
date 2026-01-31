package fr.spacefox.perftests.quarkus.rest.endpoint173;

import fr.spacefox.perftests.quarkus.core.service173.model.Model173;
import fr.spacefox.perftests.quarkus.rest.endpoint173.schema.Schema173;

final class Mapper {
    private Mapper() {}

    public static Schema173 of(Model173 model) {
        return new Schema173(model.id(), model.value());
    }
}
