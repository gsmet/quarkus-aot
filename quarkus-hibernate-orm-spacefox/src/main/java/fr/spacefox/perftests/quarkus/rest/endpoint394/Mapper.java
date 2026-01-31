package fr.spacefox.perftests.quarkus.rest.endpoint394;

import fr.spacefox.perftests.quarkus.core.service394.model.Model394;
import fr.spacefox.perftests.quarkus.rest.endpoint394.schema.Schema394;

final class Mapper {
    private Mapper() {}

    public static Schema394 of(Model394 model) {
        return new Schema394(model.id(), model.value());
    }
}
