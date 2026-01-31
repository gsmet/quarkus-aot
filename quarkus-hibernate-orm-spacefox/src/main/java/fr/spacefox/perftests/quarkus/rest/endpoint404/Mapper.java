package fr.spacefox.perftests.quarkus.rest.endpoint404;

import fr.spacefox.perftests.quarkus.core.service404.model.Model404;
import fr.spacefox.perftests.quarkus.rest.endpoint404.schema.Schema404;

final class Mapper {
    private Mapper() {}

    public static Schema404 of(Model404 model) {
        return new Schema404(model.id(), model.value());
    }
}
