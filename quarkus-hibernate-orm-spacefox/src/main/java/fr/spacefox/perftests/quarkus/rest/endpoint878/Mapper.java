package fr.spacefox.perftests.quarkus.rest.endpoint878;

import fr.spacefox.perftests.quarkus.core.service878.model.Model878;
import fr.spacefox.perftests.quarkus.rest.endpoint878.schema.Schema878;

final class Mapper {
    private Mapper() {}

    public static Schema878 of(Model878 model) {
        return new Schema878(model.id(), model.value());
    }
}
