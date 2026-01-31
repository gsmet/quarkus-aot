package fr.spacefox.perftests.quarkus.rest.endpoint425;

import fr.spacefox.perftests.quarkus.core.service425.model.Model425;
import fr.spacefox.perftests.quarkus.rest.endpoint425.schema.Schema425;

final class Mapper {
    private Mapper() {}

    public static Schema425 of(Model425 model) {
        return new Schema425(model.id(), model.value());
    }
}
