package fr.spacefox.perftests.quarkus.rest.endpoint437;

import fr.spacefox.perftests.quarkus.core.service437.model.Model437;
import fr.spacefox.perftests.quarkus.rest.endpoint437.schema.Schema437;

final class Mapper {
    private Mapper() {}

    public static Schema437 of(Model437 model) {
        return new Schema437(model.id(), model.value());
    }
}
