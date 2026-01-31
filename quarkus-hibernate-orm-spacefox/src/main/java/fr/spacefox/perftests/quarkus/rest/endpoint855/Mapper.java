package fr.spacefox.perftests.quarkus.rest.endpoint855;

import fr.spacefox.perftests.quarkus.core.service855.model.Model855;
import fr.spacefox.perftests.quarkus.rest.endpoint855.schema.Schema855;

final class Mapper {
    private Mapper() {}

    public static Schema855 of(Model855 model) {
        return new Schema855(model.id(), model.value());
    }
}
