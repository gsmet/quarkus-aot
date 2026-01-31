package fr.spacefox.perftests.quarkus.rest.endpoint90;

import fr.spacefox.perftests.quarkus.core.service90.model.Model90;
import fr.spacefox.perftests.quarkus.rest.endpoint90.schema.Schema90;

final class Mapper {
    private Mapper() {}

    public static Schema90 of(Model90 model) {
        return new Schema90(model.id(), model.value());
    }
}
