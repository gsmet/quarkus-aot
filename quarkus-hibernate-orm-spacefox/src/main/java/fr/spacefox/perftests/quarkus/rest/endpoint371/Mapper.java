package fr.spacefox.perftests.quarkus.rest.endpoint371;

import fr.spacefox.perftests.quarkus.core.service371.model.Model371;
import fr.spacefox.perftests.quarkus.rest.endpoint371.schema.Schema371;

final class Mapper {
    private Mapper() {}

    public static Schema371 of(Model371 model) {
        return new Schema371(model.id(), model.value());
    }
}
