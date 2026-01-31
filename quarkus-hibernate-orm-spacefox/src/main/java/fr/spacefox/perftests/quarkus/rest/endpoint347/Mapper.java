package fr.spacefox.perftests.quarkus.rest.endpoint347;

import fr.spacefox.perftests.quarkus.core.service347.model.Model347;
import fr.spacefox.perftests.quarkus.rest.endpoint347.schema.Schema347;

final class Mapper {
    private Mapper() {}

    public static Schema347 of(Model347 model) {
        return new Schema347(model.id(), model.value());
    }
}
