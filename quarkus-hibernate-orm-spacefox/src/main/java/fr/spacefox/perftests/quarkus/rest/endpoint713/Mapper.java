package fr.spacefox.perftests.quarkus.rest.endpoint713;

import fr.spacefox.perftests.quarkus.core.service713.model.Model713;
import fr.spacefox.perftests.quarkus.rest.endpoint713.schema.Schema713;

final class Mapper {
    private Mapper() {}

    public static Schema713 of(Model713 model) {
        return new Schema713(model.id(), model.value());
    }
}
