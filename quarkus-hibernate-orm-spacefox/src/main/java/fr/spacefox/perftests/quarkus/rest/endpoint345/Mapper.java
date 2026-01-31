package fr.spacefox.perftests.quarkus.rest.endpoint345;

import fr.spacefox.perftests.quarkus.core.service345.model.Model345;
import fr.spacefox.perftests.quarkus.rest.endpoint345.schema.Schema345;

final class Mapper {
    private Mapper() {}

    public static Schema345 of(Model345 model) {
        return new Schema345(model.id(), model.value());
    }
}
