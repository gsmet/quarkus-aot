package fr.spacefox.perftests.quarkus.rest.endpoint699;

import fr.spacefox.perftests.quarkus.core.service699.model.Model699;
import fr.spacefox.perftests.quarkus.rest.endpoint699.schema.Schema699;

final class Mapper {
    private Mapper() {}

    public static Schema699 of(Model699 model) {
        return new Schema699(model.id(), model.value());
    }
}
