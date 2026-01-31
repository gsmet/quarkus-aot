package fr.spacefox.perftests.quarkus.rest.endpoint617;

import fr.spacefox.perftests.quarkus.core.service617.model.Model617;
import fr.spacefox.perftests.quarkus.rest.endpoint617.schema.Schema617;

final class Mapper {
    private Mapper() {}

    public static Schema617 of(Model617 model) {
        return new Schema617(model.id(), model.value());
    }
}
