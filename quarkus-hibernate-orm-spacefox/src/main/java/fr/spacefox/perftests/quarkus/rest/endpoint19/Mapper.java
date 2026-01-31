package fr.spacefox.perftests.quarkus.rest.endpoint19;

import fr.spacefox.perftests.quarkus.core.service19.model.Model19;
import fr.spacefox.perftests.quarkus.rest.endpoint19.schema.Schema19;

final class Mapper {
    private Mapper() {}

    public static Schema19 of(Model19 model) {
        return new Schema19(model.id(), model.value());
    }
}
