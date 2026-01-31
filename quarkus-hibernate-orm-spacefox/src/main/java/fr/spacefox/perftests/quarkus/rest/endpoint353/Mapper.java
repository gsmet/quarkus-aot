package fr.spacefox.perftests.quarkus.rest.endpoint353;

import fr.spacefox.perftests.quarkus.core.service353.model.Model353;
import fr.spacefox.perftests.quarkus.rest.endpoint353.schema.Schema353;

final class Mapper {
    private Mapper() {}

    public static Schema353 of(Model353 model) {
        return new Schema353(model.id(), model.value());
    }
}
