package fr.spacefox.perftests.quarkus.rest.endpoint815;

import fr.spacefox.perftests.quarkus.core.service815.model.Model815;
import fr.spacefox.perftests.quarkus.rest.endpoint815.schema.Schema815;

final class Mapper {
    private Mapper() {}

    public static Schema815 of(Model815 model) {
        return new Schema815(model.id(), model.value());
    }
}
