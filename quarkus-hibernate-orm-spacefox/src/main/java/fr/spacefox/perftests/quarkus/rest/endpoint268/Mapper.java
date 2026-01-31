package fr.spacefox.perftests.quarkus.rest.endpoint268;

import fr.spacefox.perftests.quarkus.core.service268.model.Model268;
import fr.spacefox.perftests.quarkus.rest.endpoint268.schema.Schema268;

final class Mapper {
    private Mapper() {}

    public static Schema268 of(Model268 model) {
        return new Schema268(model.id(), model.value());
    }
}
