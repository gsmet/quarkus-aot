package fr.spacefox.perftests.quarkus.rest.endpoint850;

import fr.spacefox.perftests.quarkus.core.service850.model.Model850;
import fr.spacefox.perftests.quarkus.rest.endpoint850.schema.Schema850;

final class Mapper {
    private Mapper() {}

    public static Schema850 of(Model850 model) {
        return new Schema850(model.id(), model.value());
    }
}
