package fr.spacefox.perftests.quarkus.rest.endpoint69;

import fr.spacefox.perftests.quarkus.core.service69.model.Model69;
import fr.spacefox.perftests.quarkus.rest.endpoint69.schema.Schema69;

final class Mapper {
    private Mapper() {}

    public static Schema69 of(Model69 model) {
        return new Schema69(model.id(), model.value());
    }
}
