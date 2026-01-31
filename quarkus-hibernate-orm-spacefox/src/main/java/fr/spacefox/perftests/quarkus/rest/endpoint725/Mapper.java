package fr.spacefox.perftests.quarkus.rest.endpoint725;

import fr.spacefox.perftests.quarkus.core.service725.model.Model725;
import fr.spacefox.perftests.quarkus.rest.endpoint725.schema.Schema725;

final class Mapper {
    private Mapper() {}

    public static Schema725 of(Model725 model) {
        return new Schema725(model.id(), model.value());
    }
}
