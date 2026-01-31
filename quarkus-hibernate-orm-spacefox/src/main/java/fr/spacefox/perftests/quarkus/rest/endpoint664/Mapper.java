package fr.spacefox.perftests.quarkus.rest.endpoint664;

import fr.spacefox.perftests.quarkus.core.service664.model.Model664;
import fr.spacefox.perftests.quarkus.rest.endpoint664.schema.Schema664;

final class Mapper {
    private Mapper() {}

    public static Schema664 of(Model664 model) {
        return new Schema664(model.id(), model.value());
    }
}
