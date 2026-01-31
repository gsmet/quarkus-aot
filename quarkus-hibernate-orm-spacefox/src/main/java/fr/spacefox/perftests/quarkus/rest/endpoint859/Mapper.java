package fr.spacefox.perftests.quarkus.rest.endpoint859;

import fr.spacefox.perftests.quarkus.core.service859.model.Model859;
import fr.spacefox.perftests.quarkus.rest.endpoint859.schema.Schema859;

final class Mapper {
    private Mapper() {}

    public static Schema859 of(Model859 model) {
        return new Schema859(model.id(), model.value());
    }
}
