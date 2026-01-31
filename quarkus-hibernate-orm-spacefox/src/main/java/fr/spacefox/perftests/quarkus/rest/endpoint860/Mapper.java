package fr.spacefox.perftests.quarkus.rest.endpoint860;

import fr.spacefox.perftests.quarkus.core.service860.model.Model860;
import fr.spacefox.perftests.quarkus.rest.endpoint860.schema.Schema860;

final class Mapper {
    private Mapper() {}

    public static Schema860 of(Model860 model) {
        return new Schema860(model.id(), model.value());
    }
}
