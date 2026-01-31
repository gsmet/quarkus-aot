package fr.spacefox.perftests.quarkus.rest.endpoint214;

import fr.spacefox.perftests.quarkus.core.service214.model.Model214;
import fr.spacefox.perftests.quarkus.rest.endpoint214.schema.Schema214;

final class Mapper {
    private Mapper() {}

    public static Schema214 of(Model214 model) {
        return new Schema214(model.id(), model.value());
    }
}
