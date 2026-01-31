package fr.spacefox.perftests.quarkus.rest.endpoint591;

import fr.spacefox.perftests.quarkus.core.service591.model.Model591;
import fr.spacefox.perftests.quarkus.rest.endpoint591.schema.Schema591;

final class Mapper {
    private Mapper() {}

    public static Schema591 of(Model591 model) {
        return new Schema591(model.id(), model.value());
    }
}
