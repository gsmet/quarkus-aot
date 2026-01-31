package fr.spacefox.perftests.quarkus.rest.endpoint629;

import fr.spacefox.perftests.quarkus.core.service629.model.Model629;
import fr.spacefox.perftests.quarkus.rest.endpoint629.schema.Schema629;

final class Mapper {
    private Mapper() {}

    public static Schema629 of(Model629 model) {
        return new Schema629(model.id(), model.value());
    }
}
