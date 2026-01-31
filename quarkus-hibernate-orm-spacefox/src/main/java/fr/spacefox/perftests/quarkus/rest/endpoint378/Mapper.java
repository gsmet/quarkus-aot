package fr.spacefox.perftests.quarkus.rest.endpoint378;

import fr.spacefox.perftests.quarkus.core.service378.model.Model378;
import fr.spacefox.perftests.quarkus.rest.endpoint378.schema.Schema378;

final class Mapper {
    private Mapper() {}

    public static Schema378 of(Model378 model) {
        return new Schema378(model.id(), model.value());
    }
}
