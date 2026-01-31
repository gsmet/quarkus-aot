package fr.spacefox.perftests.quarkus.rest.endpoint566;

import fr.spacefox.perftests.quarkus.core.service566.model.Model566;
import fr.spacefox.perftests.quarkus.rest.endpoint566.schema.Schema566;

final class Mapper {
    private Mapper() {}

    public static Schema566 of(Model566 model) {
        return new Schema566(model.id(), model.value());
    }
}
