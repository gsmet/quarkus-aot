package fr.spacefox.perftests.quarkus.rest.endpoint896;

import fr.spacefox.perftests.quarkus.core.service896.model.Model896;
import fr.spacefox.perftests.quarkus.rest.endpoint896.schema.Schema896;

final class Mapper {
    private Mapper() {}

    public static Schema896 of(Model896 model) {
        return new Schema896(model.id(), model.value());
    }
}
