package fr.spacefox.perftests.quarkus.rest.endpoint12;

import fr.spacefox.perftests.quarkus.core.service12.model.Model12;
import fr.spacefox.perftests.quarkus.rest.endpoint12.schema.Schema12;

final class Mapper {
    private Mapper() {}

    public static Schema12 of(Model12 model) {
        return new Schema12(model.id(), model.value());
    }
}
