package fr.spacefox.perftests.quarkus.rest.endpoint616;

import fr.spacefox.perftests.quarkus.core.service616.model.Model616;
import fr.spacefox.perftests.quarkus.rest.endpoint616.schema.Schema616;

final class Mapper {
    private Mapper() {}

    public static Schema616 of(Model616 model) {
        return new Schema616(model.id(), model.value());
    }
}
