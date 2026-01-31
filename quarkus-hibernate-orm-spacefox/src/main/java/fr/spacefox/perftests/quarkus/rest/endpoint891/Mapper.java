package fr.spacefox.perftests.quarkus.rest.endpoint891;

import fr.spacefox.perftests.quarkus.core.service891.model.Model891;
import fr.spacefox.perftests.quarkus.rest.endpoint891.schema.Schema891;

final class Mapper {
    private Mapper() {}

    public static Schema891 of(Model891 model) {
        return new Schema891(model.id(), model.value());
    }
}
