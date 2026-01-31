package fr.spacefox.perftests.quarkus.rest.endpoint867;

import fr.spacefox.perftests.quarkus.core.service867.model.Model867;
import fr.spacefox.perftests.quarkus.rest.endpoint867.schema.Schema867;

final class Mapper {
    private Mapper() {}

    public static Schema867 of(Model867 model) {
        return new Schema867(model.id(), model.value());
    }
}
