package fr.spacefox.perftests.quarkus.rest.endpoint436;

import fr.spacefox.perftests.quarkus.core.service436.model.Model436;
import fr.spacefox.perftests.quarkus.rest.endpoint436.schema.Schema436;

final class Mapper {
    private Mapper() {}

    public static Schema436 of(Model436 model) {
        return new Schema436(model.id(), model.value());
    }
}
