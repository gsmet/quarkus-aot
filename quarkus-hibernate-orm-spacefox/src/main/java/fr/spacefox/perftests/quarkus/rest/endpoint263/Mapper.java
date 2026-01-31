package fr.spacefox.perftests.quarkus.rest.endpoint263;

import fr.spacefox.perftests.quarkus.core.service263.model.Model263;
import fr.spacefox.perftests.quarkus.rest.endpoint263.schema.Schema263;

final class Mapper {
    private Mapper() {}

    public static Schema263 of(Model263 model) {
        return new Schema263(model.id(), model.value());
    }
}
