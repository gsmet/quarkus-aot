package fr.spacefox.perftests.quarkus.rest.endpoint426;

import fr.spacefox.perftests.quarkus.core.service426.model.Model426;
import fr.spacefox.perftests.quarkus.rest.endpoint426.schema.Schema426;

final class Mapper {
    private Mapper() {}

    public static Schema426 of(Model426 model) {
        return new Schema426(model.id(), model.value());
    }
}
