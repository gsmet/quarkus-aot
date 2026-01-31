package fr.spacefox.perftests.quarkus.rest.endpoint511;

import fr.spacefox.perftests.quarkus.core.service511.model.Model511;
import fr.spacefox.perftests.quarkus.rest.endpoint511.schema.Schema511;

final class Mapper {
    private Mapper() {}

    public static Schema511 of(Model511 model) {
        return new Schema511(model.id(), model.value());
    }
}
