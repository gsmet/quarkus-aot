package fr.spacefox.perftests.quarkus.rest.endpoint952;

import fr.spacefox.perftests.quarkus.core.service952.model.Model952;
import fr.spacefox.perftests.quarkus.rest.endpoint952.schema.Schema952;

final class Mapper {
    private Mapper() {}

    public static Schema952 of(Model952 model) {
        return new Schema952(model.id(), model.value());
    }
}
