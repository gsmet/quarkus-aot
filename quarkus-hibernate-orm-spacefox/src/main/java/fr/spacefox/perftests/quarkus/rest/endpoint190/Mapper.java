package fr.spacefox.perftests.quarkus.rest.endpoint190;

import fr.spacefox.perftests.quarkus.core.service190.model.Model190;
import fr.spacefox.perftests.quarkus.rest.endpoint190.schema.Schema190;

final class Mapper {
    private Mapper() {}

    public static Schema190 of(Model190 model) {
        return new Schema190(model.id(), model.value());
    }
}
