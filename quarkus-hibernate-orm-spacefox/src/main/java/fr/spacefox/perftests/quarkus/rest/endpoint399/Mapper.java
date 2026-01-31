package fr.spacefox.perftests.quarkus.rest.endpoint399;

import fr.spacefox.perftests.quarkus.core.service399.model.Model399;
import fr.spacefox.perftests.quarkus.rest.endpoint399.schema.Schema399;

final class Mapper {
    private Mapper() {}

    public static Schema399 of(Model399 model) {
        return new Schema399(model.id(), model.value());
    }
}
