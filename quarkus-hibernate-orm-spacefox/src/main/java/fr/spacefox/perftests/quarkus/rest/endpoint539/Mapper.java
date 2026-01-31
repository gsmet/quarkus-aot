package fr.spacefox.perftests.quarkus.rest.endpoint539;

import fr.spacefox.perftests.quarkus.core.service539.model.Model539;
import fr.spacefox.perftests.quarkus.rest.endpoint539.schema.Schema539;

final class Mapper {
    private Mapper() {}

    public static Schema539 of(Model539 model) {
        return new Schema539(model.id(), model.value());
    }
}
