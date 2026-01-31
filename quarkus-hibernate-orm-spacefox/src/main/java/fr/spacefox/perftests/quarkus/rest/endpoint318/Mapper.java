package fr.spacefox.perftests.quarkus.rest.endpoint318;

import fr.spacefox.perftests.quarkus.core.service318.model.Model318;
import fr.spacefox.perftests.quarkus.rest.endpoint318.schema.Schema318;

final class Mapper {
    private Mapper() {}

    public static Schema318 of(Model318 model) {
        return new Schema318(model.id(), model.value());
    }
}
