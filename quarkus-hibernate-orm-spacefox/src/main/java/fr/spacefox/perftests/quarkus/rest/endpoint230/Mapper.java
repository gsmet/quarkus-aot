package fr.spacefox.perftests.quarkus.rest.endpoint230;

import fr.spacefox.perftests.quarkus.core.service230.model.Model230;
import fr.spacefox.perftests.quarkus.rest.endpoint230.schema.Schema230;

final class Mapper {
    private Mapper() {}

    public static Schema230 of(Model230 model) {
        return new Schema230(model.id(), model.value());
    }
}
