package fr.spacefox.perftests.quarkus.rest.endpoint438;

import fr.spacefox.perftests.quarkus.core.service438.model.Model438;
import fr.spacefox.perftests.quarkus.rest.endpoint438.schema.Schema438;

final class Mapper {
    private Mapper() {}

    public static Schema438 of(Model438 model) {
        return new Schema438(model.id(), model.value());
    }
}
