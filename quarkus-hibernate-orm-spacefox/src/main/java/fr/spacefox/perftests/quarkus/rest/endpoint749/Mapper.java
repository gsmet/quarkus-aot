package fr.spacefox.perftests.quarkus.rest.endpoint749;

import fr.spacefox.perftests.quarkus.core.service749.model.Model749;
import fr.spacefox.perftests.quarkus.rest.endpoint749.schema.Schema749;

final class Mapper {
    private Mapper() {}

    public static Schema749 of(Model749 model) {
        return new Schema749(model.id(), model.value());
    }
}
