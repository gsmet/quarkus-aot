package fr.spacefox.perftests.quarkus.rest.endpoint810;

import fr.spacefox.perftests.quarkus.core.service810.model.Model810;
import fr.spacefox.perftests.quarkus.rest.endpoint810.schema.Schema810;

final class Mapper {
    private Mapper() {}

    public static Schema810 of(Model810 model) {
        return new Schema810(model.id(), model.value());
    }
}
