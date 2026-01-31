package fr.spacefox.perftests.quarkus.rest.endpoint717;

import fr.spacefox.perftests.quarkus.core.service717.model.Model717;
import fr.spacefox.perftests.quarkus.rest.endpoint717.schema.Schema717;

final class Mapper {
    private Mapper() {}

    public static Schema717 of(Model717 model) {
        return new Schema717(model.id(), model.value());
    }
}
